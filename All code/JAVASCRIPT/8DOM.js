// DOM DOCUMENT OBJECT MODEL(the dom represents a document with a logical tree.) 
// dom ke andr har ek single node object hi haii js ke andr

// CONSOLE.DIR=> FOR PRINTING THE DOCUMENT OBJECT
// ALL ke andr hamne jitne bhi tag use kiye hai html me wo sare dikhayi denge
//  SELECTING ELEMENT%=>returns the element as an object or null(If not found)
// important jo bhi ye return krega wo bhi OBJECT HI HOGA
// .getelementclassname% returns the element as an html collection or empty collection 

// let images=document.getElementsByClassName("oldImg");
// for(let i=0;i<images.length;i++){
//     images[i].src="spiderman_img.png"
//     console.log(`value of image no.${i} is changed.`)
//  }

// //  tagname% returns the element as an html collection or empty collection

// // Query selector**
// console.dir(document.querySelector('p'))
// console.dir(document.querySelector('#description'))
// console.dir(document.querySelector('.oldImg'))
// // let change =document.querySelector('p')
// // change.innerText="abx"

// // for getting all anchor tag inside div
// console.dir(document.querySelectorAll('div a')); 

// // MANUPULATION PROPERTIES AND METHOD
// // innerText=>showa the visisble text conatined in a node
// // textContent% shows the full text  or ye wesa hi print hota hai jesa insex html me hmne iise likha hai
// // innerHTML%  shows the full markup

// // let heading = document uerycontec(h1)
// // heading.innerHTML=`<u>&{heading.innerTExt}<u/>`

// // MANUPULATING ATTRIBUTE 
// // Object.getAttribute(atr)
// // Object.setAttribute(atr)

// let ancor=document.querySelectorAll(".box a")
// for(let i = 0;i<ancor.length;i++){
//     ancor[i].style.color="pink"
// }

// for(ancor of ancor){
//     ancor.style.color="Purple";
// }

// let e = document.querySelector("P")
//     e.innerText="lorem10"

//     // MANUPULATING STYLE% obj.classList
//     // ckassList.add(to new class) and also use 
//     // remove % to remlve class
//     // contain % to verfiy class
//     // toggle%  yes to no and no to yes
// // s.classList.add("Ruchi")
// // replace add with remlve ,contain,and toggle

// // ADDING ELEMENT% document.createElement(P)
// // appendChild(element),replace append,prepend,insetAdjacent(where,element)  

// PRACTICE UESTION
let para = document.createElement("p");
para.innerText="hey i m kdjfgngnierngingirgnerred"
// para.innerText.color ="red" it doent make any sense c;ass hi banani padegi
document.querySelector("body").append(para);
 
 
// let h = document.createElement("h1");
// h.innerText="hey i m in a div"
 
// let p = document.createElement("p");
// p.innerText="hey i m me too"
 
// let d = document.createElement("div");
// d.append(h1)
// d.append(p)
// div.classList.add("box")

//  document.querySelector("body").append(div);

 let d = document.querySelector("div")
 let h = document.querySelector("h1")
 let p = document.querySelector("p")
 p.innerText="hey i m me too"
 h.innerText="hey i m in a div"


 d.append(h)
 d.append(p)
 document.querySelector("body").append(d)
 d.classList.add("box")

