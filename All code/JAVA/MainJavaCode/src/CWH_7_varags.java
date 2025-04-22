import java.util.Scanner;
public class CWH_7_varags {
    // varags is like ham ek function ko ek se jada arguments de skte hai
    static int sum(int a, int b) {
        return a + b;
    }

    //    static int sum(int a, int b, int c){
//        return a+b+c;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  int a,b;
//  a=34;
//          b=34;
//        System.out.println(sum(4,5) );//ham values aishe bhi daal skte hai function ke andr
//            System.out.println(sum(4,5,10) );
//////////////////////////////////////////////////////////////////

//    static int sum(int ...arr){          // triple dot ye kah rha hai mujhe jitne bhi arguments mile unhe ek array me dalke de do
//    //available as int [] arr
////        static int sum(int x,int ...arr){      //agr hame apne sam me ek integer dalwana hi dalwana ho to ham method me aishe ek arguments de skte hai
//        int result=0;
//        for(int a: arr){
//            result += a;
//        }
//        return result;
//
//
//        }
//    public static void main (String[] args){
//        System.out.println(sum());  // agr ham seedhe aishe likhenge to ishme arr me to kuch store hhoga nhi to wo 0 return krr dega
//        System.out.println(sum(1));
//        System.out.println(sum(1,2));
//        System.out.println(sum(1,2,3));
//        System.out.println(sum(1,2,3,4));

//*******************************************************************
//                     RECURSSION

//        static int fact ( int a){
//            if (a == 0 || a == 1) {
//                return 1;
//            } else {
//                return a * fact(a - 1);
//            }
//        }
//    static int fact_iterative(int a) {
//        int fac = 1;
//        for (int i = 1; i <= a; i++) {
//
//            fac *= i;
//
//
//        }
//        return fac;
//    }
//
//  public static void main(String[] args){
//      System.out.println("enter the value which you want to find the factorial");
////      int x = sc.nextInt() ;
//int x =0;
//      System.out.println(fact(x));
//      System.out.println(fact_iterative(x));

/////////////////////////
//              FABONACCI SERIES

//        static int fab ( int n){
//            if (n == 1 || n == 2) {
//                return 1;
//            } else {
//                return fab(n - 1) + fab(n - 2);
//            }
//        }
//        public static void main (String[]args){
////        int n = 6;
//            System.out.println(fab(21));


    }
}
