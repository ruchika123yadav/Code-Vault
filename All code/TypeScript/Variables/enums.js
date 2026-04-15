"use strict";
// ENUMS(Collections of constant values)
var gender;
(function (gender) {
    gender[gender["male"] = 0] = "male";
    gender[gender["female"] = 1] = "female";
})(gender || (gender = {}));
console.log(gender.male);
console.log(gender.female);
console.log(gender[0]);
console.log(gender[1]);
var weekends;
(function (weekends) {
    weekends[weekends["sunday"] = 7] = "sunday";
    weekends[weekends["monday"] = 1] = "monday";
})(weekends || (weekends = {}));
console.log(weekends[7]);
console.log(weekends[1]);
