"use strict";
var email = "ruchika2gmail.com";
var atPosition = email.indexOf('@');
var dotPosition = email.indexOf('.');
if (atPosition == -1 || dotPosition == -1) {
    console.log(`Invalid email ID ${email}`);
}
else {
    console.log("Email is valid");
}
