// FOR EACH
let arr=[1,2,3,4,5];
let print= function(l){  //yha l ki jagah kuch bhi de skte hai hai wo bss array ke elemnt ko traverse krega only
    console.log(l)

};
arr.forEach(print);

console.log("ruchi ")
// another way
arr.forEach(function (el){
    console.log(el)
})
 

// foreach in array with object
let ar=[{
    name:"Ruchika Yadav",
    age:20
},{
    name:"ruchi", 
    age:18
},
 ];

ar.forEach(student=> {
    console.log(student.age)
    console.log(student.name)
}) ;


// FILTER
let num=[4,6,8,0,2,45,23,88];
let ans=num.filter((el) => {
    return el%2==0;
 }
);
console.log(ans)

// EVERY  AND AND SOME OR
let arrr=[4,6,8,0,9];
let and=arrr.every((el)=>{
    return el %2==0;
})
console.log(and)

// REDUCE

let a =[3,56,43,78,56];
let final = a.reduce((rel,el)=>{
      return rel+el
})
console.log(final)
 
// FINDING A MAX. VALUE FROM AN ARRAY WITH THE HELP OF REDUCE FUNCTION
let t=[2,3,67,5,89,23,67,3,5];
let max=t.reduce((r,e)=>{
    if(e>r){
         return e
    }
    else{
        return r
    }
     
});
console.log(max)

// IN SAB ME RETURN BHOOT JARURI HAI
 
// prblm all numbers in an array are multiple of 10 or not
let g=[40,70,67,34,56,];
let mul=g.every((e)=>{
    return e%10
});
console.log(mul);

// prbllm find the min. number in an array
let p=[2,3,67,5,89,23,67,3,5];
let min=t.reduce((r,e)=>{
    if(e< r){
         return e
    }
    else{
        return r
    }
     
});
console.log(min)

//  SPREAD
 
  console.log(Math.min(5,4,6,7,46,34))  // array nhi daal skte iske andr 

  e=[34,57,89,34,67,9];
  console.log(Math.min(...e))
  console.log(...e)

console.log(..."Ruchika")
let odd=[1,3,5,7,9];
let even =[2,4,6,8,];
console.log(...odd,...even)

// SPREAD WITH OBJECT LITERALS
    const data={
        email:"ruchika@gmail.com",
        password:"bcgt@123"
    }
  const  dataCopy= {...data,id:"Ruchika",country:"India"}
  console.log(dataCopy)

//   REST
  function sum(...args){
    for(let i =0;i<args.length;i++){
        console.log("You give us ",args[i])
    }
  }
  sum(1,2,3,4,5,6,7,8,9)

function minn(){
    console.log(arguments)
}
minn(1,2,3,4)
// ARGUMENTS array nhi hota mtbh ham ishme argument me array ke method use nhi krr skte
// ye ek collection hai element ka

function s(...arg){
   return arg.reduce((sum,e)=>
         sum +e);
}
console.log(s(2,3))
// ishme pata nhi kyu arrow ke baad agr mecurly brceses ;aga rha hu to wo undefined de rha hai

// DESTRUCTING  storing values of array into multiples variables
let names=["tony","stark","thomas","truenky","vick"];
let [winner, runnerup,...others]= names;
console.log(runnerup,others)  

// destructuring with objects
const student={
    name:"Ruchika",
    salary:49568395,
    company:"microsoft",
    id:"VIP"
};
let {name:naam,id:identity,city="mumbai"}=student;
// yha pe ham jo variable object me likhte hai unko bhi use krr skte  hai ya unki koi default value bho bana skte hai
console.log(identity);
console.log(student);