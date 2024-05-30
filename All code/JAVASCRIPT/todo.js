let btn = document.querySelector('button');
let input = document.querySelector('.input');
let ul = document.querySelector('ul');
let con = document.querySelector('div');

btn.addEventListener('click',function(){
    let list=document.createElement('li');
    list.innerText=input.value;
     con.append(list);

    let check=document.createElement('input');
    check.setAttribute('type', 'checkbox');
    check.classList.add("chk");
    list.appendChild(check); //bhai checkbox ka parent list hai bhaiii
    

    console.log(input.value);
    input.value="";
});

// let check=document.querySelectorAll("ul");
// for(lists of check){
//     lists.addEventListener('click',function(event){
//         if(event.target.nodeName=="INPUT"){
//             let item=event.target.parentElement;
//             item.remove();
//          }
         
//         // console.log(event.target.nodeName);
//         // console.log("checked");
//     })
// }
 
let check = document.querySelectorAll('ul')
for(tick of check) {
    tick.addEventListener('click',function(event){ //event .taget bata kisne event ko trigger kiya
        if(event.target.nodeName=='INPUT'){
            let parent = event.target.parentElement;
            parent.remove();
        }
    })
}
