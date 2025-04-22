import java.util.Scanner;


public class CWH_6_array_prac {

    static int search(int ar[][],int key){
        int n=ar.length;
        int m=ar[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 if(ar[i][j]==key){
                     System.out.println("Element present at"+ar[i][j]+"at"+i+" "+j);
                     return 1;
                 }
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//          ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//                        2D ARRAY

//        int arr[][]= new int[3][3];
//        int n=arr.length;
//        int m=arr[0].length;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("");
//        }
     int ar[][]={{1,2,3},{5,6,7}};

        search(ar,6);




//        ||||||||||||||||       HARRY                |||||||||||||||||||||||||

//        float [] sum;
//        sum = new float[5];
//        float [] marks = {.1f,23.1f,43.3f,65.4f,76.4f};
//        float summ =0;
//        for(int i =0;i<marks.length;i++){
//            summ = summ + marks[i];
//        }
//        for(float element:marks){   //element ko bhi ham arr length ki tarah lete hai
//            summ +=  element;
//        }
//        System.out.println(summ);

//        *******************************************
//        float [] marks = {.1f,23.1f,43.3f,65.4f,76.4f};
//        float num =23.1f;
//        boolean isIntArray= false;
//        for(int i =0;i<5;i++){
//            if(num==marks[i]){
//    isIntArray = true;
//    break;
//            }
//        }
////        marks[i]= marks;
//        if(isIntArray) {
//            System.out.println("the value is present in the array" + marks[i]);
//        }
//            else {
//                System.out.println("the value is not present in the array");
//            }
//********************************************************************************8
        int[][] at1 = { {1,2,3},
                        {4,5,6}
                            };
        int[][] at2 = { {3,2,3},
                        {4,7,6}
        };
        int[][] result = { {0,0,0},
                {0,0,0}
        };
            for(int i=0;i<at1.length;i++) {   //row no. of times
                for (int j = 0; j < at1[i].length; j++) {  // coloumn no. of times
//                    System.out.printf("setting value for i = %d and j=%d\n",i,j);
                    result[i][j]= at1[i][j] +at2[i][j];
                    System.out.print(result[i][j] + " ");
//                    result[i][j]= at1[i][j] +at2[i][j];

                }
                System.out.println(""); //next line ke liye
            }

//        **************************************************************************
//            jo reverse wwala question hai wo khud se krityo apna dimaag lagake

//*************************************************************************************

//            int [] arr = {23,43,65,45,67,86,};
//            int max =0;     //=integer.MinValue bhi likh skta hu jisse me arr me negative value bhi daal skta huu
//        for(int e:arr){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.print("the maximum value in this array is:");
//        System.out.println(max);

//        *****************************************************************
//        boolean isSorted = true;          phele wha par sirf ek condition hi dekni thi ishliye false liya lekin yha sab ko ek dusre se compare krna hai
//        int [] arr = {23,43,65,66,67,86,};
//        for(int i=0;i<arr.length -1;i++) {  // - ishliye lagaya kyuki  hame compare to last se ek phele element tak hi krna hia nanjese ishme 67 tak
//            if (arr[i] > arr[i + 1]) {
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted) {
//            System.out.println("the array is sorted");
//        }
//        else {
//            System.out.println("The Array is not sorted");
//        }

//
}
    }