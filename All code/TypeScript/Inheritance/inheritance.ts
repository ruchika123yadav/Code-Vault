class BMW{
    make:string;
    model:string;
    year:string;

    commonEngineFunction(){
        console.log("Common Function");
        }
    start(){
        console.log("Start");
        }
    stop(){
        console.log("Stop");
        }

        constructor(make:string,model:string,year:string){
            this.make=make;
            this.model=model;
            this.year=year;
        }
}


class ThreeSeries extends BMW{
        cruiseControlledEnabled:boolean;

        constructor(make:string,model:string,year:string,cruiseControlledEnabled:boolean){
            super(make,model,year);//invokation of parent class constructor
            this.cruiseControlledEnabled=cruiseControlledEnabled;
        }

        display(){
            console.log(this.make+" "+this.model+" "+this.year+" "+this.cruiseControlledEnabled)
        }

        start(){
        console.log("Button1 Start");
        }
    stop(){
        console.log("Button1 Stop");
        }
}
class FiveSeries extends BMW{
   parkingAssistEnabled:boolean;
   constructor(make:string,model:string,year:string,parkingAssistEnabled:boolean){
            super(make,model,year);
            this.parkingAssistEnabled=parkingAssistEnabled;
        }
        display(){
            console.log(this.make+" "+this.model+" "+this.year+" "+this.parkingAssistEnabled)
        }

        start(){
        console.log("Button2 Start");
        }
    stop(){
        console.log("Button2 Stop");
        }
}


var three=new ThreeSeries("make","model","year",false);
three.display();
three.start();
three.stop();

var five=new FiveSeries("make","model","year",false);
five.display();
five.start();
five.stop();


