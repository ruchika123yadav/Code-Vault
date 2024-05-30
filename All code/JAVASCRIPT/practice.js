 
 
 let url = "http://universities.hipolabs.com/search?name=";
let input = document.querySelector('input');
 let country="India";
 async function college(){
   try{
   let res = await axios.get(url+input.value);
   return res.data;
   // console.log(res );
 }
catch(e){
 console.log("Error,please enter correct country name",e);
}
 }
 let btn = document.querySelector('button');
 let ul = document.querySelector('.ul');


 btn.addEventListener('click',async function(){
             
            let name = await college();
            console.log(name);
            ul.innerText="";
            
            for(let i =0;i<name.length;i++){
               let li = document.createElement('li');
               li.innerText=name[i].name;
                ul.append(li);
            }
 })
  