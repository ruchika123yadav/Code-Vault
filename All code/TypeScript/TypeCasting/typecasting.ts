// var x:string=prompt("Enter your age");
// TypeScript complains because prompt() might return null, and null cannot
//  be assigned to a variable typed strictly as string.

var x:string|null=prompt("Enter your age")?? "0";// null then assign to 0
console.log(x+3);

let input: string | null = prompt("Enter your age");
let y: number = input !== null ? parseInt(input) : 0;
console.log(y + 3);


//ARRAY
var arr  =["Ruchi","Ruchika","Racs"];
console.log(arr.toString());

let mybool:boolean=false;
let u:string = mybool.toString()
console.log(u);