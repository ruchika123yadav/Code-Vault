// THIS(ye hamre object e jo parameters hai unhe fnction me access krane ke liye kaam ata hai hai )
// agr ham iske bina accessk renge to parametrs access nhi honge
const student={
    name:"ruchika Yadav",
    age:20,
    math:99,
    physics:94,
    Avg(){
        // console.log(this)
        let av=(this.math+this.physics)/2
        console.log(av)
    }  
 
};

console.log(student.Avg())
// jo bhi object jis method ko call krr rhi hai wo hi hamra this hai

// TRY AND CATCH(for error and exception)

// ARROW FUNCTION
const sum =(a,b) => {
    console.log(a+b)
};
sum(4,5)
console.log(sum)

const cube=(a)=>{
    console.log(a*a*a)

};
cube(3)


// IMPLICIT RETURN IN ARROW FUNCTION
const arrow= (a,b) =>(
    a*b
);
console.log(arrow(8,9))

// SET TIMEOUT(hamesha milisec me kaam krega to 1 sec ke liye 1000 likhna padega)
// gnerally api calls ke liye use krte haii or iske baad wala likha hua code rukea nhi wo bhi print ho jaeyga isse phele
//  setTimeout(() => {
//     console.log("exactly after 3 sec print")
//  },3000);

//  console.log("Hi i m here")

 
//  SET INTERVAL(ye har sec baad program execute karrwaega)
//  setInterval(() => {
//     console.log("exactly after 3 sec print")
//  },3000);

//  console.log("Hi i m here")

 setInterval(ruchi =(a,b) =>(  //nhi chal rha
    a*b

 )   ,3000);

//  console.log(ruchi(3,3))

// //  for stoping set interval
// let id1=setInterval(()=>{
//     console.log("stop")
// },3000);

// clearInterval(id1) by this we can clear interval

// THIS WITH ARROW FUNCTION














// Function which return the aure of a number n
let sre=(a)=>(
    console.log(a*a)
);


sre(5)

// functionprint hello 5 times after 2 sec
let id=setInterval(()=>{
    console.log("hello World")
},2000);

setTimeout(()=>{
    clearInterval(id);
    console.lo
},10000);

// PRACTICE PROBLEM##########

// 1*******

let  number =20;
 
let ar=[2,4,6,45,23,12,6,7]
for(let i=0;i<ar.length;i++){
    if(ar[i]>number){
        console.log("the larger number is",ar[i])
    }

}

// 4***
let string="Iteration";
let count=0;
for(let i=0;i<string.length;i++){
    if(string.charAt=="a" || string.charAt=="e" || string.charAt=="i" || string.charAt=="o" || string.charAt=="u"){
        count++;

    }
}
 console.log(count)

//  5*********
let start=100;
let end=200;
let dif=end-start;
console.log(Math.floor(Math.random()*dif +start))