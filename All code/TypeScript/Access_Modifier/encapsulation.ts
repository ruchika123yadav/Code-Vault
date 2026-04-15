//Binding the data and code together means their properties and functions

class Employee{
       private name:string

       get getName():string{
        return this.name
       }

       set setName(name:string){
             this.name=name;
       }

       constructor(name:string){
        this.name=name;
       }
}

var emp=new Employee("Ruchi");
emp.setName="Ruchika";
console.log(emp.getName);
