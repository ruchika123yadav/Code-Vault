"use strict";
// The first one is let.
// let is a block scope variable. Once you use a variable with the let prefix,
// it will be available only within that block of code and not outside of it. Whereas when you define a variable
// with var it will be available for the entire function or the entire scope within which that var variable
// is defined. let is supported only starting JavaScript
//VAR
for (let i = 0; i < 10; i++) {
    console.log(i);
}
//  console.log(i);
//LET 
for (var i = 0; i < 10; i++) {
    console.log(i);
}
console.log(i);
//const
const pi = 3.14;
console.log(pi);
const product = function (x, y) {
    return x * y;
};
console.log(product);
//DECALRE
