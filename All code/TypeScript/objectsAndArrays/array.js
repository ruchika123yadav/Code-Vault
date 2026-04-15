"use strict";
var arr = ["Happy", "Birthday", "TRequery"];
arr.push("tree");
arr.push(12);
for (var i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}
var [a, b, c] = arr; //desctructing
console.log(a);
console.log(b);
console.log(c);
