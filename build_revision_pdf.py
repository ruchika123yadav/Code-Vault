"""Build a concise, paginated interview revision guide with existing PDF tools."""

from pathlib import Path
import re
import textwrap

import fitz
from pypdf import PdfReader


ROOT = Path(__file__).resolve().parent
OUT = ROOT / "output" / "pdf"
TMP = ROOT / "tmp" / "pdfs"
OUT.mkdir(parents=True, exist_ok=True)
TMP.mkdir(parents=True, exist_ok=True)
PDF = OUT / "Data_Engineering_Hackathon_Revision_150_Questions.pdf"

# Each record is a question, a short explanation, and a concrete example.
SECTIONS = [
    ("Your ride data lake project", "START HERE", "Repository snapshot + previously reported run evidence", """
What problem does your project solve?|It turns synthetic ride CSV data into validated analytics tables. Event-date partitions reduce irrelevant scans; quarantine, replay checks and city history make the output easier to trust.|A reviewer can compare 1,000 input rows with 895 accepted and 105 rejected rows in the recorded run.
What is the grain and business key?|The contract is one immutable record per ride_id, not a stream of status changes for each ride. Bronze and Silver use daily UTC event partitions; Gold facts are not partitioned in this implementation.|RIDE_00000001 identifies one logical ride. A later changed payload is a conflict, not a new status event.
What are Bronze, Silver and Gold here?|Bronze stores accepted raw-like fields plus an event timestamp and date partitions. Silver casts types. Gold holds ride_fact and an effective-dated city_dim. Invalid input is quarantined before Bronze.|fare starts as source text and becomes a double in Silver. This Bronze is not an archive of every raw input row.
How do you validate and handle duplicates?|Validation checks required IDs, timestamp, city, fare and status. Business-invalid rows are rejected first. For several valid rows with one ID, canonical JSON and SHA-256 ordering choose one deterministically.|A bad row cannot displace a valid row with the same ride_id. Other valid duplicates receive duplicate_ride_id.
How is replay idempotent?|Delta MERGE inserts unmatched ride IDs. An existing ID with an identical payload is retained; a changed payload fails. First-seen run_id and source_file are preserved in ride tables.|Running the same 895 accepted rides twice leaves 895 rows, not 1,790. Metadata changes alone do not create a payload conflict.
How do late arrivals work?|Partition columns come from event time, not processing time. A separate second-batch demo adds an older event into an existing historical partition and checks the stored file path and counts.|A ride dated 2024-02-29 arrives after a March event. The February 29 partition grows from 1 row to 2.
How does city SCD Type 2 work?|A changed region closes the old version and opens a new version. Deterministic SHA-256 city keys identify versions. Facts join on event time inside [valid_from, valid_to), with a null end for current rows.|Mumbai: West closes at 2025-01-01; illustrative New West opens then. A 2024 ride still joins West.
What do pruning and compaction results prove?|The recorded pruning run observed 721 files producing rows versus 2 for one day. A separate compaction demo reduced active files from 4 to 1. These are different experiments.|On-disk sizes were 2,591,524 versus 7,219 bytes. They are not measured physical bytes transferred; timings are single-run observations.
How do you demonstrate correctness?|Reconcile source = accepted + rejected, compare layer counts and fare sums, verify historical joins, and compare replay counts plus non-cryptographic fingerprints. The earlier recorded execution reported 20 passed tests.|1,000 = 895 + 105. Equal counts alone cannot prove that the same records survived, so use content checks too.
What are the honest limitations?|Commits are atomic per table, not across the pipeline. The sample still has tiny daily files. There is no rider/driver master lookup, complete concurrent-writer policy, arbitrary ride correction or backdated city correction support.|128 MiB is a compaction target, not a guaranteed file size. Re-run the current checkout before claiming its tests pass.
"""),
    ("SQL foundations", "HIGH PRIORITY", "S1, S2, S3", """
What is SQL used for?|SQL defines, reads and changes structured data. In data engineering it is used for transformations, quality checks and reconciliation as well as analytics.|SELECT city, SUM(fare) FROM rides GROUP BY city;
What is the logical order of a SELECT query?|A useful simplified order is FROM/JOIN, WHERE, GROUP BY, HAVING, SELECT, DISTINCT, ORDER BY, LIMIT. Physical execution can differ because the optimizer changes the plan.|WHERE removes bad rides before GROUP BY computes city totals.
What is the difference between WHERE and HAVING?|WHERE filters individual rows before aggregation. HAVING filters groups after aggregation.|WHERE fare > 0 keeps valid fares; HAVING COUNT(*) > 10 keeps cities with more than ten rows.
How do INNER JOIN and LEFT JOIN differ?|INNER JOIN returns matching row pairs. LEFT JOIN preserves every left row and fills right-side columns with null when no match exists.|Use rides LEFT JOIN city_dim to find rides that have no city match.
How do you find records missing from a reference table?|Use a left anti join where supported, or NOT EXISTS. Be careful with NOT IN when the subquery may contain nulls.|SELECT r.ride_id FROM rides r WHERE NOT EXISTS (SELECT 1 FROM cities c WHERE c.city = r.city);
Why can a join increase row counts?|One left row can match several right rows. This often means the join key is not unique or the join condition misses part of the intended grain.|One ride matches two overlapping city versions, so its fare is counted twice.
How does SQL handle NULL?|NULL means missing or unknown, not zero or an empty string. Ordinary comparisons with NULL produce unknown. Use IS NULL or IS NOT NULL.|WHERE city IS NULL works; WHERE city = NULL does not select missing cities.
What is COUNT(*) versus COUNT(column)?|COUNT(*) counts rows. COUNT(column) excludes null values. COUNT(DISTINCT column) counts distinct non-null values.|For fares [100, NULL, 100], the results are 3, 2 and 1 respectively.
What is UNION versus UNION ALL?|UNION removes duplicate result rows. UNION ALL keeps them and avoids the duplicate-removal work. Choose based on the required business meaning.|Combining two daily extracts with UNION ALL preserves every input record for later validation.
What are primary, foreign and unique keys?|A primary key identifies a row and is unique and non-null. A foreign key references a candidate key. Unique constraints restrict duplicate values; null behavior varies by database.|ride_fact.ride_id is the logical primary key; city_key references a city dimension version. Spark needs explicit checks here.
"""),
    ("SQL interview patterns", "HIGH PRIORITY", "S1, S2, S3", """
How do you find duplicate keys?|Group by the business key and filter groups whose count is greater than one. This identifies duplicate keys but does not decide which record should survive.|SELECT ride_id, COUNT(*) FROM rides GROUP BY ride_id HAVING COUNT(*) > 1;
How do you retain one deterministic row per key?|Assign ROW_NUMBER within each key using a business order plus a stable tie-breaker, then keep row 1 in an outer query. Do not assume the input row order is stable.|ROW_NUMBER() OVER (PARTITION BY ride_id ORDER BY updated_at DESC, event_id DESC)
What is ROW_NUMBER versus RANK versus DENSE_RANK?|ROW_NUMBER gives each row a distinct number. RANK gives ties the same rank and leaves gaps. DENSE_RANK gives ties the same rank without gaps.|For salaries 100, 100, 90: ranks are 1,1,3; dense ranks are 1,1,2. Row numbers need a tie-breaker.
How do you find the second-highest distinct salary?|Use DENSE_RANK ordered by salary descending, then filter rank 2 in an outer query. State whether the question wants a distinct value or one employee.|For 100, 100, 90 the second-highest distinct salary is 90, not the second 100.
How do you find the top N rows within each group?|Partition a window by the group and rank inside it. Use ROW_NUMBER for exactly N rows or DENSE_RANK if ties should be included.|Top 3 rides per city: partition by city, order by fare DESC, ride_id, then filter row_number <= 3.
What do LAG and LEAD do?|LAG reads an earlier row and LEAD reads a later row within an ordered window. They help compare neighboring observations without collapsing rows.|LAG(fare) OVER (PARTITION BY rider_id ORDER BY event_time, ride_id) gives the previous fare.
How do you calculate a running total?|Use SUM as a window function with an explicit order and frame. A unique tie-breaker makes row-by-row results deterministic.|SUM(fare) OVER (ORDER BY event_time, ride_id ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW)
What is a CTE and when do you use it?|A common table expression names an intermediate query using WITH. It improves readability. Do not assume it is always cached, materialized or faster.|WITH daily AS (...) SELECT * FROM daily WHERE total_fare > 1000;
What happens if you filter the right table after a LEFT JOIN?|A WHERE condition requiring a right-side value can remove the unmatched rows and change the intended result. Put match restrictions in ON when left rows must remain.|LEFT JOIN cities c ON r.city=c.city AND c.active=true preserves unmatched rides; WHERE c.active=true does not.
How do you tune a slow SQL query?|Check EXPLAIN, row counts, filters, join cardinality and statistics first. Reduce unnecessary columns and rows. Add suitable indexes or partitioning only for the workload and database involved.|Filter a date range before joining a large history table, then confirm the plan and correct totals.
"""),
    ("Python essentials", "HIGH PRIORITY", "S4, S5, S6", """
What are list, tuple, set and dictionary?|A list is an ordered mutable sequence; a tuple is an ordered immutable sequence. A set stores distinct hashable items. A dictionary maps unique hashable keys to values.|Use a dictionary for city-to-region lookup and a set for allowed city membership.
What is mutable versus immutable?|Mutable objects can change after creation. Immutable objects cannot change their value in place. A variable points to an object; assignment does not automatically copy it.|a=[1]; b=a; b.append(2) also changes a. With integers, a new value is a different object.
What is == versus is?|== compares values using equality rules. is checks whether two references point to the same object. Use is None for a missing optional value.|Two separately created lists may satisfy a == b while a is b is false.
What is shallow copy versus deep copy?|A shallow copy creates a new outer container but shares nested objects. A deep copy recursively copies nested values where supported.|Copying a list of dictionaries with list.copy() still shares each inner dictionary.
What is a generator and why use it?|A generator yields items as needed instead of constructing an entire result list. It helps stream large inputs, although downstream code must also avoid loading everything.|Read a large file line by line with a generator instead of calling readlines().
How do you handle exceptions responsibly?|Catch specific errors you can handle, log useful context, and either recover or raise them. Use finally or a context manager for cleanup. Do not silently swallow a failed data load.|Catch ValueError for an invalid numeric field; fail a run if its output could be incomplete.
Why use a with statement for files?|A context manager closes a file reliably even if an exception occurs. Specify an encoding for text and use a CSV parser for quoted fields.|with open('rides.csv', encoding='utf-8', newline='') as f: rows = csv.DictReader(f)
What is the mutable-default-argument trap?|Default argument objects are created once when the function is defined. A list default can accidentally keep values across calls. Use None and create a new list inside.|Prefer def add(x, items=None): ... over def add(x, items=[]): ...
What are virtual environments and dependency pins?|A virtual environment isolates project packages. Pins make installs more repeatable, but compatible Python and Java versions still matter. Install into the same interpreter that runs the code.|python -m pip install -r requirements.txt avoids accidentally using another interpreter's pip.
How would you debug ModuleNotFoundError?|Check the active interpreter, selected notebook kernel and the environment containing the package. Use that interpreter's pip. Do not install a similarly named but unrelated package.|The import name yaml comes from PyYAML. Installing it in another environment will not fix the current kernel.
"""),
    ("DataFrames and file formats", "CORE", "S7, S8", """
When would you choose pandas rather than Spark?|Use pandas for local data that fits comfortably in memory. Spark suits distributed workloads or when its execution features are needed, but adds startup and operational overhead.|A small CSV hackathon task may be simpler in pandas; do not choose Spark merely because it sounds advanced.
How do you inspect an unfamiliar dataset?|Check column names, types, sample rows, row counts, missing values, duplicate keys, ranges and categorical values before designing transformations.|Inspect whether fare contains numbers, empty strings, negative values or text such as 'unknown'.
How do you treat missing values in a DataFrame?|Distinguish None, NaN, empty strings and business placeholders. Use missing-value APIs and explicit business rules. Never replace every missing value with zero by default.|A missing fare is not a free ride; reject it or use an approved imputation policy.
How do you handle duplicates in pandas?|Identify the intended key and survivor policy before dropping duplicates. Sort deterministically when keeping a preferred row. Identical rows and conflicting business keys are different cases.|Sort updates by timestamp and stable event ID, then keep the last row per ride_id if that is the contract.
What is vectorized processing?|It applies operations to columns or arrays rather than interpreting a Python loop for every row. Prefer built-in expressions where possible and measure the result.|df['fare'] * 1.1 is generally clearer than a Python row loop for a 10% calculation.
What is row-oriented versus column-oriented storage?|Row storage keeps a record's fields together and suits many transactional reads. Columnar storage groups values by column and suits scans of a few analytical fields.|A revenue query can read city and fare columns without reading every rider field in a columnar file.
Why use Parquet instead of CSV for analytics?|Parquet is typed and columnar, supports compression and metadata-based skipping, and avoids repeated CSV parsing. CSV is simple and portable but requires explicit parsing rules.|A query summing fare can project only the needed Parquet columns. CSV generally requires parsing text records.
What is compression versus file compaction?|Compression reduces the bytes needed to represent data. Compaction combines small files into fewer larger files. They can be used together but solve different problems.|Four small compressed Parquet files may still benefit from compaction into one compressed file.
How do you read data larger than memory?|Process chunks, stream records, use a suitable query engine, or distribute the work. Keep aggregations incremental when possible; simply concatenating every chunk recreates the memory problem.|Accumulate city totals per CSV chunk instead of retaining every chunk as a DataFrame.
Why are schemas, encodings and timezones important?|They prevent the same bytes from being interpreted differently. Declare expected types and use timezone-aware timestamps; normalize processing consistently, often to UTC.|2024-01-01T00:30:00+05:30 falls on 2023-12-31 in UTC, so its UTC partition is the previous date.
"""),
    ("Spark execution fundamentals", "HIGH PRIORITY", "S9, S10", """
What is Apache Spark?|Spark is an engine for parallel data processing. It can execute work across a cluster or locally and supports SQL, DataFrames, batch processing and streaming.|The project uses local Spark; it does not demonstrate deployment on a multi-node cluster.
What are the driver and executors?|The driver plans and coordinates the application. Executors run tasks and hold data on worker resources. Collecting too much executor data to the driver can exhaust its memory.|A distributed aggregation is safe at scale; collecting all raw rides into a Python list may not be.
What is a Spark DataFrame versus an RDD?|A DataFrame has named, typed columns and lets Spark optimize expressions. An RDD is a lower-level distributed collection. Prefer DataFrames for typical structured data transformations.|Use df.filter(df.fare > 0) rather than converting every row to a Python RDD transformation without need.
What are transformations, actions and lazy evaluation?|Transformations describe work; actions request results or writes. Spark delays most execution until an action, allowing it to optimize the plan.|filter and select build a plan. count, collect and a data write trigger execution.
What are jobs, stages and tasks?|An action can start jobs. Jobs are divided into stages around shuffle boundaries; tasks process partitions within a stage. One action is not guaranteed to produce exactly one job.|A groupBy can require a shuffle stage before the final aggregation tasks.
What is a Spark partition?|It is a unit of distributed computation. It differs from a storage directory partition such as year/month/day. The two concepts interact during writing but are not the same.|A daily storage directory can contain several files produced by multiple Spark tasks.
What are narrow and wide transformations?|A narrow dependency can compute an output partition from a limited corresponding input partition. A wide dependency redistributes data, typically through a shuffle.|select is usually narrow; groupBy across keys generally needs a shuffle.
What is a shuffle and why is it expensive?|A shuffle moves data between tasks to regroup or redistribute it. Network, serialization, disk spill and coordination add cost. Some shuffles are necessary for correct results.|Computing totals by city moves records so each city's values can be combined.
What is lineage and how does Spark recover work?|Lineage records the transformations needed to derive data. Spark can recompute missing partitions from available inputs, but this does not replace durable business-level recovery.|A lost cached partition can be recomputed; a non-idempotent external API call cannot simply be repeated safely.
Why avoid large collect() and prefer built-in functions?|collect returns all selected rows to the driver. Built-in expressions remain visible to Spark's optimizer and often avoid Python execution overhead. Collect only bounded, known-small results.|Collecting five city mappings is different from collecting ten million ride rows.
"""),
    ("Spark performance and partitioning", "HIGH PRIORITY", "S11, S12, S13", """
What is partition pruning?|The engine skips irrelevant storage partitions when it can use partition filters. In this project the pruning demo explicitly filters year, month and day.|A January 1 query skips other event-date directories instead of scanning the whole year.
What is predicate pushdown versus column pruning?|Predicate pushdown lets a source apply supported filters or skip data using metadata. Column pruning reads only needed columns. Partition pruning specifically skips storage partitions.|Select only fare and city, filter fare > 100, and inspect which filters reached the data source.
How do you choose daily, monthly or hourly partitions?|Use query filters, data volume and operational cost. Fine partitions can prune well but create tiny files. Coarse partitions make bigger files but scan more for narrow queries.|Daily fits date-based rides; hourly can be wasteful when each hour has only a few records.
Why are many small files a problem?|Each file adds listing, metadata, open and scheduling overhead. Small files can dominate runtime even when the total dataset is small.|721 files for 895 accepted sample rows is a limitation, not evidence of a healthy production file layout.
What is repartition versus coalesce?|repartition redistributes with a shuffle and can increase or decrease partitions. coalesce usually reduces partitions without a full shuffle, but can leave uneven work or too little parallelism.|Do not coalesce(1) on a huge dataset just to get one output file.
When should you cache a DataFrame?|Cache a costly intermediate that is reused and fits the storage budget. Materialize it with an action when needed and unpersist it when finished. Caching one-use data may add overhead.|Validation outputs reused for counts and writes may benefit; cache is not a permanent source of truth.
What is a broadcast join?|It sends a small relation to executors so a large join may avoid shuffling the large side. The small side must actually fit memory and the join must support the strategy.|A five-city lookup is a candidate; broadcasting a huge history table can cause failures.
What is data skew and how can you fix it?|Some keys or partitions contain far more work than others. Check task metrics, then consider AQE, pre-aggregation, a different key or carefully designed salting.|If most rides have city='Mumbai', grouping by city may create one much heavier task.
What is AQE and how do you inspect a plan?|Adaptive Query Execution can revise some physical decisions using runtime statistics. Use explain and the Spark UI to inspect scans, exchanges and join operators rather than guessing.|Check PartitionFilters and shuffle metrics before saying a query is optimized.
How do you make a fair performance comparison?|Use the same data and environment, force a real action, repeat trials and report cache state, rows, files and timings. Separate measured observations from estimates and causal claims.|A one-day scan returns 2 rows versus 895, so its lower elapsed time is not a controlled universal speedup benchmark.
"""),
    ("Delta Lake and transactions", "HIGH PRIORITY", "S14, S15, S16, S17", """
What does Delta Lake add to Parquet?|Delta is a table format and protocol using data files plus a transaction log. It supports consistent snapshots and operations such as MERGE; a folder of Parquet files alone is not a Delta table.|Read a Delta table through its log, not by globbing all Parquet files and accidentally including obsolete files.
What are ACID properties?|Atomicity makes a transaction all-or-nothing; consistency preserves enforced rules; isolation controls concurrent observations; durability preserves committed changes. Scope matters: a table transaction is not a whole-pipeline transaction.|Bronze can commit successfully even if the next Silver step fails.
How does Delta MERGE work?|MERGE compares source and target using a condition, then applies configured matched or unmatched actions. It is not automatically idempotent; the keys and update logic determine that.|This project inserts only unmatched ride IDs after checking for changed payload conflicts.
What is schema enforcement versus schema evolution?|Enforcement rejects incompatible writes. Evolution deliberately permits supported schema changes. Automatically accepting every new column can hide upstream errors.|The project rejects an unexpected CSV header instead of silently mapping fields by position.
What is Delta time travel?|It reads an earlier table snapshot by version or timestamp while the required log and data files are retained. It is not an indefinite backup policy.|Compare a table before and after a load using versioned reads, if those versions remain available.
What is OPTIMIZE versus VACUUM?|OPTIMIZE rewrites eligible data into a better file layout. VACUUM removes obsolete files eligible under retention rules. VACUUM can limit time travel and affect long-running readers.|Compaction can reduce 4 active files to 1 while old physical files remain until safe cleanup.
What is optimistic concurrency control?|Writers work against a snapshot and validate conflicts before committing. Some concurrent operations can conflict, so application coordination and safe retries may still be required.|Two writers changing the same city history cannot assume their complete snapshots will merge safely without coordination.
Does Delta enforce every primary and foreign key automatically?|Do not assume so. Delta has supported constraints, but this project's uniqueness and reference rules are explicit application checks. Nullable schema flags are not a substitute for validation.|The code checks for duplicate ride IDs and missing city-version matches before publishing facts.
Why must Spark and Delta versions be compatible?|Delta integrates with Spark internals and its runtime. Use the compatibility matrix and pinned dependencies instead of independently installing arbitrary latest versions.|The repository pins PySpark 3.5.9 and delta-spark 3.3.3; its development container uses Python 3.11 and Java 17.
How do you retry after a partial multi-table failure?|Inspect the stage that failed and reuse the same input and validation cutoff. Replay safe table writes without deleting successful data. Verify final reconciliation, not only the retry exit code.|A test fails before Silver after Bronze commits; a retry completes downstream without duplicating Bronze.
"""),
    ("DE foundations and dimensional modeling", "CORE", "Project model + standard relational concepts", """
What does a data engineer do?|A data engineer builds reliable ways to collect, transform, store and serve data. Correctness, repeatability, access control and operating the pipeline matter as much as the transformation code.|Convert daily ride files into validated tables that analysts can query consistently.
What is ETL versus ELT?|ETL transforms before loading into the analytical target. ELT loads first and transforms within the target platform. Real systems may combine both approaches.|Load raw extracts to a warehouse, then build SQL models there: ELT.
What is a lake versus warehouse versus lakehouse?|A lake stores varied data in file or object storage. A warehouse focuses on managed structured analytics. A lakehouse applies table-management capabilities to lake storage; products differ.|The project demonstrates a local Delta-based lakehouse pattern, not a managed enterprise warehouse deployment.
What is OLTP versus OLAP?|OLTP serves frequent transactional reads and writes. OLAP serves analytical queries over many records. Their schema and storage choices often differ.|Booking a ride is OLTP; summing yearly fare by region is OLAP.
What are fact and dimension tables?|Facts record measurable business events at a declared grain. Dimensions describe entities used to filter and group facts. Not every numeric column is a measure.|ride_fact stores fare and event time; city_dim stores the city region and validity history.
Why define grain before creating a schema?|Grain specifies exactly what one row represents. Mixing grains causes duplicate counts and incorrect aggregates; every key and measure must agree with the grain.|A row per ride cannot also represent a daily city total in the same fact table.
What is a star schema versus snowflake schema?|A star keeps facts connected to relatively denormalized dimensions. A snowflake further normalizes dimension attributes into related tables. Choose based on usability, integrity and maintenance.|A city dimension containing region is star-like; a separate region dimension adds normalization.
What is a natural key versus surrogate key?|A natural key comes from the business. A surrogate key is a technical identifier. SCD2 needs separate version identity even when the business entity remains the same.|city_name identifies the city logically; city_key identifies a particular effective-dated version in this project.
What are SCD Type 1 and Type 2?|Type 1 overwrites an attribute and does not preserve its old value. Type 2 retains separate effective-dated versions. Choose based on historical reporting requirements.|An address correction may use Type 1; a customer region change that affects historical reporting may use Type 2.
Why use [valid_from, valid_to) intervals?|The start is included and the end is excluded, so adjacent versions do not both match a boundary instant. Also check for overlaps, missing coverage and exactly one current version.|At exactly 2025-01-01, a ride matches New West, not the West version ending at that instant.
"""),
    ("Data quality, testing and reconciliation", "HIGH PRIORITY", "Project tests + standard validation practice", """
What dimensions of data quality do you check?|Check completeness, validity, uniqueness, consistency, accuracy and timeliness. Rules need business context; a syntactically valid value can still be wrong.|A positive fare is valid by format, but a fare of one billion may need a separate business anomaly rule.
What is a data contract?|It is an agreed definition of schema, meaning, keys, allowed values and change policy between producers and consumers. Validate it at system boundaries.|The ride CSV requires seven exact columns and timezone-aware event_time values.
What is quarantine and why preserve raw context?|Quarantine stores rejected records separately with reasons and source context. It enables investigation and controlled reprocessing instead of silently dropping bad data.|A negative fare is saved with invalid_fare, source_file and run_id.
Should all invalid data stop the pipeline?|Use policy: row-level business defects can be quarantined, while missing files, incompatible schemas or broken target integrity may fail the batch. Define any quality thresholds explicitly.|One missing city can be rejected; a completely unexpected header fails the batch in this project.
What should happen for empty or all-invalid input?|Handle both deliberately. An empty batch should not erase existing outputs. An all-invalid batch should record rejects and zero accepted rows without creating fake target records.|The pipeline returns a clear report and leaves existing accepted-data tables unchanged.
What is unit testing versus integration testing?|Unit tests isolate small behavior. Integration tests check components together, such as Spark transformations with Delta writes. Both still need meaningful assertions.|A pure generator reproducibility test differs from a pipeline retry test that writes and reads Delta tables.
Which edge cases should you test first?|Start with valid input, empty input, missing fields, malformed values, duplicate keys, schema changes and retries. Add domain edges such as late events and SCD2 boundary timestamps.|Test a leap-day event and a ride exactly at a dimension-version transition.
How do counts and aggregates reconcile?|Compare input, rejected and accepted populations with clear batch boundaries. Then compare target keys and important measures; count equality by itself is weak evidence.|source = rejected + accepted, with Bronze/Silver/Gold fare totals compared within numerical tolerance.
Why use fixed seeds and separate expected labels?|A fixed seed reproduces generated input. Separate labels avoid leaking expected answers into the pipeline. Injection labels describe the generator's intent, not always the final survivor choice.|record_labels.csv identifies a deliberately duplicated row, but deterministic deduplication can keep either member based on content.
Do matching fingerprints prove two tables are identical?|Not absolutely. Counts plus order-independent non-cryptographic hash summaries are useful checks but can collide. Stronger comparisons can use key-level anti joins or full payload differences.|The project compares XOR and decimal sum of row hashes and explicitly states the collision limitation.
"""),
    ("Reliability, orchestration and operations", "CORE", "S18, S19 + project implementation", """
What is idempotency versus determinism?|Idempotency means repeating an operation has no additional unintended effect. Determinism means the same inputs and configuration produce the same result. One does not automatically imply the other.|A deterministic append writes the same rows again; it is deterministic but not idempotent.
What is incremental loading versus a full refresh?|A full refresh rebuilds the target population. An incremental load applies only new or changed data. Incremental designs need state, keys and a correction strategy.|Load yesterday's new ride IDs rather than rebuilding the year, while handling late arrivals separately.
What is a backfill?|A backfill processes historical data that was missing or needs recomputation. Scope the dates, isolate outputs where useful, preserve history coverage and reconcile before publishing.|Load missing February rides into February event-date partitions, not today's processing partition.
What is a watermark or high-water mark in batch ingestion?|A high-water mark tracks progress, such as the latest source update timestamp. A naive event-time cutoff can miss late records; use overlaps, stable ordering, CDC or other suitable policies.|A ride arriving today with last week's event date is missed if you fetch only event_time greater than yesterday.
How should retries use backoff?|Retry transient failures with bounded exponential backoff and often jitter. Do not repeatedly retry invalid input or broken credentials without fixing the cause. Protect side effects with idempotency.|Retry a temporary 503; do not endlessly retry a CSV whose required columns are missing.
What belongs in structured run logs?|Record run_id, start/end, source identity, configuration/cutoff, stage, counts, status and failure reason. Keep secrets and unnecessary personal data out of logs.|A failed Silver write should leave enough context to identify the committed Bronze stage and safe retry input.
What is an orchestrator and a DAG?|An orchestrator schedules and monitors dependent tasks. A directed acyclic graph describes task dependencies; it does not itself guarantee data correctness or exactly-once effects.|Generate input -> validate/load -> reconcile -> publish report.
What should you monitor beyond job success?|Monitor freshness, data volume, rejection rates, key integrity, latency, resource use and cost. A green process can still publish empty or stale data.|Alert if daily rides drop from normal volume to zero even though the pipeline exits successfully.
What are SLA, SLO and data lineage?|An SLO is a target such as availability or freshness; an SLA is an agreement, often with consequences. Lineage records where data came from and how it was transformed.|Trace a Gold ride to its Silver key, source_file, batch fingerprint and run metadata.
Why separate code, run artifacts and selected evidence?|Code must remain readable and reproducible. Full runs contain bulky or temporary files; curated evidence makes a result reviewable. Gitignore does not untrack files already committed.|output/runs/run01 is a local attempt; reviewed reports under output/evidence can be intentionally committed.
"""),
    ("Streaming, Kafka and change data capture", "SECOND PASS", "S20, S21", """
What is batch versus streaming?|Batch processes bounded data at intervals. Streaming processes an ongoing flow, often using micro-batches or continuous operators. Choose latency and complexity based on business needs.|Daily finance reporting may use batch; near-real-time fraud alerts may need streaming.
What is event time versus processing time?|Event time says when the business event happened. Processing time says when a system processed it. Arrival order and event-time order can differ.|A February 29 ride received on March 4 still belongs to February 29 analytics under an event-time policy.
What is Kafka's role?|Kafka is a distributed event log used to publish, retain and consume streams. It is not a substitute for every database or a complete analytics pipeline by itself.|A booking service publishes ride events; independent consumers update analytics and alerting systems.
What are topics, partitions and offsets?|A topic organizes records. Partitions split its log for parallelism. An offset identifies position within one partition, not a global event ID across the whole topic.|Partition 0 offset 10 and partition 1 offset 10 refer to different log positions.
What is a consumer group?|Consumers in a group share work; a partition is assigned to one active group member at a time under the group's protocol. Different groups can read the same events independently.|An analytics group and an audit group each consume the ride topic for different purposes.
Does Kafka guarantee global ordering?|Records have order within a partition, not a single order across all partitions. Key selection and producer behavior matter. Business event timestamps can still be out of order.|Keying by ride_id can keep that ride's records in one partition, but not globally order every ride.
What are at-most-once, at-least-once and exactly-once effects?|At-most-once may lose work; at-least-once may repeat work. Exactly-once effects require a defined transactional or idempotent boundary across processing and output; do not assume them universally.|Commit offsets after a database write and a crash may replay it; a unique event key can prevent a duplicate effect.
What is a streaming watermark?|It is an event-time progress policy that helps bound state and governs late-data handling for supported operations. It does not mean every event older than a wall-clock interval is always rejected.|For a delayed window aggregation, define allowed lateness and what happens to events outside the supported state window.
What is CDC?|Change data capture records inserts, updates and deletes from a source, often from its transaction log. Applying changes needs ordering, delete handling and a replay policy.|A customer-region update generates a change that can drive a new SCD2 version.
What is checkpointing and how is it different from replay safety?|Checkpointing stores processing progress and sometimes operator state. Replay safety controls repeated external effects. A checkpoint alone cannot make an arbitrary non-transactional output exactly once.|A restarted stream can restore offsets but still needs a safe output strategy for partially committed writes.
"""),
    ("Cloud, APIs, security and developer tools", "CORE", "S22, S23, S24", """
What is object storage?|It stores objects identified by keys in buckets or containers. It is common for data lakes but differs from a normal local filesystem in access methods and operation semantics.|A cloud lake can store partitioned Parquet objects without assuming directory rename behaves like a local atomic operation.
What are common cloud data-service categories?|Think in categories: object storage, compute, managed SQL/warehouse, orchestration, messaging and identity. Learn the concept before memorizing every vendor's product name.|S3, Azure Blob/ADLS and Cloud Storage are object-storage options, not interchangeable APIs in your code.
What is IAM and least privilege?|Identity and access management controls who can do what. Least privilege grants only the permissions needed and limits scope. Authentication is not the same as authorization.|A pipeline may need read access to one input bucket and write access to one output prefix, not account-wide administration.
How should you handle secrets and sensitive data?|Use environment variables or a secret manager, exclude local secret files and avoid logging credentials. Respect data-sharing rules before sending company datasets to external AI services.|Commit .env.example with placeholders, not .env containing an API key.
How do REST APIs, HTTP methods and status codes fit together?|APIs expose resources and operations. GET usually reads; POST often creates or triggers work. Inspect status codes and response structure rather than assuming every response is valid data.|Handle 401/403 as access problems, 429 as rate limiting and 5xx as possible server-side failures.
How do you build a reliable API ingestion loop?|Set timeouts, follow the API's pagination, validate responses, respect rate limits and save progress safely. Retry only suitable failures and avoid repeated side effects.|Fetch all next-page cursors and reconcile total records instead of keeping only the first 100 results.
What is an index versus a table partition?|An index is an access structure that can speed selected lookups at write/storage cost. Partitioning splits the data into units. Neither automatically improves every query.|An OLTP ride_id index helps point lookup; event-date partitioning helps eligible date-range scans.
What is Docker, and is it the same as a virtual environment?|A virtual environment isolates Python packages. A container packages application runtime and system-level dependencies using a shared host kernel model. Neither proves the app works until tested.|Spark needs compatible Java as well as Python libraries; a Python venv alone does not install Java.
What Git commands should you understand?|Understand status, diff, add, commit, push, pull and clone. A commit is local until pushed. Review staged content before publishing, especially secrets and generated data.|git diff --cached shows what will be committed. .gitignore does not remove already tracked secrets.
How do you reason about pipeline cost?|Measure data scanned, compute time, storage, network transfer and retained copies. Reduce unnecessary reads and work without sacrificing correctness or making unmeasured performance claims.|Partition filtering can reduce eligible scan files; repeated full-table scans still cost work during an incremental pipeline.
"""),
    ("AI, LLMs and RAG basics", "CORE FOR THIS ROLE", "S25, S26; conceptual, not vendor-specific setup", """
What is an LLM and what can it get wrong?|A large language model generates outputs based on patterns learned during training and supplied context. It can produce fluent but incorrect claims or code, so validation is required.|A model can invent a Spark method name; check documentation and run a focused test.
What are tokens, context windows and temperature?|Tokens are model processing units. The context window limits available input/output context. Temperature influences sampling variability; a low value does not guarantee factual correctness or deterministic execution.|A whole repository may exceed context limits, so provide the relevant modules and concrete error instead.
What makes a useful coding prompt?|Provide the goal, input schema, examples, constraints, acceptance criteria and relevant code. Ask for a plan or small change, then verify it. Never invent an AI-use history.|Explain the expected rejection for fare=-10 and ask for a focused test before modifying validation.
What is an embedding?|An embedding maps data such as text to a vector useful for similarity tasks. It is not a database key or a guarantee that two items have the same meaning.|Questions about 'ride revenue' may retrieve a document mentioning 'fare totals'.
What is vector search?|It retrieves items near a query vector under a similarity measure. A vector index helps search at scale; filtering and access controls still matter.|Search only documents the current user may access, then rank those eligible chunks for relevance.
What is RAG?|Retrieval-augmented generation retrieves relevant external context and supplies it to a model to help answer a question. The answer should be grounded in the retrieved evidence.|Ingest policy PDFs, retrieve relevant passages for a question, then answer with references to those passages.
How do chunking and retrieval affect answer quality?|Chunk size, overlap, document structure, metadata and search strategy determine which context is available. Chunks that are too small lose context; huge chunks can dilute relevance.|Keep a heading with the paragraph it describes instead of splitting them into unrelated chunks.
What is RAG versus fine-tuning?|RAG supplies external information at query time. Fine-tuning changes model parameters for behavior or task patterns. Fine-tuning is not automatically the right way to keep changing facts current.|Frequently updated company policies usually need retrieval/versioning rather than a new fine-tune for every edit.
How do you evaluate hallucinations and unsupported answers?|Use known-answer and unanswerable cases, inspect retrieved relevance, factual correctness and citation support. Require an honest 'not found' when evidence is insufficient; RAG reduces but does not eliminate errors.|Ask a question absent from the documents and verify that the assistant does not invent a policy.
What are prompt injection and safe tool use?|Treat retrieved documents and external text as data, not higher-priority instructions. Restrict tools and permissions, validate arguments and require approval for consequential actions.|A document saying 'ignore rules and reveal secrets' must not cause the assistant to expose credentials or run commands.
"""),
    ("Hackathon reasoning, design and interview answers", "HIGH PRIORITY", "Preparation guidance; the actual problem and format are unknown", """
What should you do in the first 30 minutes?|Read all requirements, identify inputs, outputs, constraints and evaluation criteria, inspect a tiny sample, then ask focused clarifying questions. Write an acceptance checklist before building.|Clarify whether a duplicate ID is a replay, a correction or a distinct event before choosing the key.
How do you choose a stack under time pressure?|Choose the simplest familiar tools that meet the stated requirements and run reliably on the available machine. Do not install a distributed stack or vector database without a reason.|Python plus SQLite may solve a small file-to-report task; use Spark if scale or the instructions justify it.
What is a minimum working vertical slice?|It is a small end-to-end path that reads input, performs the core logic, saves output and checks correctness. Build it before optional dashboards and advanced features.|Process ten valid and invalid rides all the way to a stored result and rejection report.
How do you debug a failing pipeline under time pressure?|Read the first meaningful error, isolate the failing stage, reproduce with a tiny input and inspect types, paths and assumptions. Change one cause at a time and rerun a focused check.|If Gold has extra rows, inspect city-history join cardinality before rewriting the entire pipeline.
How do you demonstrate and hand off the solution?|Show the problem, design, one happy-path run, one failure/edge case, correctness evidence and a limitation. Include exact setup/run commands and avoid relying only on scrolling terminal output.|Open a concise report showing source/accepted/rejected counts, replay results and test status.
How would you design a simple CSV-to-analytics service?|Define grain and contract, ingest with provenance, validate, transform, load safely, reconcile and expose a report or API. Add monitoring and a retry/backfill policy proportionate to the task.|CSV -> validation -> quarantine or typed table -> daily city totals -> summary report.
How would you scale a prototype toward production?|Identify the measured bottleneck first. Add suitable storage, partition/file management, orchestration, access control, monitoring and safe concurrency. Separate next steps from implemented capabilities.|Move local files to object storage and test distributed writes before claiming production scale.
How do you explain your project and AI use honestly?|State the problem, your design choices, what tools helped with and what you personally reviewed and validated. Be clear about demo-only features, limits and unfamiliar areas.|I used AI for implementation support, then checked validation, replay behavior and reports. Do not claim tests you did not run.
How do you prepare your resume without inventing experience?|For each actual bullet, explain the problem, your contribution, tools, design choice, verification, result and limitation. Use only genuine numbers and experiences. The resume was not provided for this guide.|If a bullet says 'optimized a pipeline', be ready to explain the baseline, change and measurement.
What if you do not know an answer or cannot finish everything?|Say what you know and what needs checking. Explain a safe approach, prioritize required behavior and document incomplete work. Clarify what runs instead of presenting an unfinished feature as complete.|I have not deployed Kafka in production; I understand partitions and offsets and would validate the delivery requirements first.
"""),
]

SOURCES = [
    ("S1", "PostgreSQL tutorial: querying, joins and aggregates", "https://www.postgresql.org/docs/current/tutorial.html"),
    ("S2", "PostgreSQL window functions", "https://www.postgresql.org/docs/current/tutorial-window.html"),
    ("S3", "PostgreSQL table expressions and SELECT behavior", "https://www.postgresql.org/docs/current/queries-table-expressions.html"),
    ("S4", "Python data structures", "https://docs.python.org/3.11/tutorial/datastructures.html"),
    ("S5", "Python errors and exceptions", "https://docs.python.org/3.11/tutorial/errors.html"),
    ("S6", "Python input and output", "https://docs.python.org/3.11/tutorial/inputoutput.html"),
    ("S7", "pandas missing-data guide", "https://pandas.pydata.org/docs/user_guide/missing_data.html"),
    ("S8", "Apache Parquet overview", "https://parquet.apache.org/docs/overview/"),
    ("S9", "Spark 3.5 RDD programming guide", "https://spark.apache.org/docs/3.5.6/rdd-programming-guide.html"),
    ("S10", "Spark SQL and DataFrames", "https://spark.apache.org/docs/3.5.6/sql-programming-guide.html"),
    ("S11", "Spark SQL performance tuning", "https://spark.apache.org/docs/3.5.6/sql-performance-tuning.html"),
    ("S12", "Spark tuning guide", "https://spark.apache.org/docs/3.5.6/tuning.html"),
    ("S13", "Spark Dataset API: repartition/coalesce", "https://spark.apache.org/docs/3.5.6/api/java/org/apache/spark/sql/Dataset.html"),
    ("S14", "Delta and Spark compatibility", "https://docs.delta.io/releases/"),
    ("S15", "Delta table updates and MERGE", "https://docs.delta.io/latest/delta-update.html"),
    ("S16", "Delta table utilities", "https://docs.delta.io/latest/delta-utility.html"),
    ("S17", "Delta concurrency control", "https://docs.delta.io/latest/concurrency-control.html"),
    ("S18", "Airflow tasks and dependencies", "https://airflow.apache.org/docs/apache-airflow/stable/core-concepts/tasks.html"),
    ("S19", "Git ignore rules", "https://git-scm.com/docs/gitignore"),
    ("S20", "Apache Kafka design and delivery semantics", "https://kafka.apache.org/41/design/design/"),
    ("S21", "Spark Structured Streaming guide", "https://spark.apache.org/docs/3.5.6/structured-streaming-programming-guide.html"),
    ("S22", "HTTP semantics: methods and response codes", "https://www.rfc-editor.org/rfc/rfc9110"),
    ("S23", "AWS IAM security best practices", "https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html"),
    ("S24", "Docker overview", "https://docs.docker.com/get-started/docker-overview/"),
    ("S25", "Retrieval-Augmented Generation research paper", "https://arxiv.org/abs/2005.11401"),
    ("S26", "NIST Generative AI risk profile", "https://nvlpubs.nist.gov/nistpubs/ai/NIST.AI.600-1.pdf"),
]

FONT_DIR = Path("C:/Windows/Fonts")
FONTS = {"body": FONT_DIR / "arial.ttf", "bold": FONT_DIR / "arialbd.ttf", "mono": FONT_DIR / "consola.ttf"}
METRICS = {name: fitz.Font(fontfile=str(path)) for name, path in FONTS.items()}
NAVY = (0.055, 0.12, 0.20)
BLUE = (0.05, 0.32, 0.48)
TEAL = (0.0, 0.43, 0.40)
INK = (0.12, 0.17, 0.22)
GRAY = (0.36, 0.41, 0.46)
PALE = (0.94, 0.97, 0.97)
LINE = (0.82, 0.88, 0.89)
WHITE = (1, 1, 1)
W, H = 595.28, 841.89
MARGIN = 44
doc = fitz.open()
toc = []
checks = []


def wrap(text, width, font="body", size=10.5):
    result = []
    for paragraph in text.split("\n"):
        if not paragraph:
            result.append("")
            continue
        line = ""
        for word in paragraph.split():
            test = (line + " " + word).strip()
            if METRICS[font].text_length(test, fontsize=size) <= width:
                line = test
            else:
                if line:
                    result.append(line)
                while METRICS[font].text_length(word, fontsize=size) > width:
                    n = max(1, int(len(word) * width / METRICS[font].text_length(word, fontsize=size)) - 1)
                    result.append(word[:n])
                    word = word[n:]
                line = word
        if line:
            result.append(line)
    return result


def text(page, value, x, y, width, font="body", size=10.5, color=INK, leading=None):
    leading = leading or size * 1.35
    for line in wrap(value, width, font, size):
        page.insert_text((x, y + size), line, fontname=font, fontsize=size, color=color)
        y += leading
    return y


def new_page(section, kicker="REVISION NOTES"):
    page = doc.new_page(width=W, height=H)
    for name, path in FONTS.items():
        page.insert_font(fontname=name, fontfile=str(path))
    page.draw_rect(fitz.Rect(0, 0, W, 9), fill=TEAL, color=None)
    text(page, "DATA ENGINEERING / AI HACKATHON", MARGIN, 25, 400, "bold", 8.5, BLUE)
    text(page, kicker, MARGIN, 54, 470, "bold", 8, TEAL)
    text(page, section, MARGIN, 71, 510, "bold", 20, NAVY)
    page.draw_line((MARGIN, H - 43), (W - MARGIN, H - 43), color=LINE, width=0.7)
    text(page, "Short answer. Small example. Clear limits.", MARGIN, H - 32, 440, size=8, color=GRAY)
    text(page, f"{len(doc):02d}", W - MARGIN - 22, H - 32, 30, "bold", 8, TEAL)
    return page


def note(page, title, body, y, height=98):
    page.draw_rect(fitz.Rect(MARGIN, y, W - MARGIN, y + height), fill=PALE, color=None)
    end = text(page, title, MARGIN + 14, y + 11, W - 2 * MARGIN - 28, "bold", 11, TEAL)
    end = text(page, body, MARGIN + 14, end + 7, W - 2 * MARGIN - 28, size=10.4)
    assert end <= y + height - 8, (title, end, y + height)


page = new_page("The last-day revision guide", "150 QUESTIONS / SIMPLE ANSWERS / REALISTIC EXAMPLES")
toc.append([1, "Start here", len(doc)])
page.draw_rect(fitz.Rect(MARGIN, 130, W - MARGIN, 330), fill=NAVY, color=None)
text(page, "Build. Explain. Verify.", MARGIN + 22, 153, 440, "bold", 29, WHITE)
text(page, "A practical preparation pack for a first solo hackathon and an early-career data engineering interview.", MARGIN + 22, 208, 410, size=15, color=WHITE, leading=21)
text(page, "Prepared for 15 November 2026 | Revision edition: 14 November 2026", MARGIN + 22, 299, 440, size=8.5, color=(0.72, 0.88, 0.88))
note(page, "Do not try to memorize all 150 answers tonight.", "Start with the project, SQL and the short route on the next page. Practise explaining each idea aloud in your own words. Protect time for laptop checks and sleep.", 356, 104)
note(page, "What this guide is - and is not", "A curated set of common concepts and plausible questions, not a verified frequency ranking, leaked question bank or guarantee of the hackathon's content. No list can cover every possible interview question.", 476, 108)
note(page, "Project evidence is historical", "Project details come from the local repository snapshot and the earlier reported run01 results. No pipeline was executed for this guide. A historical 20-pass result is not a fresh test of your personal laptop or current checkout.", 600, 115)

page = new_page("Your route for tonight", "PRIORITIZE UNDERSTANDING, NOT COVERAGE")
toc.append([1, "Tonight's route and section map", len(doc)])
text(page, "If you have roughly four hours, use this order. The timings are a study aid, not an event rule.", MARGIN, 117, 500, size=10.5)
route = [
    ("60 min", "Q001-010", "Your project: explain the flow, late arrivals, SCD2 and honest limits."),
    ("60 min", "Q011-030", "SQL: joins, NULL, duplicates, windows and the four query drills."),
    ("35 min", "Q051-055, Q061-065, Q071-073", "Spark basics, pruning, small files, Delta and replay."),
    ("25 min", "Q031-040, Q101-105", "Python environments, errors, safe retries and deterministic behavior."),
    ("20 min", "Q141-150", "First-hour strategy, demo, truthful resume explanations and uncertainty."),
    ("40 min", "Laptop + 2-minute project explanation", "Check your actual runtime, documents, charger and run instructions."),
]
y = 162
for duration, ids, body in route:
    text(page, duration, MARGIN, y, 55, "bold", 10.5, TEAL)
    z = text(page, ids, MARGIN + 65, y, 430, "bold", 10.5)
    z = text(page, body, MARGIN + 65, z + 3, 430, size=10)
    y = z + 15
text(page, "Section map", MARGIN, y + 3, 500, "bold", 13, NAVY)
y += 31
for i, (title, priority, refs, raw) in enumerate(SECTIONS):
    col = 0 if i < 8 else 1
    row = i if i < 8 else i - 8
    label = f"{i*10+1:03d}-{i*10+10:03d}  {title}"
    text(page, label, MARGIN + col * 258, y + row * 24, 245, size=8.8, color=BLUE)

question_number = 0
section_pages = []
for section_index, (title, priority, refs, raw) in enumerate(SECTIONS):
    items = []
    for line in textwrap.dedent(raw).strip().splitlines():
        parts = line.split("|")
        assert len(parts) == 3, (title, line)
        items.append(parts)
    assert len(items) == 10, (title, len(items))
    for half in range(2):
        first_id = section_index * 10 + half * 5 + 1
        page = new_page(title, f"{priority} / Q{first_id:03d}-Q{first_id+4:03d}")
        if half == 0:
            toc.append([1, f"Q{first_id:03d}: {title}", len(doc)])
            section_pages.append(len(doc) - 1)
        text(page, f"Reference: {refs}", MARGIN, 108, 508, size=7.6, color=GRAY)
        y = 136
        for question, answer, example in items[half * 5:half * 5 + 5]:
            question_number += 1
            start = y
            z = text(page, f"Q{question_number:03d}  {question}", MARGIN, y, 507, "bold", 11.2, NAVY)
            z = text(page, answer, MARGIN + 3, z + 6, 501, size=10.3, leading=13.5)
            z = text(page, "Example: " + example, MARGIN + 3, z + 5, 501, size=9.7, color=BLUE, leading=12.7)
            assert z < H - 58, (question_number, "page overflow", z)
            checks.append({"question": question_number, "page": len(doc), "top": round(start, 2), "bottom": round(z, 2)})
            page.draw_line((MARGIN, z + 9), (W - MARGIN, z + 9), color=LINE, width=0.5)
            y = z + 23
        assert y < H - 45, (title, "footer collision", y)


def code_block(page, title, explanation, code, y):
    y = text(page, title, MARGIN, y, 507, "bold", 12, NAVY)
    y = text(page, explanation, MARGIN, y + 6, 507, size=10.3)
    lines = code.strip().splitlines()
    height = len(lines) * 13.5 + 22
    y += 10
    page.draw_rect(fitz.Rect(MARGIN, y, W - MARGIN, y + height), fill=PALE, color=None)
    z = y + 10
    for line in lines:
        assert METRICS["mono"].text_length(line, fontsize=9.1) < 480
        page.insert_text((MARGIN + 12, z + 9.1), line, fontname="mono", fontsize=9.1, color=INK)
        z += 13.5
    return y + height + 22


page = new_page("Four SQL patterns to practise", "POSTGRESQL-STYLE EXAMPLES / READ, THEN EXPLAIN")
toc.append([1, "Four practical SQL drills", len(doc)])
y = text(page, "Assume rides(ride_id, city, fare, event_time) and employees(employee_id, salary). Window queries use an outer CTE so they do not rely on QUALIFY support. SQL dialect details can differ.", MARGIN, 117, 507, size=10.3)
y = code_block(page, "1. Find duplicate business keys", "Expected: only ride IDs with more than one source row.", """
SELECT ride_id, COUNT(*) AS n
FROM rides
GROUP BY ride_id
HAVING COUNT(*) > 1;
""", y + 18)
y = code_block(page, "2. Second-highest distinct salary", "Exclude null salaries; ties share one dense rank.", """
WITH ranked AS (
  SELECT salary,
         DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
  FROM employees
  WHERE salary IS NOT NULL
)
SELECT DISTINCT salary
FROM ranked
WHERE rnk = 2;
""", y)
note(page, "Say the assumption before the query", "Second-highest distinct salary is different from the second employee in a sorted list. Ask whether ties should be included and which null policy applies.", y + 2, 91)

page = new_page("SQL patterns, continued", "STABLE ORDERING / CLEAR GRAIN")
y = code_block(page, "3. Top three rides per city", "Exactly three rows per city where available; ride_id breaks equal-fare ties.", """
WITH ranked AS (
  SELECT ride_id, city, fare,
         ROW_NUMBER() OVER (
           PARTITION BY city
           ORDER BY fare DESC, ride_id
         ) AS rn
  FROM rides
  WHERE fare IS NOT NULL
)
SELECT ride_id, city, fare
FROM ranked
WHERE rn <= 3;
""", 122)
y = code_block(page, "4. Running fare total", "ROWS makes the frame explicit. event_time plus ride_id defines the order.", """
SELECT ride_id, event_time, fare,
       SUM(fare) OVER (
         ORDER BY event_time, ride_id
         ROWS BETWEEN UNBOUNDED PRECEDING
                  AND CURRENT ROW
       ) AS running_fare
FROM rides;
""", y)
note(page, "One more useful verbal exercise", "Explain how a left join can duplicate ride rows when city history contains overlapping versions. Then explain why an as-of interval condition is necessary but does not replace overlap validation.", y + 1, 101)

page = new_page("Your two-minute project explanation", "PRACTISE ALOUD / USE ONLY CLAIMS YOU CAN DEFEND")
toc.append([1, "Project explanation and resume review", len(doc)])
paragraphs = [
    ("Problem", "I built a local PySpark and Delta Lake pipeline for synthetic ride records. The aim is reliable date-based analytics with validation, safe replays and visible evidence."),
    ("Flow", "The CSV is read with an explicit schema and source metadata. Invalid records go to quarantine. Accepted records flow through event-date-partitioned Bronze and Silver, then Gold ride facts and city history."),
    ("Two design choices", "Late records use their actual UTC event date. City changes use SCD Type 2, and each ride joins to the city version valid when the ride occurred."),
    ("Verification", "The earlier recorded run reconciled 1,000 input rows into 895 accepted and 105 rejected rows, passed replay checks and reported 20 passing tests. Pruning and compaction have separate measured demonstrations."),
    ("Limits", "This is a local prototype, not a claim of production scale. Compaction is an isolated demo, transactions are per table, and changed ride payloads are rejected under the immutable-key contract."),
]
y = 122
for heading, body in paragraphs:
    y = text(page, heading, MARGIN, y, 507, "bold", 11.5, TEAL)
    y = text(page, body, MARGIN, y + 6, 507, size=10.7) + 17
note(page, "Resume drill: use your actual resume", "No resume was available for this guide. For every real bullet, prepare: problem -> your role -> tools -> key decision -> validation -> result -> limitation. Do not invent experience, numbers or personal ownership.", y, 109)

page = new_page("Final practical checklist", "THE ACTUAL PROBLEM STATEMENT OVERRIDES PREPARATION")
toc.append([1, "Laptop and day-of checklist", len(doc)])
checklist = [
    ("Laptop", "Use your personal laptop. Confirm the actual OS, RAM and available disk space before choosing a runtime. Do not rely on files that exist only elsewhere."),
    ("Project", "Keep the repository locally available, including README and selected evidence. Use Python 3.11 and Java 17 for this project's prepared path; respect its pinned dependencies."),
    ("Run it before arrival", "Check the correct interpreter, dependency imports and project instructions. On the supported Linux/macOS/WSL path, the end-to-end command is bash run_all.sh. No personal-laptop run is verified by this PDF."),
    ("AI and network", "Sign in and test tools beforehand, check free quotas, keep documentation as a fallback, and confirm the event's AI/data-sharing rules. Do not assume cloud access is unlimited."),
    ("Packing", "Bring your fully charged laptop, charger, suitable LAN adapter, admit card, government photo ID and printed invitation email."),
    ("Arrival", "The invitation states 8:30 AM reporting and at least one hour early arrival. Plan for 7:30 AM on Sunday, 15 November 2026, unless the organizer updates the instructions."),
    ("During the build", "Clarify requirements, build a small vertical slice, test edge cases, make meaningful commits and save time for a clean run and handoff. Ask how and when to submit."),
    ("If uncertain", "State the assumption or limitation. Do not bluff, fabricate tests, hide failed checks or promise a feature that is not implemented. A clear working core is valuable."),
]
y = 121
for heading, body in checklist:
    y = text(page, heading, MARGIN, y, 507, "bold", 10.7, TEAL)
    y = text(page, body, MARGIN, y + 4, 507, size=10.3, leading=13.6) + 14
assert y < H - 46, y

for chunk in range(2):
    page = new_page("References and scope", f"PRIMARY DOCUMENTATION / {chunk+1} OF 2")
    if chunk == 0:
        toc.append([1, "Primary documentation and scope", len(doc)])
    y = text(page, "Reference IDs appear in the relevant sections. Answers are concise original explanations, not quotations. APIs, versions and service limits can change; use the repository pins and matching documentation when running code.", MARGIN, 117, 507, size=9.8)
    y += 15
    for sid, label, url in SOURCES[chunk * 13:chunk * 13 + 13]:
        y = text(page, f"{sid}  {label}", MARGIN, y, 507, "bold", 9.2, NAVY)
        top = y + 2
        y = text(page, url, MARGIN, top, 507, size=8.0, color=BLUE, leading=10)
        page.insert_link({"kind": fitz.LINK_URI, "from": fitz.Rect(MARGIN, top, W-MARGIN, y+2), "uri": url})
        y += 12
    if chunk == 1:
        y = text(page, "Project source: local partitioned-datalake code and README reviewed on 14 November 2026, plus run01 results previously supplied in the conversation. The resume and the Round 4 problem statement were not supplied. No new project execution was performed.", MARGIN, y + 6, 507, size=9.3, color=GRAY)
    assert y < H - 48, y

assert question_number == 150
doc.set_toc(toc)
doc.set_metadata({
    "title": "Data Engineering and AI Hackathon: 150 Short Interview Questions",
    "author": "Study preparation guide",
    "subject": "Beginner revision: project, SQL, Python, Spark, Delta, reliability, streaming and AI",
    "keywords": "data engineering, interview, hackathon, SQL, Spark, Delta Lake, RAG",
})
doc.save(PDF, garbage=4, deflate=True)
page_count = len(doc)
doc.close()

reader = PdfReader(str(PDF))
all_text = "\n".join(p.extract_text() or "" for p in reader.pages)
for n in range(1, 151):
    assert re.search(rf"Q{n:03d}\s", all_text), f"Missing question {n}"
assert "\ufffd" not in all_text

rendered = fitz.open(PDF)
for page_index in [0, 1, 2, 3, 6, 13, 16, 21, 28, 31, 32, 33, 34, 35, 36, 37]:
    if page_index < len(rendered):
        pix = rendered[page_index].get_pixmap(matrix=fitz.Matrix(1.15, 1.15), alpha=False)
        pix.save(TMP / f"page_{page_index+1:02d}.png")
rendered.close()

print(f"Created {PDF}")
print(f"Pages: {page_count}; questions: {question_number}; bytes: {PDF.stat().st_size}")
print(f"Extracted text and layout bounds verified; page previews: {TMP}")
