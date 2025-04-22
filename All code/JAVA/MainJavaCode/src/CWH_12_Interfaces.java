//    INTERFACES(it uses implement keyword and ishme sare method abstract hi hote hai by default)
// abstraction and interfaces me bss ye hi differnce tha ki ham abstract me ek hi baar extend krr skte the mtlb agr ek class extend kri or dursri class banayi jisme parent class or jo upr ek or enxt xlass banayi hai usko extend krenge ek sath to nhi hogaa
// jo ki ye interfaces me ho skta hai or ham extend bhi krr skte hai implement ke sath
// static methods ek aisha method hota hia jo associated hota hai class and interface se kyuki interface ka ham refernce bana skte hai
  // INTERFACE
//    interface Animal {
//      public void walk();  //mujhe ye ceez samaj nhi aa rhi agr ham iska use nhi krr rhe to ham ishe ban kyu rhe hai
////      public void eat(); or yhs do do nhi bana skte
//      int eyes =2; // yha jo animal ke liye properties hogo wo fix hogi har ek sub class ke lieye
//
////   Animal();// ab yha ham constructur ko define nhi krr skte  kyuki iske constructor nhi ho skte
//
//    interface Herbivore{
//        void run();  // interfaces me hi ham multiple implements ka krr skte hai na ki class me
//    }
//}
//  class loin implements Animal {//, Herbivore {   // or yha extends nhi krte bkli implement krte hia
//public void walk(){
//    System.out.println("King of the jungle");
//}
//  }
//
//    public class abstraction{
//        public static void main(String[] args) {
//     loin loin = new loin();
//     loin.walk();
////     loin.eyes= ; // ISHE BHI KESE ACCES KRNA HAI PATA NHI
//        }
//    }
//************************************************************************
                                          //haraaa
//interface bicycle {
//    int a =45;  // ye final value hoti hai inhe change nhi krr skte
//    public void applybrake(int decreament);
//    public void speedup(int increament);
//}
//interface movie{
//    public void krish();
//    public void don();
//
//}
//class atlas implements bicycle,movie{    // dekha iterface dono ek sath extend krr lii
//    public void applybrake(int decreament){  // samaj gye ye argument sahit likhna padega
//        System.out.println("ok ok bana liya");
//    }
//    public void speedup(int increament){  //implement krane ke baad sare method pubic likhne padenge
//        System.out.println("ha ha ye bhi bana liyaa");
//    }
//    public void krish(){
//        System.out.println("Super hero Ruchi");
//    }
//    public void don(){
//        System.out.println("Super don ruchi");
//    }
//}
//
//public class CWH_12_Interfaces {
//    public static void main(String[] args) {
////           bicycle b = new bicycle() ;  // mtlb iterface ka bhi object nhi bana skte
//              atlas at = new atlas();
//              at.applybrake(3);
//            //  at.a=34;  //me yha ishe assin nhi krr skta ye finals value hoti hai interface ki
//        System.out.println(at.a);
//bicycle by = new atlas();
//        System.out.println(bicycle.a); // jab me kuch le hi nhi paa rha kya fayda fir
//        by.applybrake(2);  // are wah wese ham atlas ke method ko access nhi krr skte isse lekin atlass me jo likha hai wo ish method mw likke aa rha hai
//        at.krish();
//        at.don();
//    }
//}


//**********************************************
//                  DEFAULT METHODS

// ish program ko acche se run krke dekhna ek ek cheez ko tabhi samaj ayega wrna tu kuch cheezo ko nhi samaj payegi

//
//interface mycamera{
//    void takesnap();
//    void recordvideo();
////    void yup();// ye me nhi krr ksta agr mene iss bhott sare implement krra di to baar baar har ek class me mujhe jake ushe shi krna hoga
//    private void greet(){
//        System.out.println("Good moring man"); //ab me ishe apni main class me implement to krr nhi kskta tha to mene ishe override kiya default me
//       // ye ham private ishliye use krr rhe hai kyuki agr kabhi defalut ka logic jada bada ho jaye to ham ushe private method me daal krr private method ko access krr kste hia
//    }
//    default  void yup(){
//        greet();  // me ish method ko directly use nhi krr skta
//        System.out.println("yup man yup ");// or me ish override bhi krr skta hu or override krkre me jo ush wale override me likhunga whi ayeg alikke
//        //or ham ishe access bhi kra skte hai
//    }
//}
//interface mywifi{
//String [] getnetwork();
//void connectnetwork(String network);
//}
//class Mycellphone{
//    void callnumber(int number){
//        System.out.println("calling"+ number);
//    }
//    void pickcall(){
//        System.out.println("connecting....");
//    }
//
//}
//class MySmartphone extends Mycellphone implements mywifi,mycamera{
//  public void takesnap(){
//        System.out.println("taking a snap man");
//    }
//   public void recordvideo(){
//       System.out.println("record the video ruchii");
//    }
//    public String [] getnetwork(){
//        System.out.println("getting list of network");
//        String [] netwoklist = {"ruchi","om","harry"};
//        return netwoklist;
//    }
//    public void connectnetwork(String network){
//        System.out.println("connecting to"+ network);
//    }
//
//}
//
//
//public class CWH_12_Interfaces {
//    public static void main(String[] args) {
////Smartphone sm = new Smartphone();  // method  overriding
////sm.getnetwork();
//        MySmartphone sm =new MySmartphone();
////        sm.getnetwork();
//        sm.takesnap();
//        String[] ar = sm.getnetwork();
//        for( String item:ar){
//            System.out.println(item);
//        }
//        sm.yup();
//    }
//}

//****************************************
//            INHERITANCE IN INTERFACE(ham ek interface se durse interface ko extends krr skte hia
//interface sample{
//    void meth();
//    void meth1();
//}
// interface sample2 extends sample{
// void meth2();
// void meth3();
//}
//class ruchi implements sample2{ // bhle hi hamne sample2 interface ko hi implement kiya ho leikn hame uhsme jo methods hai wo sample ke bhi likhne padenge kuiki sample2 extend krr rahi hai sample ko
//    public void meth(){
//        System.out.println("i am meth");
//    }
//    public void meth1(){
//        System.out.println("i am meth1");
//    }
//    public void meth2(){
//        System.out.println("i am meth2");
//    }
//    public void meth3(){
//        System.out.println("i am meth3");
//    }
//}
//
//public class CWH_12_Interfaces {
//    public static void main(String[] args) {
//ruchi rc = new ruchi ();
//rc.meth();
//rc.meth1();rc.meth2();rc.meth3();
//    }
//}

//*****************************************
//       POLYMORFISM IN INTERFACES

//interface sample1{
//    void meth();
//    void meth1();
//}
////class ye extends sample{} me ye nhi krr skta kyuki ye ishe extends nhi implement krti hai
//interface sample2 extends sample1{
//    void meth2();
//    void meth3();
//}
//class ruchi1 implements sample2{ // bhle hi hamne sample2 interface ko hi implement kiya ho leikn hame uhsme jo mehtos hai wo sample ke bhi likhne padenge kuiki sample2 extend krr rahi hai sample ko
//    public void meth(){
//        System.out.println("i am meth");
//    }
//    public void meth1(){
//        System.out.println("i am meth1");
//    }
//    public void meth2(){
//        System.out.println("i am meth2");
//    }
//    public void meth3(){
//        System.out.println("i am meth3");
//    }
//}
//
//public class CWH_12_Interfaces {
//    public static void main(String[] args) {
//        ruchi1 rc = new ruchi1 ();
//        rc.meth();
//        rc.meth1();rc.meth2();rc.meth3();
//
////       DYNAMIC MEMORY DISPATCH
//        sample1 sc = new ruchi1() ;   //this is a ruchi1 but use it as a sample1
//         sc.meth1();
//         sc.meth();
////         sc.meth2();   me ye nhi krr skta me sirf sample1 ke hi methods ko access krr skta hu
//
//
//    }
//}