// Rules for Schema

const mongoose = require("mongoose");


main().then(()=>{
    console.log("Conneted");
}).catch((err)=>{
    cons.log(err);
})

async function main(){
    await mongoose.connect('mongodb://127.0.0.1:27017/amazon');

    // yha amazon likha haii to amazon ka db ban jayegaa
}

const bookSchema = mongoose.Schema({
    title:{
        type:String,
        required:true,
        minLength:10
    },
    author:{
           type:String,
           default:"Tim"
    },
    price:{
        type:Number,
        default:100,
        min:[10,"Jaa jake toffee kareed"]
    },category:{
        type:String,
        enum:["fiction","non-fiction"]
    },
    genre :[String]
})
// SHORCUT MEHTHOD

// const bookSchema = mongoose.Schema({
//      title::"String", 
    //  author:"String",
    //  price:Number
// })

 
const Book = mongoose.model("Book",bookSchema);

//  const book1 = new Book({
//     title:"The Sparkling lady Ruchika",
//     author:"Ruchika Yadav",
//     price:'456'
//  })

//  book1.save();

//  const book1 = new Book({
//     title:"Marvel Comics",
//     category:"fiction"    ,
//     genre:["Comics","Entertaiment"]

//  })

//  book1.save();

// Book.findOneAndUpdate({author:"Ruchika Yadav"},{author:"Jack"}).then((res)=>{
//     console.log(res);
// }).catch((err)=>{
//     console.log(err);
// })

Book.findOneAndUpdate({author:"Ruchika Yadav"},{ price:5},{new:true},{runValidators:true}).then((res)=>{
    console.log(res);
}).catch((err)=>{
    console.log(err);
})

