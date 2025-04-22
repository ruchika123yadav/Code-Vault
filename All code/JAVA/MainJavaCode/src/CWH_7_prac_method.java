public class CWH_7_prac_method {
//    static void mult(int n){
//        int a=10;
//     for(int i=1;i<=a;i++) {
//         System.out.println(n+"x"+i +"="+ n*i);
//
//    }
//
//    }
//    public static void main(String[] args){
//
//    int n=4;
//    pattern(n);
//    }
//   03 ////////////////////////////////////////////////

//    static int nat(int n){
//        if( n==1){
//            return 1 ;
//        }
//        else {
//            return n +nat(n-1);
//        }
//    }
//    public static void main(String[] args){
//        int n=4;
//        System.out.println(nat(n)); nat(n);
//    }

//  05  /////////////////////////////////////

//    static int avg(int ...arr){
//        int result=0;
//        for(int a: arr) {
//
//            result += a;
//        }
//     return result;
//    }
//
//public static void main (String[] args){
//    System.out.println(avg(2,3,4,5));
//}

//  08   ////////////////////////////////////////////

//   static void pat( int n){
//       if (n>0){
//           pat(n-1);
//           for(int i=0;i<n;i++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }
//   }
//public static void main (String[] args){
//       int n =5;
//       pat(n);
//}
//pat(3)
//    pat(2); //+3 times star and new line
//    pat(1) + 2 times star and new line + 3 times star and new line
//     pat(0) + 1 times star and new line + 2 times star and new line + 3 times star and new lineCWH


//    *********************
//    FABBONACI SIRIES
    static int fab(int n) {
        if (n == 0) {
            return 0;
        }
        if (n==1){
            return 1;
        }
        else {
            return fab(n - 1) + fab(n - 2);
        }
    }

        public static void main(String[] args){
        int n=3;
            System.out.println(fab(n));
         }
}
