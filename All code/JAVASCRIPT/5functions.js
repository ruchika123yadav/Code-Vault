// function hello(){
//     console.log("hello");

// }
// //  function printname(){
//     // n = prompt("Enter your name please")
//     // console.log("Hello",n)
// //  }

// //  printname();

// //  FUNCTION TO PRINT A POEM
// function poem(){
//     console.log("twinkle twinkle little star")
//     console.log("up above the like so hy")
// }

// poem()

// // function which create a random number on dice
// function dice(){
//     console.log("dice roll......")
//     console.log("the number generates is",Math.floor(Math.random()*6)+1)
// }
// dice()
// dice()

// // FUNCTIONS WITH ARGUMENTS
// function name(name,age){
//     console.log(name,age)
// }

// name("Ruchika Yadav",20)
// name("Rajesh Yadav",50)
// name("Rajesh Yadav") // ish line me error show nhi krega bss age ki jagah undefined show hoo jayegaa

// // GIVES AVERGAE OF THREE NUMBERS
// function avg(a,b,c){
//     sum = (a+b+c)/3
//     return sum
// }

// console.log("the avergae is",avg(2,2,2))

// // TABLE
// function table(n){
//     for(let i=1;i<=10;i++){
//         console.log(n,"X",i,"=",n*i)
//     }
// }

// table(5)

// // SUM FROM 1 TO N
// function truth(n){
//     s =0;
//    for(let i=1;i<=n;i++){
//       s+=i;
//    }
//    return s
//  }
//  console.log(truth(5))

// //  function returnthe concatenation of all string in an array
//  function concat(arr){
//     let p;
//  for(let i=0;i<arr.length;i++){
//         p+=arr[i]
     
//  }  
//   return p
// }
// let t =concat(["Ruchika","Yadav","is","brilliant","Student"])
// console.log(t)

// // SCOPE
// {
//     // block scope
//    let a=34; // ye sirf or sirf agr var diya hai tabhi access hoga const or let me nhii
// }
// // console.log(a)

// // LEXICAL SCOPE
// function deep(){
//     let a=34;  //(function scope)
//     let b=12;
//     function low(){  //(lexical scope) ye function variable ki tarah kaam krega
//         c=44;
//         console.log(a) //ham ish function ke andr deep wale function ke variable accesskrr skte haii
//         // lekin agr low ke function deep me access kiye to nhi honge
//     }


// }
// //low()// or low wale function ko bhrr bhi access nhi krr skte
// // or ha ek or baat jab deep ko call krenge to deep ke andr jo console likha hoga whi access hoga low ke andr ke acces krana ke liye usko deep ke andr likhna hoga

// //FUNCTION EXPRESSION variable is assign a function
// let scope = function(a,b){
//     return a+b;
// }
//  console.log(scope(2,3))

// //  HIGHER ORDER FUNCTION(takes one or multiple functions as arguments)

// function greet(func,n){
//     for(let i=1;i<=n;i++){
//         func()
//     }}
// let greett = function(){
//         console.log("hello")
//     }


// greet(greett,2)
// // greet(function() {console.log("hello")},2)  //isse bhi print ho jayega


// // METHODS is similar to functions but they are generate for objects key or 
// // value pair me value ko as a funcition likhte hai or directly bina key ke bhi likh kste hai

// const calculator={
//     add:function(a,b){
//         return a+b;
//     },

//     sub :function(a,b){
//         return a-b;
//     },

//     mul:function(a,b){
//         return a*b;

//     }
// };

// // shortcut method
// const cal={
//     add (a,b){
//         return a+b;
//     },

//     sub (a,b){
//         return a-b;
//     },

//     mul (a,b){
//         return a*b;

//     }
// };
// console.log(cal.add(9,4))
// console.log(cal.add)

// console.log(calculator) // jab bhi hame sirf function run krana ho to ham bss variable ka name likhte hai obly no  bracket
// console.log(calculator.add(2,3))
// console.log(calculator.mul(9,3))


//      PRACTICE PROBLEM
// 1***
// function dice(){
//     console.log("Dice Rolling....")
//     console.log(Math.floor(Math.random()*6+1))
// }
// dice()

// 2******
let car ={
    name:"Farrri",
    model:"2.45rttt",
    color:"Red"
}
console.log(car.name)

let person={
    name:'Ruchika YAdav',
    age:20,
    city:"paris"

}
person.city="New York";
person.country="United states"
console.log(person)

let aa=[1,2,3,4];
console.log(aa)