let mongoose = require('mongoose');
let Chat = require('./models/chat');


main()
.then(()=>{
    console.log("Connnected")
})
.catch(err => console.log(err));

async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');}


  let data =[
    {
    from:'Ruchika',
    to:"PAPA",
    msg:"Mene krr dikhaya",
    created_at:new Date(),
  },
    {
    from:'Om',
    to:"Mummy",
    msg:"hmm haa",
  },
    {
    from:'yep',
    to:"yeppie",
    msg:"yahoo",
    created_at:new Date(),
  },
    {
    from:'trevor',
    to:"train",
    msg:"chuk chuk",
    created_at:new Date(),
  },
    {
    from:'Yetri',
    to:"yatra",
    msg:"kre kyaa",
    created_at:new Date(),
  },
]

  Chat.insertMany(data);