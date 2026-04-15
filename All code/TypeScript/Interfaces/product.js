"use strict";
//It ensure the type safety and if there is any missing properties inside the object then also it will show the error
//OBJECT 
//THERE NO CONCEPT OF INTERFACE IN JS THAT'S WHY  


var object = {
    id: 123,
    name: "Samsung s25 ultra",
    decription: "Very good phone",
    price: 1200000,
    display() {
        console.log("Hello" + this.name);
    }
};
var object2 = {
    id: 123,
    name: "Samsung s25 ultra",
    decription: "Very good phone",
};
var objArr = ["Ruchika", "Yadav"];
var studentScore = {};
studentScore["Ruchika"] = 100;
studentScore["Draco"] = 90;
for (var item in studentScore) {
    console.log(studentScore[item]);
    console.log(item);
}
