import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CWH_6_array {
//    *****array me value call by refernce se pass hoti hai to agr ham apne array ko function me pass krr rhe hai to
//    uski value hamre main function me bhi change hogi

//    ********LINEAR SEARCH
    static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }


//  *****BINARY SEARCH
    static int binary(int  arr[],int key){
        int max,low;
        low=0;max=arr.length-1;

        while ((low<=max)){
           int mid=(max+low)/2;
//           comparisions
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                low=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        return -1;

    }

//    *********REVERSE AN ARRAY
    static void reverse(int arr[]){
        int swap;
        int low=0;int max=arr.length-1;
        while(low<max){
            swap=arr[low];
            arr[low]=arr[max];
            arr[max]=swap;
            low++;
            max--;
        }

    }

//    Pairs in an array
static void pairs(int a[]){
        int tp=0;  // total pairs
        for(int i=0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                System.out.print( "("+a[i]+","+a[j]+") ");
                tp++;
            }
            System.out.println("pairs"+tp);
        }
}

//**********PRINT SUBARRAY
    static void subarray(int numm[]){
        int ts=0;
        for(int i =0;i<numm.length;i++){
            for(int j=i;j<numm.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numm[k]+" ");

                }  ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }


//    SEARCHIHG AN ELEMENT IN 2D ARRAY
    static boolean matrixSearch(int ar[][],int key){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(ar[i][j]==key){
                    System.out.println("Element found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element is not present in the array");
        return false;
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        int num[]={2,3,4,5,6};
        int key =3;
        int res=linearSearch(num,key);
        if(res==-1){
            System.out.println(" Notfound");
        }
        else{
            System.out.println(" found");
        }

//        binary search
        int arr[]={3,4,59,0,45,2,3};
        int keyy=4;
        System.out.println(binary(arr,keyy));


//        reverse
        int ar[]={4,5,6,8,3,9,};
        reverse(ar);
       for(int i=0;i<ar.length;i++){
           System.out.println(ar[i]);
       }
//          *****pairs
        int a[]= {2,3,4,5,6};
        pairs(a);


//       SUBARRAY

        int numm[]={2,3,4,5,5};
        subarray(numm);






//       \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

//         int [] marks = new int[5];
//         marks[0]=34;
//        marks[1]=12;      //arguments are actual and parameters are copied
//        marks[2]=67;
//        marks[3]=12;
//        marks[4]=76;
//        int [] marks = {1,2,3,4,5};
        // int [] marks;
//        marks = new int [5];
//        System.out.println(marks[4]);



//        **************************************************

//        int [] marks = {1,2,3,4,5,6,7,8};
//        float [] marks = {.1f,23.1f,43.3f,65.4f,76.4f};
//        System.out.println(marks.length);   //ye hame array ki length batata hai ki kitne length ka array banaya hai
//        System.out.println(marks[3]);
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//
//        }
//        FOR EACH LOOP
//        for(int element: marks){
//            System.out.println(element);      // print all elements
//        }

//        *********************************************************
//                      2 DIMENTIONAL ARRAY
//        int [] [] flats;
//        flats = new int [2][3];
//        flats[0][0]= 34;
//        flats[0][1]= 34;
//        flats[0][2]= 34;
//        flats[0][3]= 34;
//        flats[1][0]= 34;
//        flats[1][1]= 34;
//        flats[1][2]= 34;
//        flats[1][3]= 34;
//        System.out.println(flats[1][0]);
//        System.out.println(flats.length);
//
//        for(int i=0;i<flats.length;i++){
//            for(int j=0;j<flats[i].length;j++){   //flats[i] ki upr arry i tak gya hai wha tak jaye
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("\n");
//        }

//        int matrix[][]= new int[3][3];
//        int n= matrix.length;
//        int m = matrix[0].length;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                matrix[i][j]= sc.nextInt();
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }
//          matrixSearch(matrix,6);




              }
              }