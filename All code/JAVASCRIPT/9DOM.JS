// AGR HAMNE INLINE JS LIKHIA HAI OR JS ME JS LIKHI HAI TO JS WALI KI JADA PRIORITY HOGI

// let b=document.querySelector("button") //isse ham button ko acces krte haii
// // or ye hamra single botton ke liye hota hia multiple button ke liye nhi
// console.dir(b)

// // b.onclick=function(){
// //     console.log("clicked")
// //     alert("ping pong")
// // }

// function say(){
//     alert("yupppp")
// }

// b.onclick=say; // accha wo upr wala b.onlick likha tha ishliye nhi chal rha tha
// // or ek or cheez jo onclick end me likha hoga wo chalega(wese to chalega nhi lekin fir bhi)

// // for multiple button
let b=document.querySelectorAll("button")

for(b of b){
    // b.onclick=function(){
    //     console.log("hey me!")
    //  };
    //  // AGE HAM YHA SAY KE AGE PARENTHESIS lagayenge to iska mtlb ki ham ish funvtion ko yhi execute krna chahte hai
     // b.onmouseenter = function(){
    //     console.log("you hover")
    //  };
   
    b.addEventListener("click",sayhello);
    // jab ham click pe trigger krenge to hamara say hello funciton excute ho jayegaa
    b.addEventListener("click",sayname);
    b.addEventListener("click",change)
    b.addEventListener("dbl click",change)



} 
 function sayhello(){
    alert("hey me!");
 }

 function sayname(){
    alert("toodles");
 }

//   ACTIVITY WHICH GENERATE A RANDOM COLOR
  
let bg=document.querySelector('.gn')

bg.addEventListener("click",function(){
    let h3=document.querySelector("h3")
    let rnadomcolor=getRandomcolor();
    h3.innerText=rnadomcolor;  
    let div=document.querySelector("div");
    div.style.backgroundColor= rnadomcolor;

});
 

function getRandomcolor() {
    let red=Math.floor(Math.random()*255)
    let blue=Math.floor(Math.random()*255)
    let green=Math.floor(Math.random()*255)

let color=(`rgb(${red},${green},${blue})`)
return color;
}

let di =document.querySelector('.dd')

di.addEventListener("mouseenter",function(){
    console.log("Hey i m there")
    console.log(this);// ye hamra button hi haii jab ye run hoga to button display hoga inspect me
    this.style.backgroundColor="pink"
    // bg.this.style.backgroundColor="purple" nhi use krr skte
})

// changing the color of multiple tags using this keyword
function change(){
    console.log(this.innerText)
    this.style.backgroundColor="yellow"
}
di.addEventListener("click",change)
bg.addEventListener("click",change)

// KEYBOARD EVENT
let s = document.querySelector("span")

s.addEventListener("click",function(event){
    console.log(event);
    console.log("ping pong")
})
 
let p = document.querySelector("input");
// p.addEventListener("keydown",function(){
//     console.log("you enter the keybord key")  // yha pe jo hamri key hai wo back space ki liye bhi kaam kregi 
// })
// p.addEventListener("keyup",function(event){
//     console.log(event)
//     console.log("key is released")
// })
// p.addEventListener('keydown',function(e){
//     console.log(e.code);
//     console.log(e.key);
// })

//  ARROW UP AND ARROW DOWN GAME
p.addEventListener("keydown",function(e){
    console.log("code =",e.code);
    if(e.code=="arrowUp"){
        console.log("Move upward")
    }
    else if(e.code=="arrowDown"){
        console.log("Move downward")
    }
    else if(e.code=="arrowLeft"){
        console.log("Move leftward")
    }
    else if(e.code=="arrowRight"){
        console.log("Move rightward")
    }
});


// FORM EVENT..................

let f=document.querySelector('form');
f.addEventListener('submit',function(e){
    // agr mujhe ye krna  hia ki jo mene button diya hai uspe click krne pe wo ush url pe na jaye jo mene diya hai link me
    e.preventDefault();
    alert("form submitted")

    // FORM KE ANDR KA DTA ACCESS KRNE KE LIYE
    let i=document.querySelector('.in');
    let p=document.querySelector('#pass');
        console.log(i)
        // console.log("Data =",i.value)
        // console.log("Password =",p.value)
 
        // alert(`Y our college is ${i.value} and the password is ${p.value} `)

})

// MORE EVENT...........................
 
 let i = document.querySelector(".in")
 i.addEventListener('change',function(e){
    console.log("changed event")
    console.log("final change",this.value)
 })
  i.addEventListener('input',function(e){
    console.log("input event  ")
    console.log("final change",this.value)
 })

 let w=document.querySelector(".write")
 let pa=document.querySelector(".para")
 w.addEventListener('input',function(e){
    console.log(w.value)
       pa.innerText=w.value;
 })
