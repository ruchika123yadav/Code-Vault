// let arr = [];
// console.log(typeof(arr))  // objects
// // OBJECTS LITERALS (used to sotre keyed collection and complex entities)
// // (student)name - Ruchika yadav = property 1 , age = 20 = property 2
// // it is similar  dictionory

// let delhi ={
//     latitude: "29.4",
//       longitude:"77.4"

// };

// // object ke ande koi bhi specific order nhi hota or ye arrya se jada redable hai 
//  console.log(delhi)

//  const student= {
//     name:"Ruchika",
//     age:20,
//     Marks:[98.8,45,67]
//  };
//  console.log(student)

// //  ACCESS
// let company = {
//     name:"Microsoft",
//     employee:200,
//     salary:500000,
//     job:"Software Engineer",
       
// }
 
// console.log(company.employee)
// console.log(company["employee"])
// // koi bhi aisha case aye jha haame variables ka use krna pade to ham wha brcaket ka use krte hai
// // confusing hai kuch samaj nhi aya
// let post ="repost"
// console.log(company["post"])
// console.log(company["post"])

// // GET VALUES(JS hamre sare keys ko string me convert krr deta hai agr key as a number dia tab bhi wo ushe string me convert krr dega)


// let num ={
//     1:"a",
//     2:"b",
//     null:"null",
//     undefined:"sd"
// }

// console.log(num["1"])
// console.log(num[1])
// // yha jo hamne yha 1 likha hai wo index bhi nhi hai wo number bhi nhi hai wo directly ek string me convert ho gya hai uske baad key se match kiya usek baad value dii

// // console.log(num.1) but hamra . isko string me convert nhi krta ishliye error dedeta hai
// console.log(num.null)

// // UPDATE AND DELETE
// let cars = {
//     low:"Nano",
//     average:"Ford",
//     high:"BMW"
// };

// cars.low="Honda"
// cars.extreme="Ferrari"
// delete cars.average;
// console.log(cars)

// // OBJECTS OF OBJECTS
// const classInfo={
//     ruchika :{
//       name:"Ruchika Yadav",
//       color:"Sky Blue",

//     },
//     bhoomi:{
//         name:"BHoomi Sharma",
//         color:"puple"
    
//     },
//     Anam:{
//         name:"Anam Waheed",
//         color:"Pink"
//     }
// }
// console.log(classInfo.ruchika.name)

// // ARRAY OF OBJECTS(means array ke andr objects banayenge)
// const Info =[
//     {
//         name:"Ruchika yadav",
//         grade:"A+",
//         city:"Mumbai"
        
//     },
//     {
//         name:" BHoomi",
//         grade:"A+",
//         city:"Delhi"

//     },
//     {
//         name:"Anam Waheed",
//         grade:"O",
//         city:"pune"

//     }
// ]
// // ye 2d arrya nhi hai ye phele arya to 2d array ki trah hi acces krenge lekin unke andr ki properties ko ham objects ki tarah hi access krenge . lagake
// console.log(Info[0].name)
// console.log(Info[1].city)
// // ham isko update bhi krr skte haii

//  console.log(Math.random())
//  console.log(Math.random())


// //  MATH.RANDOM(A)
//  console.log(Math.abs(-20))

//  let m =Math.floor(Math.random()*10 + 1)
//  console.log(m)
// //  for generating numbers between 20 to 25
// let l =Math.floor(Math.random()*5 + 21)
// console.log(l)


// // GUESSING GAME
//  let max= prompt("Enter the Max number");
// console.log(max);
// const random = Math.floor(Math.random()*max +1);
//  let enter = prompt("Guess any number");

//  while(true){
//     if(enter=="quit"){
//         console.log("You quit");
//         break;
//     }
//     if(enter==random){
//         console.log("You guessed it right")
//         console.log(random)
//         break;
//     }
//      else if(enter<random){
//         enter =prompt("please guess bigger number")
//      }
//      else{
//         enter=prompt("please guess smaller number")
//      }
//  }

//  pratice problem###############

// 1***
// let num =2;
// let arr = [1,2,3,4,5,6,2,3,]
// for(let i=0;i<arr.length;i++){
//     if(arr[i]==num){
//         arr.splice(i,1)
//     }
// }
// console.log(arr)

// 2******
// let number = 2872;
// let count = 0;
// let copy = number;
// while(copy > 0) {
// count++;
// copy = Math.floor(copy/10);
//  }
// console.log(count);

// 3********
let number = 287152;
let sum = 0;
let copy = number;
while(copy > 0) {
     sum+=copy%10;
copy = Math.floor(copy/10);

 }
console.log(sum);

// 4*****
// let fact=1;
// num=0;
// for(let i =1;i<=num;i++){
//     if(num==0){
//         console.log("1")
//     }
//        fact *=i
// }
// console.log(fact)

// 5*********
// let max;
// arr=[1,7,4,8,9,3,98,5];
// for(let i=0;i<arr.length;i++){
//     if(arr[i]>arr[i+1]){
//         max=arr[i]

//     }
// }
// console.log(max)