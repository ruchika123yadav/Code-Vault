//  packaegs me age hamne do file same naam ki banayi hai to wo chalengi to hai nhi to ham un same naam ki classes ko alg alg package me dalke execute krr skte hai

// import java.util.Scanner;  // yha hamne java.util package ko use kiya or hamne ushme se scanner class ko use kiya
// import java.util.*; // mene ishme java.utilme she s
 // java.util bhi ek package hi haiii

//                            *******GO IN THE VS CODE********

//public class CWH_13_Packages {
//    public static void main(String[] args) {
//       java.util.Scanner sc = new java.util.Scanner(System.in);    // another way
//        System.out.println("The world");
//        int a = sc.nextInt();  // agr tum yha sc. ki jagah sa krr do na koi fark nhi hai ye bhi to ek class hi hi hai or nextint iske in built methods
//    }
//}


//**********************************************
//           ACCESS MODIFIER

class  c1 {
    public int x = 5;
    protected int y = 45;
    int z = 4;
    private int a = 34;

    public void detail() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);   // class me hi method banake private ki value ko access krr skte hai
    }
}

    public class CWH_13_Packages {
        public static void main(String[] args) {
            c1 c = new c1();
            c.x = 34;  // mtlb age me ishe yha chnage krr du to w upr wali nhi ye hi value print hogi
            System.out.println(c.x);
            c.detail();
//             c.a = 2;  //ham ishe same package ke andr access nhi krr skte dusri class hai na ishliye access nhi krr ksye
//            System.out.println(c.a);
//            c.z();
//            c.y();
        }
    }

//     dekho mene yha class c1 ko ye pure program me le liya tha uske baad mene c.a ki value fix ki value to fix ho gyi thi koi error nhi aya lein
//   galti ye hai ki compliler main class konsi dekhega uske liye hame fir class ke } ko uski jagah hi lagan padega
