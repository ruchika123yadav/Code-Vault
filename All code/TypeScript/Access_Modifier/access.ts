class student{
    public name:string;
    public readonly domain:string
    constructor(name:string,domain:string){
        this.name=name;
        this.domain=domain
    }
}

var obj = new student("ruchika","kuch nhi hai bhai");
obj.name="Ruchika";
// obj.domain="kya bataou";

console.log(obj.name)