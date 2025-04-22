//     Dynamic method dispatch(jo hamre superclass ka refernce hai wo eyal ho skta hia sub class ke lekin ulta nhi
 //ye run time pe decide hota hai ki konsa run hoga
class phone{
    public void great() {
        System.out.println("You  sre so great");
    }
    public void name(){
        System.out.println("My name is java");
    }
}
class smartphone extends phone {
    public void music(){
        System.out.println("play some music");
    }
    public void name(){
        System.out.println("My name is java in class two");
    }
}


public class CWH_Dynamicmethoddispatch {
    public static void main(String[] args) {
//        phone obj = new phone();  // jo obj hai wo reference hai
//        smartphone ob = new smartphone();
      // // smartphone ob = new phone(); // me ye nhi krr skta kyuki refernce ham base class ka hi use krr skte hai sub class se
        phone obj = new smartphone(); //iska mtlb ye hai ki phone ka ek refernce banay or ishe equal krr diya new phone ke
        //yha jo object hai wo hai phone ka lekin jo actual object hai o create ho rha hai smart phone ka
        // yha agr me smarphone ko extend nhi likhta to fir me ye call nhi krr skte tha
        obj.great();
          obj.name();  //to yha method wo object ka run hoga refernce ka nhi hoga run
        // this is called Dynamic method  dispatch
        // //obj.music();  //yha ham phone ke refernce se smart phone ki properties ko call nhi krr skte
    }
}
