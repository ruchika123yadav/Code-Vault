class Bank{
    static bankName:string="Bank of Japan";
           customerName:string;
           accNo:number;
           routingNo:number;
    //we have to create the constructor here or initialize the default value here only otherwise it will give the error 
           constructor(customerName:string,accNo:number,routingNo:number){
            this.customerName=customerName;
            this.accNo=accNo,
            this.routingNo=routingNo
           }
}

var bank=new Bank("Ruchika",123123132,13132131);
    //   bank.bankName="tree"; show the error

    Bank.bankName="He He Bank";
    console.log(Bank.bankName);

