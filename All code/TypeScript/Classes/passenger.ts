class passenger{
    firstName:string;
    lastName:string;
    frequentFlyerNo:number

    constructor(firstName:string,lastName:string,frequentFlyNo:number){
          this.firstName=firstName;
          this.lastName=lastName;
          this.frequentFlyerNo=frequentFlyNo;
    }
    display(){
        console.log(this.firstName+" "+this.lastName+" "+this.frequentFlyerNo)
    }
}

 
var Passenger=new passenger("Ruchika","Yadav",5);
Passenger.display()


//INSTANCEOF IN FUNCTION
 
for(var item in Passenger){
    //it will skip the display function becuase it also it's property
    if(Passenger[item] instanceof Function){
        continue;
    }
    else{
        console.log(item);
        console.log(Passenger[item]);
    }
}

// TypeScript complains because lastName (and the others) are not guaranteed to be assigned a value in the constructor. With strictPropertyInitialization enabled, every property must either:
// - be initialized at declaration,
// - be assigned inside the constructor, or
// - be marked with the definite assignment assertion (!).

 
