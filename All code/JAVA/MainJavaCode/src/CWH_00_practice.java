//
//
//class ye{
//    int age;
//    String name;
//    public int salary;
//    private int password=7575445;
//    int pass(int pas){
//        this.password=pas;
//        return password;
//    }
//    float rupee(float a,float b){
//        return a+b;
//    }
//
//
//    void setagge(int setage){
//        this.age=setage;
//    }
//    void setname(String setname){
//        this.name=setname;
//    }
//
//}


public class CWH_00_practice {



    static int sortt(int ar[],int i,int n){
        if(i==-1){
            return 0;
        }
        if(ar[i]==n){
            return i;
        }

        return sortt(ar,i-1,n);
    }
//    ***********************************************
    static int power(int n,int i){
        if(i==1){
            return n;
        }
        return n*power(n,i-1);
    }

    public static void main(String[] args) {

//        System.out.println(print(5));
//        System.out.println(fab(8 ));
        int ar[]={1,2,9,4,5,2,7,6,5,3,2};
        int i=ar.length-1;

//        power
        System.out.println(power(2,5));


        System.out.println(sortt(ar,i,2));
//         int ans=sort(ar);
//         if(ans==1){
//             System.out.println("Array is sorted");
//         }
//         else{
//             System.out.println("Array is not sorted");
//         }


//        ye y= new ye();
//        ye yy= new ye();
//        y.setagge(20);
//        y.setname("Ruchika Yadav");
//        System.out.println(y.age);
//        System.out.println(y.name);
//        yy.setagge(22);
//        yy.setname("JGjbfjeb Yadav");
//        System.out.println(yy.age);
//        System.out.println(yy.name);
//        y.salary=342435;
//        y.pass(43524);
//        System.out.println(y.pass(67546));
//
//        y.rupee((float) 3.4,(float) 4.6);

//
    }}


//public class CWH_00_practice {
//
//     public static int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2);
//         }
//     }
//
//    public static void main(String[] args) {
//        int n = 10; // Change 'n' to the number of terms you want to print
//
//        System.out.println("Fibonacci Series (First " + n + " terms):");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//
//}
//
