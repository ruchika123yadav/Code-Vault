"use strict";
//Implementing the interface
class FLight {
    flightNo;
    Form;
    to;
    duration;
    constructor(flightNo, Form, to, duration) {
        this.flightNo = flightNo;
        this.Form = Form;
        this.to = to;
        this.duration = duration;
    }
    display() {
        console.log(this.flightNo + " " + this.Form + " " + this.to + " " + this.duration);
    }
}
var flight = new FLight(2342, "Japna", "India", 2);
flight.display();
