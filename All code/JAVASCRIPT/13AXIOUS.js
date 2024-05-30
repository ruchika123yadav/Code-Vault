
// let btn=document.querySelector('button')
// let p=document.querySelector('p');
// let img=document.querySelector('img');
// btn.addEventListener('click',async function(){
//      let fact= await fet() 
//      img.setAttribute('src',fact)
//     //  p.innerText=fact;
//              })

// urll="https://catfact.ninja/fact";
// url="https://dog.ceo/api/breeds/image/random"

// async function fet(){
//     try{
//      let res=await axios.get(urll);
//      let resp=await axios.get(url);
//      return resp.data.message
//     //  return (res.data.fact); 
//     // agr yha hi console laga denge to wo to console me hi print krke de dega na
//     }
//     catch(er){
//          console.log(er);
//          console.log("Error found")
//     }
// }
// // fet();



// COLLEGE SEARCH

// let ur="https://icanhazdadjoke.com/"   //random joke wali link

let ur="http://universities.hipolabs.com/search?name="
 
let pp=document.querySelector('.p');
let but=document.querySelector('.bt');

but.addEventListener('click',async ()=>{
    let country=document.querySelector('input').value;
    console.log(country);
    let college= await  getcollege(country);
     
    colleg(college);

     
})
function  colleg(col){
    let list=document.querySelector('.list')
    list.innerText="";
    for(co of col){
     console.log(co.name);
     let li=document.createElement('li');
     li.innerText=co.name;
     list.appendChild(li);
    }}
async function getcollege(country){
    try{
        let res= await axios.get(ur+country);
        return res.data;
    }
    catch(er){
        console.log("Error Found")
        console.log(er);
    }
}
 
