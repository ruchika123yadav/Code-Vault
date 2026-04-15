"use strict";
var num1 = 20;
console.log(num1);
var num2 = 3.14;
console.log(num2);
var str1 = 'Success is the best revenge';
console.log(str1);
var Days;
(function (Days) {
    Days[Days["Monday"] = 0] = "Monday";
    Days[Days["Tuesday"] = 1] = "Tuesday";
    Days[Days["Wednesday"] = 2] = "Wednesday";
    Days[Days["Thursday"] = 3] = "Thursday";
    Days[Days["Friday"] = 4] = "Friday";
    Days[Days["Saturday"] = 5] = "Saturday";
    Days[Days["Sunday"] = 6] = "Sunday";
})(Days || (Days = {}));
for (let i = 0; i < 7; i++) {
    console.log(Days[i]);
}
