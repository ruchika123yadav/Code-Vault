import java.util.Scanner;

public class practice {
    //    static int avg(int ...ar){
//        for(int e:ar){
//            int sum+=e;
//        }
//    }
    static int doub(int[] ar){
        int n= ar.length;

        int leftmax[]= new int[n];
        int max=ar[0];
        for(int i=0;i<ar.length;i++){
            max=Math.max(ar[i],max);
            leftmax[i]=max;

        }

        int rightmax[]= new int[n];
        int maxx=ar[n-1];
        for(int i=n-1;i>=0;i--){
            maxx=Math.max(ar[i],maxx);
            rightmax[i]=maxx;
        }
        int waterCollected=0;
        for(int i=0;i<ar.length;i++){
            int min=Math.min(leftmax[i],rightmax[i]);
            waterCollected +=min-ar[i];
        }
return waterCollected;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value in numbers");
//        int x = sc.nextInt();
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
            System.out.println(doub(arr));


            }
        }





