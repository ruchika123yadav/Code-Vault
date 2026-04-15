interface Add{
     
    (a:number,b:number):number
    //(a:number,b:number):void here for void I can overwrite my own datatype in object creation 
     
}

interface Sub{
    (a:number,b:number):number
}

var add:Add;
var sub:Sub;

add=function (x:number,y:number):number{
    
    return x+y;

}

sub=function (x:number,y:number):number{
    return x-y;
}

