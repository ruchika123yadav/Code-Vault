"use strict";
var product = function (...nums) {
    var result = 1;
    for (var i = 0; i < nums.length; i++) {
        console.log(nums[i]);
        result *= nums[i];
    }
    return result;
};
product(2, 3, 4, 5);
