//just like multiple interface

interface Interior{
    seats:number,
    auto:Boolean
}
interface Exterior{
    body:string
}

interface Car extends Interior,Exterior{
    make:number,
    model:Boolean,
    year:number
}

 
var car:Car={
     make:123,
    model:true,
    year:345,
    seats:121,
    auto:true,
     body:"metal"
}