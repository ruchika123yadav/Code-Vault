import java.util.ArrayList;
import java.util.List;

public class CWH_z_BACKTRAKING {
    //    FIND ALL POSSIBLE SOULTIONS AND USE THE ONE YOU WANT
//    ye jada trr recurrsion me use hota hai or ishme thoda tree ka bhi concept hai jha ham ushi tree me back track krrte hai
    public static void permt(String str, int idx, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permt(newstr, idx + 1, perm + curr);
        }

    }

//    CHANGE ARRAY
    static  void changeArr(int []arr,int i,int val){ //where i is the starting index and val is the value to put at the end index of th array
//        base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;  //bactracking step
//        backtraking hamesha funciton call ke baad hi  hogi


    }

//    for printing the array
    static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");

    }
    }

    public static void main(String[] args) {
        String str = "abc";
        permt(str, 0, "");
        int arr[]= new int[4];
            changeArr(arr,0,1);
            printArr(arr);

    }
}
//