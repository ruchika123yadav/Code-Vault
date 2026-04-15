var email:string="ruchika2gmail.com";
var atPosition:number=email.indexOf('@');
var dotPosition:number=email.indexOf('.');

if(atPosition==-1 || dotPosition==-1){
    console.log(`Invalid email ID ${email}`);
}
else{
    console.log("Email is valid");
}    
