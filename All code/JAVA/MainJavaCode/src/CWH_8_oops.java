

//                      OBJECT ORIENTED PROGRAMMING
// YE PROGRAMMING KRNE KO BHOOT HI popular approach me se ek hai
//object class se bani hui ek real entitiy hai
//  class wo capsule hai jiske and ham alag alag functionalities ko store krte hai
//class employee {
//////    public class employee {   //ek java file me sirf ek public class hoo skti hai
////        //
//        int id;         //ye meri ek custom class hai esi mene ishme add kiya hai
//        String name;     // YE PREOPERTIES HAI OR NICHE METHODS HAI
//        int Salary;
////
//        public void printdetail() {
//            System.out.println(this.id);    // ye bhi to mene ek class hi banayi hai to ishme me function or methods ko bhi add krr skta hu
//            System.out.println(this.Salary);    // idhar ye ID or NAME naame attributes hai ye
//               System.out.println(this.name);
//        }
////
////        public int Salary() {
////            return Salary;
////        }
//    }
////
////    //
//    public class CWH_8_oops {

//        public static void main(String[] args) {
//            employee Ruchika = new employee(); //Instantiating a new Employee Object
//Instantiation: Creating an object by using the new keyword is called instantiation. For example, Car ca = new Car(). It creates an instance of the Car class.
//            employee Om = new employee();
////        setting attributes to Ruchika
//            Ruchika.id = 90;
//            Ruchika.Salary = 34492045;
//            Ruchika.name = "Ruchika CEO of Microsoft";
//            // setting Attributes to Om
//            Om.id = 91;
//            Om.name = " Om CEO of Google";
//            Om.Salary = 29584922;
////        System.out.println(Ruchika.id);
////        System.out.println(Ruchika.name);
//            Ruchika.printdetail();    //ye object hai
//            Om.printdetail();
////            System.out.println(Ruchika.Salary());
//
//        }
//    }


//****************************************************************
//            PRACTICE SET

//class employee{
//    int salary;
//    String name;
//
//    public String detail(){
////        System.out.println("My salary is" + salary);
////        System.out.println("My name is"+ name);
//        return name;
//    }
//    public void setname( String n){
//        name=n;
//    }
//}
//
//public class CWH_8_oops {
//    public static void main(String[] args) {
//        employee employee1= new employee();
//        employee1.salary= 5000000;
//        employee1.name ="Ruchika yadav";
//         employee1.setname("ruchika yadav"); // yha agr tumne set name uski propertiy nhi banaya or function banaya hai to wo bhi uski property ki tarah kaam krega
//        System.out.println(employee1.name);  // or ye bhi ush set wala hi name le rha haii
////        employee1.detail();
//        System.out.println(employee1.detail());
//    }
//}

//************

//class Phone{
//    public void ringing(){
//        System.out.println("Phone is ringing");
//    }
//    public void vibrating(){
//        System.out.println("My phone is vibrating");
//    }
//    public void twitter(){
//        System.out.println("Open Twitter");
//    }
//}
//public class CWH_8_oops {
//    public static void main(String[] args) {
//   Phone poco = new Phone();
//   poco.ringing();
//   poco.vibrating();
//   poco.twitter();
//    }
//}

//***************

//class square{
//    int side=34;  //ye agr niche wali nhi likhi hoti to ye ishe manata
//
//    public void parameter(){
// //   public int parameter(){
////          return 4*side you will also do this
//
//        System.out.println("the parameter of square is"+ 4*side);
//    }
// public void area(){
//     System.out.println("The area of square is "+ side*side);
// }
//}
//public class CWH_8_oops {
//    public static void main(String[] args) {
//      square square1= new square();
//      square1.side=5;   // are agr me ish side ko upr hi initiate krr du tab bhi ye yhi wali ko parameter manega kyui ye mene main function me likhi ahi
//      square1.parameter();
//      square1.area();
//    }
//}

//*********
class pubg{
    public void hit(){
        System.out.println("HIT: banda banda banda maar maar maar");
    }
    public void run(){
        System.out.println("RUN: abe bhaag dokh dalenge hamkoo wrna");
    }
    public void fire(){
        System.out.println("FIRE: maar maar maar dokh daal maiyowe koo");
    }
}


 public class CWH_8_oops{
     public static void main(String[] args) {
        pubg pg = new pubg();
        pg.fire();
        pg.hit();
        pg.run();
     }
 }