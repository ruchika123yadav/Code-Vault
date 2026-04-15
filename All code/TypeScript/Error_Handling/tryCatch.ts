function division(a:number,b:number){
    if(b==0){
        throw new Error("Cannot divided by zero");
    }

    return a/b;
}


console.log(2,3);
console.log(2,0);

try{
    console.log(3,0);
}
catch(error){
    throw new Error("Cannot pass zero in b")
}
finally{
    console.log("I will run run and runnnnnnnnnnn")
}

console.log(23,4);

