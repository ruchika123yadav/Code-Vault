let studentScores = new Map([["john", 90], ["bob", 80], ["ahmed", 70]]);
console.log(studentScores.get("john"));
studentScores.set("Ruchika", 100);
console.log(studentScores.size);
studentScores.delete("Ruchika");
console.log(studentScores.has("Ruchika"));
//studentScores.clear()
console.log(studentScores);
console.log(studentScores.keys());
for (let key of Array.from(studentScores.keys())) {
    console.log(key);
    console.log(studentScores.get(key));
}

console.log(studentScores.values());
console.log(studentScores.entries());