// //  STRING METHODS = stringname.method()
console.log("Jab padho to comment hata dena practice se pehele")
console.log("I am here");
console.log("I am here");
// 1 string.trim() = remove white spaces
// let password = prompt("Enter your password");
// pass =password.trim();
// console.log(pass );

// 2 str.uppercase and str.lowercase function define in name
 let ins = "inspiration";
console.log(ins.toUpperCase());

//  3 stringname.indexof(substring) = koi bhi string iske and likhte hai to uska first index number lake de deta hai
let name = "RuchikaYadav"
console.log(name.indexOf("a"))
console.log(name.indexOf("z"))

// METHOD CHAINING = yani ki ek se jada method ham ek line me link krr skte hiai
// seddhe si baat ye hai ki agr multiple method apply krne hai to bss . lagake age agle mehtod ko likh skte haii
let string ="          Leetcode"
console.log(string.trim().toUpperCase())


// REAPEAT
  let s = "Precipitation"
  console.log(s.repeat(3))

//   REPLACE
console.log(name.replace("Ruchika","Ruchi"))


// ARRAYS ###############################
// ham ishme mixed array bhi create krr skte haii


let exams  = ["jee mains","jee advanced",100,90.8,true]

console.log(exams[3])  //yha pe intger me second [] krne pr kuch nhi ayega undefined to bss string ke hi 2 [] tak nikal skte hai
console.log(exams[1].length) 

let student= ["Ruchika","saumya","Bhoomi","Varhsa"];
console.log(student);
// METHODS 
// these are for the ending joining legth
student.push("Anam");
student.push("Anam");

student.pop("Anam");

// for starting joining
// student.unshift("NIcola")  // for adding the first element
// student.shift("saumya")    // for deleting the first element


let followers = ["a","b","c"];
let blocked = followers.shift();
console.log(followers)
console.log(blocked)
followers.shift()
console.log(followers)
followers.unshift("Abc")
console.log(followers)

let start = ["January","July","march","august"]
start.shift()
start.shift()
start.unshift("June")
start.unshift("july")

 
console.log(start)

// CONCATENATION() AND REVERSE()
console.log(student.concat(start))
console.log(start.reverse())

// SLICE
 
console.log(start.slice(1,3))
console.log(start.slice(1))
console.log(start.slice(-2)) // last ke do element print krr dega

// SPLICE(ye similiar hai slice ki tarah hai ye element ko remove krta hia lekin ye array ko bhi change krr skta haii )
console.log("I am busy")
colors = ["red","blue","pink","purple"]
console.log(colors.splice(0,2))
console.log(colors)

// SORTING
let cars = ["Bugati","farrari","lambo","BMW"]
console.log(cars.sort())

let num = [1,2,3,100,34,56]
// num.sort()  AB YHA SORTING NHI HOGI
// pehele ye numbers string me convert honge honge fir inki koi alg value niklegi uske baad uiske basis pe ye sort honge

// ARRAY REFERENCE (refernce mtlb memory address jha array ki values store hai)
let arr = [ "a","b","c"];
let arrcopy = arr  // abe me agr arrycpoy or arr me koi bhi change kru to wo change dono me relflect hoga

// CONSTANT ARRAY
// ISHME HAM ARRYA KIANDR ALI VALUES TO CHANGE KRR SKTE HAII LEKIN AGR USHI SAME ARRAY KO DEFINE KRENGE TO wo define nhi hooga
const a = [ "abc","cdf","rtg"]
// let a = [ "abc","cdf","rtg"]  seee erroe shoe ho rha haii
a.pop()
console.log(a)

// NESTED ARRAY
let nume =[[2,4],[4,5],[6,7]] 
console.log(nume[0])
console.log(nume[0][1])

// problem tic - toe
let tic = [["X",null,"0"],[null,"X",null],["0",null,"X"]]
console.log(tic)
tic[0][1]="0"
console.log(tic)


//                 PRACTICE PROBLEM*******************
// 1##
// let numberr=prompt("Enter any value which is divisble by 10")
// if(numberr%10==0){
//   alert("Good")
// }
// else{
//   alert("Bad")
// }

// 2****
// name = prompt("Enter your name")
// age = prompt("Enter your age")
// alert(`${name} is ${age} years old`)


// 3#######

// let quater=prompt("Enter the quater value");
// switch(quater){
//   case 1:
//     alert("January,Februrary,Marcg");
//           break;
//   case 2:
//     alert("April,May,Jue");
//      break;
//   case 3:
//     alert("July,Agust,September");
//      break;
//   case 4:
//     alert("October,November,December");
//     break;
// }

// ye upr wala uestion me wo promt string le rha ishliye number ko read nhi krr paa rha switch wale expression me

// 4****
// let string =prompt("Enter any string")
// if((string.startsWith("a") || string.startsWith("A")) && string.length>5){
//        console.log("Golden")
// }
// else{
//   console.log("Not Goolden string")
// }

// 6###
let num1 = 456;
let num2 = 453426;
if(num1[-1]==num2[-1]){
  console.log("The ending digit in both the number are same")
}
console.log("Ruchika yadav","123")