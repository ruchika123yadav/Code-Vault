
import java.util.Arrays;
//import java.util.*;
import java.util.Collections;
public class CWH_SORTING {

// BUBBLE SORT
    static void bubble(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
//                    swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void print1(int ar[]){
                    bubble(ar);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }

//    SELECTION SORT

    static void selection(int [] ar){

        int n= ar.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j = i+1;j<n;j++){
                if(ar[j]<ar[min]){
                    min=j;  //to store the minimum element
                }
            }
            int temp=ar[i];
            ar[i]=ar[min];
            ar[min]=temp;
        }
    }

    static void print2(int ar[]){
        selection(ar);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }

//    INSERTION SORT
    static void insertion(int []ar){
        for (int i=0;i<ar.length-1;i++) {
            if(ar[i+1]<ar[i]){
                for(int j=i+1;j>0;j--){
                    if(ar[j]<ar[j-1]){
                        int temp=ar[j];
                        ar[j]=ar[j-1];
                        ar[j-1]=temp;
                    }

                }
            }
        }
    }

    static void print3(int ar[]){
        insertion(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }

//COUNT SORT
    static void count(int []ar){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            largest=Math.max(ar[i],largest);
        }
        int countArray[]=new int[largest+1]; //yha larg. me +1 kyuki ham 0 ko bhi positive nu. mante hai to ushe bhi add krenge
        for(int i=0;i<ar.length;i++){
            countArray[ar[i]]++;  // yani jo value hai like 4 to 4 index pe jaoyo or uski value 1 krr do wha
        }

//        sorting
        int j=0;
        for(int i=0;i< countArray.length;i++){
            while(countArray[i]>0){ // jab tak ek particular block ki value 0 na ho jaye
               ar[j]= i; // i to wo hai na jha particular element ki value 1 hai to hame to wo element hi chahiye to ishliye i ke qequal kiya
                j++;
                countArray[i]--;
            }
        }
    }

    static void print4(int ar[]){
        count(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }

//    MERGE SORT
    static void Merge(int []arr,int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //iteratot for left part
        int j=mid+1; // iterator for right part
        int k=0;   //iterator for temp arr

        while(j<=mid && mid<+ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }
            else {
                temp[k]=arr[j];
                i++;k++;
            }
        }

    }


    public static void main(String[] args) {
        int e[]={2,3,7,4,1,8,9,1,5};
        int arr[]={4,5,1,3,2};
//        bubble(ar);
//        print1(ar);
//        System.out.println("######");

////        SELECTION
        print2(arr);
        System.out.println("######");
//        INSERTION
//        print3(a);

//        COUNT SORT
        print4(e);

//        SORTING BY USING LIBRARIES
//        Arrays.sort(ar,0,4);// ishme ye last wla index ko include nhi krr rha haiii means sort from 0 to 3
//        printt(ar);

//        IN DECENDING ORDER
//        Arrays.sort(ar, Collections.reverseOrder());  //and it does't take int so we use INTEGER
//           printt(ar);

//        MERGESORT
        int ary[]={6,7,3,4,9,5,7};
        Merge(ary,0, ary.length/2, ary.length);
    }
}
