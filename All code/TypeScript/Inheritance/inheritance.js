"use strict";
class BMW {
    make;
    model;
    year;
    commonEngineFunction() {
        console.log("Common Function");
    }
    start() {
        console.log("Start");
    }
    stop() {
        console.log("Stop");
    }
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
class ThreeSeries extends BMW {
    cruiseControlledEnabled;
    constructor(make, model, year, cruiseControlledEnabled) {
        super(make, model, year);
        this.cruiseControlledEnabled = cruiseControlledEnabled;
    }
    display() {
        console.log(this.make + " " + this.model + " " + this.year + " " + this.cruiseControlledEnabled);
    }
    start() {
        console.log("Button1 Start");
    }
    stop() {
        console.log("Button1 Stop");
    }
}
class FiveSeries extends BMW {
    parkingAssistEnabled;
    constructor(make, model, year, parkingAssistEnabled) {
        super(make, model, year);
        this.parkingAssistEnabled = parkingAssistEnabled;
    }
    display() {
        console.log(this.make + " " + this.model + " " + this.year + " " + this.parkingAssistEnabled);
    }
    start() {
        console.log("Button2 Start");
    }
    stop() {
        console.log("Button2 Stop");
    }
}
var three = new ThreeSeries("make", "model", "year", false);
three.display();
three.start();
three.stop();
var five = new FiveSeries("make", "model", "year", false);
five.display();
five.start();
five.stop();
