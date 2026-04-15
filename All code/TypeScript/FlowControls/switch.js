"use strict";
var x = 24;
switch (x) {
    case 32:
        console.log("x is 32");
        break;
    case 23:
        console.log("x is 23");
        break;
    case 24:
        console.log("x is 24");
        break;
    default:
        console.log("Defualt is executed");
}
var y = 2;
switch (y) {
    case 1:
    case 2:
        console.log("Common Logic");
    case 24:
        console.log("x is 24");
        break;
    default:
        console.log("Defualt is executed");
}
