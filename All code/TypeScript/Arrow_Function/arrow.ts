var hello = ():string=>{
     return "hello";
 }

 //passing parameter
var multiply= (a:number,b:number):number=>{
    return a*b;
 }
 console.log(hello());
 console.log(multiply(2,3));


 //Varags in array
 var myarray:Array<any>=[];

 for(var i =0;i<10;i++){
    myarray.push(():number=>{return i});
 }

 for(var i=0;i<10;i++){
    console.log(myarray[i]());
 }


 