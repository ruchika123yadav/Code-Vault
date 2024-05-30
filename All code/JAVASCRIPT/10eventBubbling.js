//  let div = document.querySelector('div')
//  let li = document.querySelector('li')
//  let ul = document.querySelector('ul')

//  div.addEventListener('click',function(){
//     console.log("Div was clicked")
//  })

//  ul.addEventListener('click',function(e){
//     e.stopPropagation();
//     console.log("ul was clicked")
//  })

//  for(lis of li){
//     li.addEventListener('click',function(e ){
//         e.stopPropagation();

//         console.log("li was clicked")
//      });
    
//  }

//  ACTIVITY

// let inn = document.querySelector('input');
// let b=document.querySelector('button')
// // let li=document.querySelector('li')

//  b.addEventListener('click',function(){
//     // console.log(inn.value)
//     let li=document.createElement('li')
// li.innerText =inn.value;
// document.querySelector('ul').append(li);
    


//     let bt=document.createElement('button')
//     bt.innerText="Delete"
//     //  bt.classList.add("delete")
//     li.appendChild(bt);
    
// inn.value="";

//  })
 
//  let t = document.querySelectorAll('.delete')
//  for(t of t){
//  t.addEventListener('click',function(){
//     let par = this.parentElement;
//     console.log(par);
//     par.remove();
//   })}


// COLOR GENERATOR

let btn = document.querySelector("button")
let h1= document.querySelector("h1");
let body = document.querySelector("div");

let random =()=>{
let r=Math.floor(Math.random()*255)+1;
let g=Math.floor(Math.random()*255)+1;
let b=Math.floor(Math.random()*255)+1;
let color=`rgb(${r},${g},${b})`;
return color
}
btn.addEventListener('click',function(){
    h1.innerText=random();
body.style.backgroundColor=random();

});

// const sum =(a,b) => {
//     console.log(a+b)
// };
// sum(4,5)
// console.log(sum)


 
