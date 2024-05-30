let gameSeq=[];
let userSq=[];
let h3 = document.querySelector('h3');
let started = false;
let level = 0;      
let arr=['red','orange','pink','blue'];
let max=1;

//  (1)---> if game started then levelup ko call kro
document.addEventListener('keydown',function(){
    if(started==false){
      console.log("Game Started"); 
        started=true;

        levelUp();
    }
})
// (3)---->  jo ham ham  2 sec ke liye white color print kara rhe uske liye function

    function gameFlash(btn){
     btn.classList.add('addColor');
     setTimeout(() => {
        btn.classList.remove('addColor');
    },250);
}

//   (6)---->
function userFlash(btn){
     btn.classList.add('userColor');
     setTimeout(() => {
        btn.classList.remove('userColor');
    },250);
}
// (2)--->  jo ham level ki values dikha rhe and btnflash karane ke liye class add krr rhe
function levelUp(){
  userSq=[];
    level++;
    if(level>max){
      max=level;
    }
     h3.innerText="Level "+level;
   let random = Math.floor(Math.random()*4); //flash karwane ke liye ki koi bhi 
// color class select kre or ushe select krke flash karwaye
let color=arr[random]
  let flash=document.querySelector(`.${color}`)
  gameSeq.push(color);
    gameFlash(flash);
    
}

// (7)---->
function equal(ind){
  if(gameSeq[ind]===userSq[ind]){
    if(gameSeq.length==userSq.length){
    setTimeout(levelUp,550);

  }
      }
  else{
     h3.innerHTML=`Game Over! your Score is <b>${level}</b> <br> Press any Key to Restart the Game<br> <b>Maximum Score is ${max}</b>`
     document.querySelector('body').style.backgroundColor='red';
     setTimeout(()=>{
      document.querySelector('body').style.backgroundColor='white';
     },350);
     reset();
  }
}

//   (5)---->
   function btnpress(){
    let btn=this;
    userFlash(btn);
    let userColor=btn.getAttribute('id');
     
    userSq.push(userColor);
    equal(userSq.length-1);
  }

// (4)---->
let btn = document.querySelectorAll('.btn');
for(btns of btn){
    btns.addEventListener('click',btnpress);
}
//  (8)--->
function reset(){
  userSq=[];
  gameSeq=[];
  level=0;
  started=false;
}
