"use strict";
class CustomError extends Error {
    constructor(message) {
        super(message);
        this.name = "Custome Error";
    }
}
function throwCustomError() {
    throw new CustomError("This is my custome Error");
}
try {
    throwCustomError();
}
catch (error) {
    if (error instanceof CustomError) {
        console.log("Error " + error.message);
        console.log("Error " + error.name);
    }
}
