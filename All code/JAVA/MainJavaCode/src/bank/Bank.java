package bank;
//A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code.
// What do you mean by access modifier?
//Access modifiers (or access specifiers) are keywords in object-oriented languages that set the accessibility of classes, methods, and other members.
//class Account{
//    //    String name; defalult
//    public String name;
//    protected String email;
//    private int Password;  // to access this we generate getters and setters
//    public int getPassword(){
//       return  this.Password;
//    }
//    public  void setpassword(String pass){
////       this.Password= Integer.parseInt((pass));
//    }
//
//    public void setPassword(String s) {
//    }
//
//
////    ACCESS MODIFIER YANI KONSI CHEEZ KISKE LIYE ACCESSIBLE HOGI
////    4 TYPES
////    1. PUBLIC ye agr hamne kisi bhi ke bhi samne likh diya to ishe fir koi bhi access kar skta hai or kisi durse package se bhi
////    2. DEFAULT A agr aap kisi bhi package me kuch nhi laagate to ushme automatic default aa jata hai or or usse bank package me khi bhi acces kiya ja skta hai siwaye kisi another pacakge ke
////    3. PROTECTED  ISE HMARI BANK PACKAGE ACCESS TO KREGI lekin kisi dusre package ki sub class hi access krr skti hai
////    4. PRIVATE isse class ke bhr koi bhi acces nhi kar skta bss uske andr hi access hota hai
//}
//public class Bank{
//    public static void main(String[] args) {  // isse public hone ki kyu jarurt hai kyuki jab hamra compiler run krta hai to usse ek main class ko dekhna hota hai to ishlye ise public banate hai
//       Account account1= new Account();
//       account1.name="ruchika da college";
//        account1.email="ruchika@gmail.com";
////        account1.Password="123";  isko ham bank me access nhi krr skte ye private class hai bss apni hi class ke andr access hogi
//
//        account1.setPassword("123"); // ye nautanki de rha hai
//        System.out.println(account1.getPassword());
// }
//         }


// ********************************************************
//                   HARAAA BHAIYA

//class worker{
//    private  int salary;
//    private String name;

//    public String getname(){
//        return name;
//    }
//public void setname( String n){
//        name=n;
//}
//public int getsalary(){
//        return salary;
//}
//
//public void setsalary(int a){
//        salary = a;
//}
//}
//
// public class Bank{
//     public static void main(String[] args) {
//      worker emp= new worker();
//         emp.setname("ruchika yadav");
//         System.out.println(emp.getname());
//         emp.setsalary(5000000);
//         System.out.println(emp.getsalary());
//     }
// }
//


// **********

// class Circle {
//     private int radius;
//     private float area;
//     private float perimeter;
//
//     public void setradius(int r){     // get to chahiye hi nhi to ishne sirf radius ko set kiya hai
//         radius = r;
//     }
//     public void checkarea(float a){ // yha to wo value dega na to this.area= a krne ki koi jarurt nhi ham to bss check krr rhe hai na
//
//         area=3.14f*radius*radius;
//         if(area==a)
//         {
//             System.out.println("Correct Area.");
//         }
//         else{
//             System.out.println("Incorrect Area.");
//         }
//     }
//     public void checkperimeter(float p){
//         perimeter =p;
//         perimeter = 2*3.14f*radius;
//         if(perimeter==p)
//         {
//             System.out.println("Correct Perimeter.");
//         }
//         else{
//             System.out.println("Incorrect Perimeter.");
//         }
//     }
// }
// public class Bank{
//     public static void main(String[] args){
//         Circle ci= new Circle();
//         ci.setradius(3);   // ye hamne program banaya hai ki hamne tumhe radius de de fir to apne se calculate krke value dalo jisse tumhe pata chalega ki jo tumne calculate kiya hai wo shi hai ki nhi
//         ci.checkarea(28.0f);
//         ci.checkperimeter(18.84f);
//     }
// }

// ***********************************************************************
//                        CONSTRUCTOR(ye call ek baar hi hoga mtlb ek hi constructor ko call krega chae jitne bhi constructor bana lo tum)
// a constructor has the same name as that of the class and does not have any return type.
// class emp{
//     int id;
//     String name;
//
//     public emp(){  // agr me constructor me kuch pass na kroo to ye chalega fir
//         this.id = 45;
//         this.name = "Ruchika yadav";
//     }
//     public emp( int myid, String myname){
//         id=myid;  // yha jo phele wale id hai wo attribute hai or dusra function ka
//         name =myname ;  // or ha ek or cheez same naam ke argumnet mtt bana le lena jo object ke hai
//     }
////         copy constructor
//// public emp(emp empl){
////     name=emp.name;
////     id = emp.id;
////         }
////
//     public emp(String myname){  // constructor over load
//         id=1;
//         name=myname;
//     }
////     emp(){
////
////     }
// }
// public class Bank{
//     public static void main(String[] args) {
//       emp emply = new emp("ruchika");  // yha tum argument do ya na do koi problm nhi hai kyuki tumne unki value set kr di haii
////       emply.id=32;            // yha pe me agr ishe set krr du to fir to ye hi print hoga lekin agr nhi kiya to constructor wala print hi hoga
////       emply.name="Ruchika";
//         System.out.println(emply.id);
//         System.out.println(emply.name);
////           emp empl=new emp(emply);
////           emply.emp();
//////
//    }
// }
//

// ********************************
// overload the salary constructor to initialize the salary to 10000

// class euoo{
//     int salary;
//
//   public  euoo(){
//       this.salary=10000;
//   }
//    public euoo(int nsalary){
//       salary = nsalary;
//    }
// }
// public class Bank{
//     public static void main(String[] args) {
//      euoo ee = new euoo(3200000);// agr tumne upr bhi value initialize krr rakhi ahi or construtor me bhi ki hai to construcotr wali value show hogi
////         ee.salary = 4000000;
//         System.out.println(ee.salary);
//     }
// }


// ************************************************************************************
//            PRACTICE SET
//class cylinder{
//    private int radius;
//    private int height;
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//}
// public class Bank{
//     public static void main(String[] args) {
//        cylinder cy = new cylinder();
//        cy.setRadius(24);
//        cy.setHeight(12);
//         System.out.println(cy.getRadius());
//         System.out.println(cy.getHeight());
//     }
// }

// ****************

// class Cylinder{
//     private int radius;
//    private int height;
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//    public double area(){
//        return radius*radius*3.14;    // agr mujhe pi ki exact value lene ho to me Math.PI ke sath sath double bhi lagan hoga
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public double volume(){
//        return radius*radius*height*3.14;
//    }
// }
//
// public class Bank{
//     public static void main(String[] args) {
//         Cylinder cyy=new Cylinder();
//        cyy.setRadius(2);
//        cyy.setHeight(2);
//         System.out.println(cyy.area());
//         System.out.println(cyy.volume());
//     }
// }

// *********************************
//class Cylinder { // agr tumne koi bhi calue prvate banayi ahi to tum ushe cinstrucotor me bhi dalke access krr skte hoo
//    private int radius;
//    private int height;
//
//    public Cylinder(int radiuss,int heightt){  // dekho yha private banaya tha radius or height ko lekin mene constructor se access krr liyaa lekin bss main class me radius or height access nhi krr skta
//        this.radius=radiuss;
//        this.height=heightt;
//    }
//    public double area(){
//        return 2*Math.PI*radius*height;    // agr mujhe pi ki exact value lene ho to me Math.pi
//    }
//    public double volume(){
//        return radius*radius*height*3.14;
//    }
//
//}
// public class Bank{
//     public static void main(String[] args) {
//    Cylinder cyyy = new Cylinder(2,2);
////         System.out.println(cyyy.radius);
//         System.out.println("The are of the cylinder is:"+cyyy.area());
//         System.out.println("The volume of the cylinder is:"+cyyy.volume());
//     }
// }

// ***********
// overload a constructor
class rec{
    private int length;
    private int breadth;

    public rec(){ // isko ham constructor se bhi set krr skte hai yha
        this.length=2;
        this. breadth=2;
    }
    public rec(int lengt,int bread){
        this.length=lengt;
        this.breadth=bread;
    }
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
}

public class Bank{
    public static void main(String[] args) {
     rec rc= new rec(2,3);
//      or agr mene setter bhi bana diye inke or yha main class me set krke length access kri to wo set wali length hi dikhayega
        System.out.println(rc.getlength());
        System.out.println(rc.getbreadth());
    }


}