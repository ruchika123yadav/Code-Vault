let express = require('express');

let app = express();
// Middleware to parse URL-encoded and JSON bodies
app.use(express.urlencoded({ extended: true }));
app.use(express.json());

let port =3000;
app.listen(port,(req,res)=>{
    console.log("We are connected");
})





//GET REQUEST DATA
app.get('/register',(req,res)=>{
    // let {quer}=req.query;
    // res.send( `Welcome ${quer}`)
    let { username } = req.query; // Correctly extracting 'quer' from the query parameters
    res.send(`Welcome ${username}`);
})


//POST REQUEST DATA
app.post('/register',(req,res)=>{
    console.log(req.body);
    let {username}=req.body;
    res.send( `We are post ${username}`);
})