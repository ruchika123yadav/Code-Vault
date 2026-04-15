"use strict";
class passenger {
    firstName;
    lastName;
    frequentFlyerNo;
    constructor(firstName, lastName, frequentFlyNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.frequentFlyerNo = frequentFlyNo;
    }
    display() {
        console.log(this.firstName + " " + this.lastName + " " + this.frequentFlyerNo);
    }
}
var Passenger = new passenger("Ruchika", "Yadav", 5);
Passenger.display();
//INSTANCEOF IN FUNCTION
for (var item in Passenger) {
    if (Passenger[item] instanceof Function) {
        continue;
    }
    else {
        console.log(item);
        console.log(Passenger[item]);
    }
}
// TypeScript complains because lastName (and the others) are not guaranteed to be assigned a value in the constructor. With strictPropertyInitialization enabled, every property must either:
// - be initialized at declaration,
// - be assigned inside the constructor, or
// - be marked with the definite assignment assertion (!).
