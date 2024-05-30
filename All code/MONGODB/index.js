let mongoose = require('mongoose');
// making the connection

// mongoose.connect('mongodb://127.0.0.1:27017/test');

main()
.then(()=>{
    console.log("Connnected")
})
.catch(err => console.log(err));

async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/test');}  //it is a pormmise because it is a async function

  const userSchema = new mongoose.Schema({
    name:String,
    email:String,
    age:Number,
  });

  const User =mongoose.model("User",userSchema);
  // const Product =mongoose.model("Product",userSchema);


  //INSERT

  // const user2 = new User({
  //   name:"Om",
  //   email:"Om@gmai.com",
  //   age:19,
  // });



  // user2.save().then((res)=>{
  //   console.log(res);
  // }).catch((err)=>{
  //   console.log(err);
  // })

  //  User.insertMany( [ 
  //   {name:"Reto",enail:"@",age:34},
  //   {name:"Yerti",email:"#@!",age:21},
  // ]).then((res)=>{
  //   console.log(res);
  // })

  // READ

  // User.find({age:{$gte:25}}).then((res)=>{
  //   console.log(res[0].age);
  // }).catch((err)=>{
  //   console.log(err);
  // })

  // UPDATE

  // User.updateMany({age:{$gte:30}},{age:18}).then((res)=>{
  //   console.log(res);
  // }).catch((err)=>{
  //   console.log(err);
  // })
 
  //get the updated valuee

  User.findOneAndUpdate({name:"Ruchika"},{ name:"Jack"},{new:true})
  .then((res)=>{
    console.log(res);
  }).catch((err)=>{
    console.log(err);
  })
 
  // DELETE

  User.findByIdAndDelete("6656847522cd15a30dd08c23")
  .then((res)=>{
    console.log(res);
  }).catch((err)=>{
    console.log(err);
  })

 
 
 


