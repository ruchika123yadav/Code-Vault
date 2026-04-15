interface Iflight{
    flightNo:number;
    Form:string;
    to:string;
    display():void;
}

//Implementing the interface

class FLight implements Iflight{
    flightNo:number;
    Form:string;
    to:string;
    duration:number

    constructor(flightNo:number,Form:string,to:string,duration:number){
        this.flightNo=flightNo;
        this.Form=Form;
        this.to=to
        this.duration=duration
    }

    display(): void {
        console.log(this.flightNo+" "+this.Form+" "+this.to+" "+this.duration);
    }
}

var flight = new FLight(2342,"Japna","India",2);
flight.display();