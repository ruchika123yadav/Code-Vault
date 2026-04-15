// function hello(name:string):string{
//     return "Hello"+ name;
// }

// console.log(hello("Ruchika"));


function add(x:number,y:number):number{
    return x+y;
}

console.log(add(12,23));

function  display(id:number,name:string,role?:string){//optional parameters  
    console.log(id);
    console.log(name);
    if(role!=undefined){
        console.log(role);
    }
}

display(12,"Ruchika","Enginner");


function  tree(id:number,name:string,role:string="Experience"){//optional parameters  
    console.log(id);
    console.log(name);
    if(role!=undefined){
        console.log(role);
    }
}

tree(12,"Ruchika");

//function as a prameter
function calculator(fun:any):void{
    console.log(fun(10,20));
}

//returning the function

function subt():any{
    function sub(a:number,b:number):number{
        return a-b;
    }
    return sub;
 
}

var sub = subt();
 console.log(sub(20,4));
 //another method of calling the sub function
 console.log(subt()(24,4));

 //Anonymous function
 var hello = function (name:string):string{
    return "Hello"+name;
 }

 hello("Ruchika");