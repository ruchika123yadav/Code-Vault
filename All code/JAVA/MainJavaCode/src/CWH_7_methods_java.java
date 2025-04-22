public class CWH_7_methods_java {
//     static int logic(int x, int y){   // agr static nhi hai to error show  krega kyuki ham static se static function ko hi call krr skte hai
//        int z;
//        if(x>y){              //arguments are actual or parameters are copied
//            z = x+y;
//        }
//        else {
//            z = (x+y) +5;
//        }
//
//        return z;
//    }
//    public static void main(String[] args) {
//        int a=4;
//        int b =5;
//        int c;
////         method invocation using object creation
        CWH_7_methods_java obj = new   CWH_7_methods_java();    //ye ham tab use krenge jab static nhi lagyenge kyuk tab hame kudka ek object banana padega na like fridge
//       int c =  obj.logic(a,b);
//        c = logic(a,b);
//        System.out.println(a+ " " +b);
//        int a1=14;
//        int b1 =15;
//        int c1;
////        c1 = obj.logic(a1,b1);
//        c1= logic(a1,b1);
//        System.out.println(c);
//        System.out.println(c1);
//}
//}


//        //////////////////////////
//        METHODS OVER LOADING
//        static void Telljoke(){    //ye jo method hai wo share kiya jayega ish class ke sare object kr dwara like ek class wala ex ki bacche
//System.out.println("I am a joke");

//        }************
//   static void change (int a){
//       a = 34;
//  }
//    static void change1( int [] arr){
//        arr[0]=34;
//    }
    static void foo(){          //return type change krke over loding nhi krr skte uske liye uska andr ke parrameters ko change krna hoga
        System.out.println("Good morning bro!!");
    }
//    static void foo( int a){
//
//        System.out.println( "Good moring bro"+ a + "times");
//
//    }


public static void main(String[] args){
//        Telljoke();
//    Telljoke();

//
//      int x=45;
//    change(x);
//    System.out.println(x);

//    int [] marks={89,87,90,87,67,90};   // arr me value change ho jati ahi kuiki arr address store krta hai ishliye
//     marks[0] = 45;
//     change1( marks);
//    System.out.println(marks[0]);
     foo();
     foo( );   // arguments are actual



    }





   }


