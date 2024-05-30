async function greet(){
    return "hello!";
}
// async function me ham agr promise likhe bhi na tab bhi ek promise return karate hai as a object  
function changecolor(color,delay){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            let num=Math.floor(Math.random()*5)+1;
            if(num>3){
                reject("Prmoise is rejected ")
            }
            h1.style.color=color;
            // if(nextColor) nextColor();  // yha hamne condition ishliye lagaye hi kyuki ham fir line 49 comment
            resolve("Color changed")
        },delay);
    });
     
}



async function demo(){
    try{
     await changecolor("red",1000);
     await changecolor("orange",1000);
     await changecolor("green",1000);
     await changecolor("blue",1000);
    }
    catch(err){
        console.log(err);  
    }
    
    
    
    let a = 5;
console.log(a);
}


// API..........
// accessing data from API......

let jsonres='{"fact":"Cats have 32 muscles that control the outer ear (compared to humans 6 muscles each). A cat can rotate its ears independently 180 degrees, and can turn in the direction of sound 10 times faster than those of the best watchdog.","length":226}'
// console.log(jsonres )

// CONVERT JSON TO JS
let obj =JSON.parse(jsonres)
// console.log(obj.fact)  // fact obj ka data batata haii jo diyaa haii

// CONVERT JS TO JSON(JSON.stringify(student))
let student={
    Name:"Ruchika Yadav",
    Marks:98,
};

// let url="https://catfact.ninja/fact"
// fetch(url)
// .then((res)=>{  // ye res ka mtlb hai agr shi gya too promise ka object return krke dega
//     console.log(res);  //hamra date readdable format me nhi ayega to suhe redable format me lane ke liye hame use krna hai
//     console.log(res.json().then((data)=>{
//           console.log(data);
//         //   console.log(data.fact) ham sirf deta ka fact bhi print kara skte hai iska use krke
//     }));

// })
// .catch((err)=>{
//     console.log(err);
// })


// AB YHA 2 DATA KO EK SATH READ KRR SKTE HAII
 let url="https://catfact.ninja/fact"
 fetch(url)
 .then((res)=>{
    // console.log(res)
    return res.json();
 })
 .then((data)=>{
        console.log(data.fact)
        return fetch(url);
 })
 .then((res)=>{
    return res.json();
 })
 .then((data)=>{
 console.log(data.fact)
 })
 .catch((er)=>{
    console.log(er)
 })


console.log("Hello World!")
// yha ye fetch asynchronous kaam krenge to uska wait nhi krenge pura hone kaa ishliye 
// ye console sabse phele print ho jayegaa


// FETCH WITH ASYNC AND  AWAIT
let urll="https://catfact.ninja/fact";
async function fet(){
    // console.log(fetch(url));  // yha api call succesfull nhi hui thi undefined show krega
    let res=  await fetch(urll);
    console.log(res)
   let an= await  res.json()  //yha agr ye await nhi lagaya to ye print nhi hoga undefined deikhayega
    console.log(an.fact)
}
fet();