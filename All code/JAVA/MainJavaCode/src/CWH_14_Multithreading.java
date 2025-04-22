
// YE THREAD BASICALLY KUCH TIME METH1 METHOD KO OR METH2 METHOD KO DEGA RUN HONE ME
// MTLB KABHI KABHI METH1 KE METHOD RUN HONGE OR KABHI KABHI METH 2 K METHOD RUN HONGE
// YE BASICALLY HAMRA TIME BACHATA HAI MANLO AGR FUNCTION 1 CHALTA HI RHA TO THREAD KI WAJAH SE FUNTION 2 BHI CHALEGA


//class thread1 extends Thread{
//    public void run() {  // ye run method  thread ka hi ek part hai to agr tum apna koi likhoge to start se nhi chalega Aur Agar apna dusra method bana ke chaloge to chal to jayega lekin  thread nahi hogi
//        int i = 0;
//        while (i < 40) {
//            System.out.println("I am meth");
//            i++;
//        }
//    }
//}
//class thread2 extends Thread {
//    public void run() {
//        int i = 0;
//        while (i < 40) {
//            System.out.println("Hey i am good");
//            i++;
//        }
//    }
//}
//
//
//public class CWH_14_Multithreading {
//    public static void main(String[] args) {
//        thread1 th = new thread1();
//        thread2 thh = new thread2();
//        th.start();   // jo start method hai na wo apne app hi meth method k co call krr leag ye sari implemeatation thread me hai
//        thh.start();
//    }
//}


//*****************************************************8
//      BY IMPLEMENTING RUNNABLE INTERFACE( Another method of threading )

//class MYthrunnable1 implements Runnable{
//    public void run() {
//        int i = 0;
//        while (i < 60) {
//            System.out.println("I am a thread1");
//            i++;
//        }
//    }
//}
//class MYthrunnable2 implements Runnable {
//    public void run() {
//        int i = 0;
//        while (i < 60) {
//            System.out.println("I am a thread222");
//            i++;
//        }
//    }
//}
//
//public class CWH_14_Multithreading {
//    public static void main(String[] args) {
//        MYthrunnable1 bullet1 = new MYthrunnable1();
//        Thread gun1 = new Thread(bullet1);  // apne ek naya thread to bana diya or usko de diya ek runnable yani bullet1 and bullet2
//
//        MYthrunnable2 bullet2 = new MYthrunnable2();
//        Thread gun2 = new Thread(bullet2);  //ye hamne banaya hai thread jisme bullet2 hai runnable
////        mr.start();
//        ///aap  jab bhi runnable methos ko implement krte ho aap start methos ko directly use nhi krr paoge
//
//        gun1.start();
//        gun2.start();
//
//    }
//}


//******************************************************************************
//                              THREAD CONSTRUCTOR OF JAVA(id deffault 16 se start hai)
//                Is programme men main super keyword ruchika Jo likha hai usaka use kaise karun --> ans. by the getname property se
//class MYthr extends Thread {
//    public MYthr(String naam){
//        super("Ruchika");// Jo tum upar string Mein naam doge vahin tumhe Super() bhi naam likhna padega yha ye jo thread class hai uska ek already constructor hai jo ki name ke argument ko leta hai
////        Are AA Gaya ye super Mein Jo ruchika lekha hai wo tum aise access karoge Ki jab tum printed men getname method ko likhenge tab apne AAP ruchika  likha jayega
//        System.out.println("I am");
//    }
//    public void run(){
//        int i = 0;
//        while(i<50){
//            System.out.println("I am thread hu ha hu ha");
//            i++;
//        }
//    }
//
//}
//
//public class CWH_14_Multithreading {
//    public static void main(String[] args) {
//   MYthr m = new MYthr("RU");
//   MYthr mm = new MYthr("");
// m.start();
//        System.out.println("The id of the thread m is "+ m.getId());  // ye ek method hai thread me jo ki id deta hai thread ki id
//        System.out.println("The id of the thread m is "+ m.getName());
//        System.out.println("The id of the thread mm is "+ mm.getId());
//        System.out.println("The id of the thread mm is "+ mm.getName());
//    }
//}


//*********************
//         ye mere pe nhi aya bilkkul nhi aya  // metal bhuddhu ye thread class ke method runnable me kese chal jayenge
//java runnable is an interface used to execute code on a concurrent thread. It is an interface which is implemented by any class if we want
// that the instances of that class should be executed by a thread. This method takes in no arguments.
//class MYthr  implements Runnable {
//    public MYthr(Runnable r, String name){
//
//    }
//          public void run(){
//             int i = 0;
//            while(i<50){
//                System.out.println("what is runnable argument!!!!");
//                i++;
//        }
//        }
//}
//public class CWH_14_Multithreading {
//    public static void main(String[] args) {
//        Runnable m = new MYthr(m,"Ruchika yadav");
//        Thread th = new Thread(m);
//
//        Runnable mm = new MYthr("","Ruchi yadav");
//        Thread thh = new Thread(mm);
//        th.start();
//        System.out.println("The id of the thread m is "+ th.getId());  // ye ek method hai thread me jo ki id deta hai thread ki
//        System.out.println("The id of the thread m is "+ th.getName());  // ye ek method hai thread me jo ki id deta hai thread ki
//        System.out.println("The id of the thread mm is "+ thh.getId());  // ye ek method hai thread me jo ki id deta hai thread ki
//        System.out.println("The id of the thread mm is "+ thh.getName());  // ye ek method hai thread me jo ki id deta hai thread ki
//    }
//}


//*******************************************
//                   THREAD PRIORTIES
//
//class prior extends Thread{
//    public prior(String name){
//        super(name);   //agr tumne idhar name likh diya or niche constructor ko bhi de diya to ye super wala name print krega
//    }
//    public void run(){
//        int i = 0;
//
//        while(i<80){
//            System.out.println("Thank yo "+ this.getName());
//            i++;
//        }
//    }
//}


//public class CWH_14_Multithreading {
//    public static void main(String[] args) {
//        prior pr  = new prior("Ruchika Yadav");
//        prior prr  = new prior("Rajesh Yadav");
//        prior p  = new prior("Mala devi");
//        prior po  = new prior("Urmila devi");
//        prior pe  = new prior("om Yadav");
//        pr.setPriority(Thread.MAX_PRIORITY);  // ghanta kuch nhi ho rhaaa
//        prr.setPriority(Thread.MIN_PRIORITY); // ye jada os pe depend krti haii
////        System.out.println(pr.getName());
////        System.out.println(prr.getName());
////        System.out.println(po.getName());
//        pr.start();
//        prr.start();
//        p.start();
//        po.start();
//        pe.start();
//
//
//}
//}


//****************************************************************
//                                 THREAD METHOD

//class method extends Thread {
//    public void run(){
//        int i = 0;
//        while(i<30){
//            System.out.println("Hey my name is ruchi");
////            try {
////                Thread.sleep(5);   // kha 5 terms tak ruka kuch to hua nhii bss ek baar print ho rha uske baad to ruchika hi print ho rha hai  --> are bhuddhu iska mtlb ye hai ki millisec tak rukega bss
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
//            i++;
//        }
//    }
//}class method1 extends Thread {
//    public void run(){
//        int i = 0;
//        while(i<30){
//            System.out.println("Hey my name is ruchika Yadav");
//
//            i++;
//        }
//    }
//}
//
//
//public class CWH_14_Multithreading {
//    public static void main(String[] args) {
//        method me = new method();
//        method1 mee = new method1();
////        me.start();
////         ye join kaam krr rha hai
////        try{ // khosis kre uske baad exception ko catch kree
////            mee.join();  // ye hame exception de skta tha ishliye likha
////        }
////        catch(Exception e){
////            System.out.println(e);
////        }
////        try {
////                me.sleep(150);   // kha 150 milisecnd terms tak ruka kuch to hua nhii ab to mene class me bhi bana ke dekh liya bss ek baar print ho rha uske baad to ruchika hi print ho rha hai
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
////         // me yha ye join method ka use wha krunga jha mujhe me pura function khatam na ho jaye tab tak mee ne chalee mtln phele pura me chale uske baad mee chale
//        me.start();
//        mee.start();
//
//
//    }
//    }

//*********************************************
//        PRACTICE SET

//class pro extends Thread {
//    public void run() {
//        int i = 0;
//        while (i < 50) {
//            System.out.println("Good morning");
//            i++;
//        }
//    }
//
//}class pro1 extends Thread {
//    public void run() {
//        int i = 0;
//        while (i < 50) {
//            System.out.println("Welcome");
//            i++;
//        }
//    }
//}
//
//
//public class CWH_14_Multithreading {
//    public static void main(String[] args) {
//    pro pr = new pro();
//    pro1 prr = new pro1();
//    pr.start();
//    prr.start();
//
//    }
//}


//******************
//class pro extends Thread {
//    public void run() {
//        int i = 0;
//        while (i < 50) {
//            System.out.println("Good morning");
//            i++;
//        }
//    }
//
//}class pro1 extends Thread {
//    public void run() {
//        int i = 0;
//        while (i < 50) {
//            System.out.println("Welcome");
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            i++;
//        }
//    }
//}
//
//
//public class CWH_14_Multithreading {
//    public static void main(String[] args) {
//    pro pr = new pro();
//    pro1 prr = new pro1();
//    pr.start();
//    prr.start();
//
//    }
//}
//
//
////***********
//
class messi extends Thread{
    public messi(String name ){
        super(name);    // agr mene yha super(name) nhi likha to wo constructor wala name nhi show, hoga yha krna padega kyuki wo thread me constructor hai name naam ka to wo chalegaa
    }
    public void run(){
//        int i =0;
//        while(i<50){
//            System.out.println(this.getName());
//            i++;
//        }
    }
}

public class CWH_14_Multithreading {
    public static void main(String[] args) {
        messi mw = new messi("Ruchika");
        messi om = new messi("om");
        messi da = new messi("dadi");
        messi pa = new messi("papa");
        messi ma = new messi("mummi");
        //agr hamne koi bhi priority det nhu kri hai to wo equal priority dikhayega
        ma.setPriority(Thread.MAX_PRIORITY);  // ish proirity ki value hoti hai 10
        mw.setPriority(Thread.MIN_PRIORITY);       //iski 1
//        ma.setPriority(5);    dekho agr tum ya se set krr doge to ye hi wali priority dikhayeg woo*+
 pa.setPriority(7);
        mw.setPriority(8);
//        mw.start();
//        om.start();
//        da.start();
        System.out.println(ma.getPriority());
        System.out.println(ma.getName());
        System.out.println(mw.getPriority());
        System.out.println(pa.getId());
        System.out.println(mw.getId());
        System.out.println(pa.getState());  //yha phele hamne pa run nhi krwaya tha ishliye new aa rhi thi
        pa.start();
        System.out.println(pa.getState());   // lekin yha run krrwa diya ishliye runnable aa rhi hai
        System.out.println(Thread.currentThread().getState());    // yha ye bhi hame runnable hi dega
//        ma.start();

    }

}
