class Employee{
    public firstName:string;
    public lastName:string;
    public designation:string;
    
    public print():void{
        console.log("Employee Details");
    }
}

class Manager extends Employee{
     constructor(firstName:string,lastName:string,designation:string){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.designation=designation;
    }

    public print():void{
        super.print();
        console.log(`${this.firstName} ${this.lastName} - ${designation}`);
    }
 
 }