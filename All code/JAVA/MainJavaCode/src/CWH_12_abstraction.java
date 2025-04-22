

    //ABSTRACTION(IMPORTANT CHEEZE USER KO DIKHA DENA OR NON IMPORTANT USER SE CHIPPA LENA ) ham ishme constructor bana skte hai

//
//    abstract class Animal {  //ab dekho yha hame ish class ki to koi jarut nhi ham bss horse or chihcken class me dekhenge na ye to ek animal class hai na or wo to hame pata nhi na konsa animal
//    // iska ham bss object nhi bana skte
//    //to ham ishe abstract class de skte hai ki hame ishe dikhane ki koi jarurt nhi

//     abstract void walk();  //ab hamne ye walk function banaya hai prr iska hami implemenation chaiye dusre function me bss to ham ishe abstract banayenge ki ham ishe implement krr ske hamre sare funstion me
//     ha to ek cheez samaj nhi ayi ki agr ham ishe likh hi denge pura dusre class me to fayda hi kya iska yha likhne kaa
//     public void eat(){
//         System.out.println("Animals eats");
//     }
//     Animal(){  //costructor ye haal ki haal caal hoke value de dete hai
//         System.out.println("creating a new animal");
////         ab bss jab bhi run hoga to sabse phele wo base class ka run karayega constructor uske baad hoga derived class ka constructor call
//     }
//}
//class horse extends Animal{
//    public void walk(){
//        System.out.println("horse walks on 4 legs");
//    }
//    horse(){
//        System.out.println("You are a new horse");
//    }
//
//}
//class chicken extends Animal{
//    public void walk(){
//        System.out.println("chicken walks on 2 legs");
//    }
//}
//public class abstraction{
//    public static void main(String[] args) {
//        horse horse= new horse();
//        chicken chicken = new chicken();
//        horse.walk();
//        chicken.eat();  //hamne bhle hi useko abstract banaya hai lekin ham uski sari properties ko implement krr skte hai
//// isko ham actually create nhi krr skte       Animal animal = new Animal();  dekh rhe ho ham yha pe animal ko create hi nhi krr skte kyuki ye hamra ek abstract type hai like ek blue print hai bss
//    }
//}



    //    *********************************************************************************
//                                 HARAA BHAIYA( ek abstract pure class ko ganda krr deta hai)
//abstract class parent{  // iska object nhi ban skta abstrct class ek aishe class hai jiski help leek or bhi class banegii
//    public parent(){ // iske constructor ban skte hai
//        System.out.println("me parent ka constructor hu");
//    }
//    public void fi(){
//        System.out.println("Hi fi guyss");
//    }
//    public void hi(){
//        System.out.println("hey hey guys");
//    }
//    abstract public void yes();  //abstract methods me body nhi hoti
//        // dekho suno agr me yha ye method abstract nhi banata to ye mujhe fir override nhi krna padta fir me apne aap ki ish abstract class ki properties ko le skta tha
//}
//class child1 extends parent {
//    public void yes() {
//        System.out.println("yes ye mujhe banana pada kyuki parent class abstract thi or ye method bhi mene abstract banaya tha");
//    }
//}
//    // ye me nhi bana skta kyuki ya to tum ish method ko nhi bana skta kyuki ya to tum ish methos ko override krr lo ya ish class ko abstract class aban lo
//   class child2 extends child1{   // dekh yha pe mene bhott bada tikdum kiya hai yha phele abstract class thi lekin mene ishe child1 se extend kra liya error mhi aya or na hi jo methos child1
//// me extend liya hai wo bhi ishme nhi override krna pada or parent class ke methods bhi implement ho gye
////        abstract public void yes();  //abstract methods me body nhi hoti aur agr class abstract nhi hai to abstract method nhi likh skte
//        // dekho suno agr me yha ye method abstract nhi banata to ye mujhe fir override nhi krna padta fir me apne aap ki ish abstract class ki properties ko le skta tha
//
//        public void ree(){
//            System.out.println("i am the best");
//        }
//    }
//
//
//public class CWH_12_abstraction{
//    public static void main(String[] args) {
////  parent p = new parent();// abstract class hai nhi bana skta
//  child1  c= new child1();  // lekin uske methos ko override krke bana skte hai
//  child2 cc= new child2();
//  cc.fi();
//        c.fi();
//        parent p = new child1();  // lekin me iska dynamic method dispatch bana skta hu  or ye bhi constructor call krega
//        p.fi();
//        cc.yes();
////        p.yes();   lekin me child1 ki properties nhi print kra skta
//
//    }
//}



//    *************************************************
//                           STATIC(ham un cheez ko static krte hai jo  ki sabke liye same ho ske)
//    class Student {
//    String name;
//    static String school;
////    public static String changeschool(){  //static ki jitni bhi cheeze hoti hai unko memory ek hi baar di jati hai or object ki cheezo ko baar baar
////      return   school = "newschool";}  // dekho bhai agr tumne koi bada program banaya to ushme kha kha change krte phiroge school ishliye seedhe ek ho baar upr chanhe krr diya
//
//
//}
//
//    public class CWH_12_abstraction{
//        public static void main(String[] args) {
//            Student.school="ncr";  // static method ko ham class ke naam se acces krr skte hai na ki object banake krna padega kuiki ye class ki chezze hai
//            Student.school="npo";  // yrr mene to doo paar static bana diya phir bhi ishne chnage krr diya
//            Student student = new Student();
//             student.name="Ruchika yadav";
//            System.out.println(student.name);
//            System.out.println(Student.school);
////            System.out.println(Student.changeschool()); //** ye yha bhi shi nhi aa rha **  nhi nhi aya change hoke aya
//        }
//    }

//    ************************************************************************************
//                  PRACTICE SET 11
//    abstract class pen {
//    abstract void write();
//    abstract void refil();
//}
//
//class fountainpen extends pen {    // concreate class like a extends class
//    public void write (){
//        System.out.println("You want write something");
//    }
//    public void refil(){
//        System.out.println("Refil is like refil");
//    }
//    public void changenib(){
//        System.out.println("Changing the nib");
//    }
//
//
//}
//public class CWH_12_abstraction{
//    public static void main(String[] args) {
//fountainpen fp = new fountainpen();
//fp.changenib();
//    }
//}

//    *******************
//class Monkey {
//    public void jump(){
//        System.out.println("I am jumping");
//    }
//    public void bite(){
//        System.out.println("I will bite anyone");
//    }
//}
//interface BasicAnimal{
//    public void eat();
//    public void sleep();
//}
//class human extends Monkey implements BasicAnimal{
//    public void eat(){
//        System.out.println("I am eating a food");
//    }
//    public void sleep (){
//        System.out.println(" I am very lazy");
//    }
//
//}
//
//
//    public class CWH_12_abstraction{
//        public static void main(String[] args) {
//         human hm = new human();
//         hm.jump();
//         hm.sleep();
//         BasicAnimal ba = new human();
//               ba.jump();  ye nhi krr sktaaa
//         ba.eat();
//        }
//    }

//    ******************

//   abstract class telephone {
//    abstract public void ring () ;
//     abstract public void lift() ;
//   abstract public void disconnect() ;
//    }
//    class Smarttelephone extends telephone{
//      public void ring(){
//          System.out.println("I am ringging");
//      }
//      public void lift(){
//          System.out.println("I am lifting");
//      }
//
//      public void disconnect(){
//          System.out.println("I am disconnecting");
//      }
//    }
//
//
//    public class CWH_12_abstraction{
//        public static void main(String[] args) {
//
//            telephone tp = new Smarttelephone();
//            tp.ring();
//            tp.lift();
//        }
//    }

//    ****************************
//
    interface tvremote{
    public void channel();
    public void number(int number);
}
interface smarttvremote extends tvremote{
            public void yt();
}
class tv implements tvremote{
    public void channel(){
        System.out.println("turn on the channel");
    }
    public void number(int number){
        System.out.println(" change the channel to "+number+" number");
    }
    public int []arr(){
        System.out.println("Change the channel like this");
        int [] arr ={1,2,3,4,5};
        return arr;
    }
}
    public class CWH_12_abstraction{
        public static void main(String[] args) {
//            smarttvremote sm = new smarttvremote() ;  // nhi bana skte
      tv  t = new tv();
      t.channel();

            int [] arr = t.arr();
            for(int num:arr){
                System.out.println(num);
            }
            t.number(5);

        }
    }