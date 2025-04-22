
//                                                  INHERITANCE
// 4 TYPES


//class shape{   //jiss class se properties li jati hai *BASE CLASS*
//    String color;
//    public void area(){
//        System.out.println("Displays area");
//    }
//}
//class triangle extends shape{ //*SUB CLASS       // iska mtlb ye hua ki triagle class ne shape ki class ko inherit krr liya yani ki uski properties ab automatic trianglr class me homgi
//    //ye tha single inheritance ka type
//public void area(int l, int h){
//
//    System.out.println(0.5*l*h);
//}
//class equilateraltri extends triangle{
//    // ye tha multilevel inheritance ka type
//    public void area(int l, int h){
//        System.out.println(0.5*l*h);
//}
//class circle extends shape{
//        //ye hai hierarchial inheritance
//        public void area(int r){
//            System.out.println(3.14*r*r);
//        }
//}
//}
//}
//public class CWH_10_Inheritance {
//    public static void main(String[] args) {
//        triangle t1= new triangle();
//        t1.color="red";  //dekha koi error nhi aya kyuki inhertance ki wajah se shape class ki properties hi nhi balki uske function bhi ushme automatic aa ajayenge
//        //isse iski reusability badti hai mtlb baar baar same code nhi likhna padta hai
//        System.out.println(t1.color);
//        t1.area(2,2);
//
//    }
//}

//*************************************************************************************************************************************
//                                     HARRA BHAIYA
//class base {
//    int x;
//    public void print(){
//        System.out.println("hello i am nothing");  //agr ye constructur nhi hai to ye bin acall kiye print nhi hoga
//    }
//
//    public int getx() {
//        return x;
//    }
//
//    public void setx(int x) {
//        this.x = x;
//    }
//}
//    class yoo extends base{
//        int y;
//        public int gety(){
//            return y;
//        }
//        public void sety(int y){
//            this.y=y;
//        }
//    }
//public class CWH_10_Inheritance {
//    public static void main(String[] args) {
//       base bs=new base();
//     bs.setx(4);
//        System.out.println(bs.getx());
//        yoo yo=new yoo();
//        yo.setx(5);
//        System.out.println(yo.getx());
//        yo.sety(34);
//        System.out.println(yo.gety());
//       yo.print();
//    }
//}

//************************************************************
//                   CONSTRUCTOR IN INHERITANCE
//
//class base1 { // BASE CLASS(hamesa sabse phele constructor base class ka run hoga
//    public base1() {
//        System.out.println("hi i am a base class constructor");
//    }
//
//    public base1(int a) { // jab me ishe banaounga to derive class wala by default bina argumnet wale constructor ko call krega
//        System.out.println("The value of a is" + a);   // lein agr ham ishe phele call krwana chahe to hame fir super key word ka use rkna hoga
//    }
//}
//    class derive extends base1{   // agr me yha derive class me constructor banata nhi to wo base class ke constructor ko hi call krr deta like jese hi derice class me ata to base constructor ko call krta fir apna construt krr wata
//        public derive(){
//                  // super(0);  // ye ek particular constructor ko call krwane ke kaam ata hai
//            System.out.println("here i am a derived constructor");
//        }
//        public derive(int a, int b){
//            super(a);
//            System.out.println("hey i am the derive2 constructor"+a+b);
//        }
//    }
//    class dev extends derive{
//    public dev(){
//        System.out.println("hey i am the dev constructor");
//    }
//    public dev(int a,int b, int c){
//        super(a,b);      // yha agr me koi agrgumnet de du or iske niche teeno argument likh do to ye super wala argument ko hi print krega
//        System.out.println("hey i am the origin"+a+b+c);
//    }
//    }
//public class CWH_10_Inheritance {
//    public static void main(String[] args) {
////          base1 bss = new base1(5);  //agr me ishme kisi ek particular constructat ko call krr waunga to usse  jo upr wala default constructor hai wo call nhi hoga
//          base1 bss = new base1();  //
//          derive d = new derive();  // agr me ishe call krta to ye bina argument wale constructor ko call krta
////           derive d = new derive(2,3);
//              dev c = new dev();
////              dev c = new dev(1,2,3);
////         or ye hamshe kisi bhi class ke liye phlee default constructor banwayega uske baad koi argument wale constructor ko call krwaega
//    }
//}

//
////**********************************************
////           METHOD OVER RIDING(same method of base class ko dusre sub class me likhna aur argument bhi same hona chahiye )
//
//class a {
//    int A;
//    public int ruchi(){
//        return 4;
//    }
//    public void meth2(){
//        System.out.println("i am method 2 of class a");
//    }
//}
//class b extends a { //are yrr mene yha se extends hata diya fir bhi call ho rha tha wo mtlb same method ham alg alg calss me bana skte hai
//   @Override   // isse ham jab bhi base classs ke ushi mehtos ko change krenge to ye bata dega ab override nhi ho rha
//    public void meth2(){   // yha b ne class a ke meth 2 ko apna implement krr diya
//        System.out.println("i am the method2 of class b");
//    }
//
//    public void meth3(){
//        System.out.println("i am method of 3 of class b");
//    }
//}
//
//public class CWH_10_Inheritance {
//    public static void main(String[] args) {
//   a tey = new a ();
//   tey.meth2();
// b hey = new b();      // accha ruchi to yha hamara constructor ek bhi baar call hota hia to ye didi kah rhi thi
//      hey.meth2();
//        System.out.println(hey.ruchi());
//    }
//}


//**************************************************************************************
//                  PRACTICE SET
// class circle{
//     int radius;
//     public circle(){
//         System.out.println("this is default jaan buj ke banwaya cylinder class ne");
//     }
//     public circle(int r){
//         this.radius=r;
//     }
//     public double areac(){
//         return radius*radius*3.14;
//     }
//}
//class cylinder extends circle{
//     int height;
//     public cylinder(int r,int h){   // ye wla dene ke baad bhi
//         super(r);
//         this.height=h;
//         System.out.println("Hi am the cylinder constructor");
//     }
//     public double areacy(){
//         return radius*radius*3.14*height;
//     }
//
//}
//public class CWH_Inheritance {
//    public static void main(String[] args) {
//        circle cr = new circle(3);
//        cylinder cy = new cylinder(2,2);  //oo ho iska mtlb jab ye function call hoga to r ki value 3 se 2 hojayegi
//        System.out.println(cy.areacy());
//        System.out.println(cr.radius);
//    }
//}

//********************
class rectangle{
    int length;
    int breadth;
    public boolean time(){
        System.out.println("I am showing the time");
        return false;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
rectangle(){
    System.out.println("I am default");
}
    rectangle(int l, int b){
      this.length=l;
      this.breadth=b;
    }
    public int arear(){
        return length*breadth;
    }

}

class dance{
    public void step(){
        System.out.println("We are dancing");
    }
}
class cuboid extends rectangle{
        int height;
        public int geth(){
            return height;
        }
        public void seth(int h){
            this.height=h;
        }
        public cuboid(int l,int b,int h){
            super(l,b);
            this.height=h;
        }
        public int areacu(){
            return 2*(length*breadth + length*height+ breadth*height);
        }
        public int volcu(){
            return length*breadth*height;
        }
}
public class CWH_10_Inheritance {
    public static void main(String[] args) {
        rectangle rc= new rectangle(2,3);
        rc.setLength(3);  // in dono se ye sabit hota hia ki get or setter set krne kee baad agr ham apne method me bhi agr agumnet de de to wo  hamare setter wale argument ko hi manegaa
        rc.setLength(3);
        cuboid cu = new cuboid(2,2,2);      // or ye yha bahle hi tumne rectangle ke de diye ho argument lekin wo ishi constructor ke argument hi manega
        System.out.println(cu.volcu());
        System.out.println(rc.arear());
        System.out.println(rc.time());

    }
}