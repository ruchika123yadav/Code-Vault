//INTERFACES
interface Iproduct{
    id:number,
    name:string,
    decription:string,
    price:number
    display():void
}

//It ensure the type safety and if there is any missing properties inside the object then also it will show the error

//OBJECT 
var object:Iproduct={
    id:123,
    name:"Samsung s25 ultra",
    decription:"Very good phone",
    price:1200000,
    display():void{
        console.log("Hello"+this.name)
    }
}


//OPTIONAL PROPERTIES

interface Iproduct2{
    id:number,
    name:string,
    decription:string,
    price?:number
}

var object2:Iproduct2={
    id:123,
    name:"Samsung s25 ultra",
    decription:"Very good phone",
    
}

//Interface Array
interface student{
    [index:number]:string
}

var objArr:student=["Ruchika","Yadav"]


interface StudentScore{
    [index:string]:number
}

var studentScore:StudentScore={}

studentScore["Ruchika"]=100;
studentScore["Draco"]=90;

for(var item in studentScore){
    console.log(studentScore[item])
    console.log(item)
}