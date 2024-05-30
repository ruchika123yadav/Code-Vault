const express = require('express');
const path = require('path');
const methodOverride = require('method-override');//bhai isse bhi install krna padega
let mongoose = require('mongoose');
let Chat = require('./models/chat');


const app = express();

const port = 3000;


app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "/view"));

app.use(express.static(path.join(__dirname, 'public')));

app.use(express.urlencoded({ extended: true }));
app.use(express.json());
app.use(methodOverride('_method'))

app.listen(port, (req, res) => {
  console.log("Connected");
})


//MONGOOSE

main()
  .then(() => {
    console.log("Connnected");
  })
  .catch(err => console.log(err));

async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');
}



app.get('/', (req, res) => {
  res.send("Connected");
})

app.get('/chat', async (req, res) => {//or ishe asyn banana hogaa
  let chat = await Chat.find(); //ye hamra asyn function haii to iske liye await krna hoga
  console.log(chat);
  res.render('template.ejs', { chat });
})


//RENDERING A NEE FORM TO ADD CHAT
app.get('/chat/new', (req, res) => {
  console.log("Yehh");
  res.render('form.ejs');
})

//PAGAL INSHAAN POST REQUEST OT BANA TAB TO POST KAAM KREGA
//create route
app.post('/chat', (req, res) => {
  let { from, to, msg } = req.body;
  const newChat = new Chat({
    from: from,
    msg: msg,
    to:to,
    created_at:new Date(),
  });
   newChat.save().then((re)=>console.log(re)).catch((err)=>{console.log(err)})
  //  ye jitne bhi sare save update or jo bhi wo sare asunc funtion haii to promise return krenge to await krna padega lekin hmm then likh rhe to ham await krne ki jarurt nhii kyuki then bhi await jesa hi work krta
  // agr await laga haii to then ko hatou phele
   res.redirect('/chat');
})


