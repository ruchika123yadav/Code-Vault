"use strict";
//Binding the data and code together means their properties and functions
class Employee {
    name;
    get getName() {
        return this.name;
    }
    set setName(name) {
        this.name = name;
    }
}
var emp = new Employee();
emp.setName = "Ruchika";
console.log(emp.getName);
