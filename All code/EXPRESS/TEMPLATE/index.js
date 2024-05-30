const express = require('express');
const path = require("path")
let app = express();


let port = 3000;
// jese hamne express ko require kiya hai hame EJS ko require krne ki jarurt nhi
// kyuki by default ejs phele se hi express me install hota haii or expressko ham phele hi require krr chuke haii

app.set("view engine",'ejs');

app.set("views",path.join(__dirname,"/views"));

//SETTING STATIC FILES
app.use(express.static(path.join(__dirname,"/public/css")));
app.use(express.static(path.join(__dirname,"/public/css/js")));


app.listen(port,()=>{
    console.log("Ya express startingggggggg");
})

app.get('/',(req,res)=>{
    res.render('home.ejs');
 })

//  FOR RANDOM NUMBER 
app.get('/random',(req,res)=>{
    let randomNu=Math.floor(Math.random()*6)+1;
    res.render('ludoRandom.ejs',{randomNu});
 })

//  FOR SEARCH QUERY
app.get('/search',(req,res)=>{
    res.send( "Me sender message hu");
 })

//  FOR INSTAGRAM PAGE
app.get('/:username',(req,res)=>{
     let {username}=req.params;
     let instaData= require('./data.json');
     let data = instaData[username];
     if(data)
        {res.render('instagram.ejs',{data});}
    else{
        res.render('error.ejs');
    }
    res.send("Abe de to rha huuu")
 })
