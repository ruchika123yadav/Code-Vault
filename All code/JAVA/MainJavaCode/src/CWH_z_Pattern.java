
//                               PATTERN RPOBLEMS
import java . util. Scanner;
public class CWH_z_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //     SOLID RECTANGLE
//        System.out.println("Enter the value of N which you want ot print the pattern");
//        int n = sc.nextInt();
//        for (int i = 0; i < (n-1); i++) {
//            for (int j = 0; j <n; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

//     02   ********************************
//               HOLLOW RECTANGL
//  ******
//  *    *
//  *    *
//  ******
//        System.out.println("enter the value of total rows");
//           int totRow=sc.nextInt();
//           System.out.println("enter the value of total coloumns");
//        int tolCol=sc.nextInt();
//        for(int i=1;i<=totRow;i++) {
////            inner column
//            for (int j = 1; j <= tolCol; j++) {
////                cell i,j
//                if (i == 1 || j == 1 || i == totRow || j == tolCol) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//    05   *********************************
//            INVERTED HALF PYRAMID
//   *
//  **
// ***
//****
        System.out.println("Enter the value of n");
           int n = sc.nextInt();
           for(int i =1;i<=n;i++){
               for(int j =1;j<=n;j++){
                   if((n-i)>=j){
                       System.out.print(" ");
                   }
                   else{
                       System.out.print("*");
                   }
               }
               System.out.println();
           }

//    06    *********************************************
//                   HALF PYRAMID WITH NUMBERS
//        int n = 6;
//        for (int i = 1; i <= (n-1); i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j);
//
//            }
//            System.out.println();
//        }

//    07    ********************************************
//             INVERTED  HALF PYRAMID WITH NUMBERS
//        ham questions me j ki condition ko i ot +1 ya +-1 add krr skte hai
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j<=(n-i +1); j++) {
//                System.out.print(j);
//
//            }
//            System.out.println();
//        }

//    08    ****************************************
//                 FLOYD'S' TRIANGLLE(MTLB INC. NUM WALA TRIANGLE)
//        int n = 5;
//        int num=1;
//        for (int i = 1; i<=n  ; i++) {
//            for (int j = 1; j<=i ; j++) {
//                System.out.print(num);
//                num++;
//
//            }
//            System.out.println();
//        }

//        09  ****************************************
//                        01 TRIANGLE

//        int n = 5;
////                   ese type ke quetions ko matrix se bhi solve krr skte hai
//        for (int i = 1; i<=n  ; i++) {
//            for (int j = 1; j<=i ; j++) {
//                 if ((i+j)%2==0 ){
//                     System.out.print(1);
//                 }
//                 else{
//                     System.out.print(0);
//                 }
//
//
//            }
//            System.out.println();
//        }

//                     ADVANCED PROBLEM      //***************************************
//        BUTTERFLY RPROBLEM
////        first half
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            int spaces = 2*(n-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//      second half      next for loop chal rha hai to wo dusra line se start hoga jha se phela loop khatam hua hai
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            int spaces =2*(n-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        *******************************************
//        SOLID RHOMBUS

//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//
//            int spaces = (n-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        **************************************
//                PYRAMID SHAPE NUMBERS
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//
//            int spaces = (n-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

//        *********************************
//        PALINDROMIC PATTERN

//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//
//            int spaces = (n-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
////                System.out.print(" ");
//            }
//
//            for(int j =2;j<=i;j++){
//                System.out.print(j);
//
//            }
//            System.out.println();
//        }

//        *****************************
//        DIAMOND PATTERN

//        int n = 4;
////        FIRST HALF
//        for (int i = 1; i <= n; i++) {
//
//            int spaces = (n-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for(int j =2;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
////  SECOND HALF
//        for (int i = n; i >=1; i--) {
//
//            int spaces = (n-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for(int j =2;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("Enter the value" );
//                  int n = sc.nextInt();
//                          char ch='A';
//
//                  for(int i=0;i<n;i++){
//                      for(int j=0;j<i;j++){
//                          System.out.print(ch);
//                          ch++;
//                      }
//                      System.out.println("\n");
//                  }

    }
}