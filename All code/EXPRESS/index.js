let express = require('express');
let app = express();

// console.dir(app);
let port=3000;
app.listen(port,()=>{
   console.log(`we are listening request ${port}`)
})

//APP USE**********

// app.use((req,res)=>{
//     console.log("Recieve request");
//     // res.send("Yes i got the response")
//     // res.send({
//     //     name:"Ruchika",
//     //     age:21,
//     // })
//     let html="<h1>Name</h1> <ul><li>Ruchika</li><li>Om</li></ul>"
//     res.send(html);
// })

// app.GET
app.get("/",(req,res)=>{
    res.send("We are on root")
})
// app.get("/orange",(req,res)=>{
//     res.send("YOu are on the orange path")
// })
// app.get("/apple",(req,res)=>{
//     res.send("YOu are on the apple path")
// })
// app.get("*",(req,res)=>{
//     res.send(" Error 404 page is not find");
// })

// app.post("/",(req,res)=>{
//     res.send(" Post request");
// })

app.get("/:username/:id",(req,res)=>{
    let {username ,id}=req.params;
    res.send(`Your username is ${username} and you id is ${id}`);
})

app.get("/search",(req,res)=>{
    // console.log(req.query);
    let {q}=req.query;
    if(!q){
        res.send("Not any query")
    }
    res.send( `<h1>Search Queries are ${q}</h1>`);
})