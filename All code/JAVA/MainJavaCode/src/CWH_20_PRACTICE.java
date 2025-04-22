//import java.util.Scanner;
//
//class Rectangle{
//    private int len,brd;
//    public void getdata(){
//        Scanner sc;
//                sc = new Scanner(System.in);
//        System.out.println("Enter the length and breadth");
//        len = sc.nextInt();
//        brd = sc.nextInt();
//    }
//    public void setdata(int l, int b){
//        this.len = l;
//        this.brd = b;
//    }
//    public void displayData(){
//        System.out.println("length ="+len);
//        System.out.println("Breadth="+brd);
//    }
//    public void areaperi(){
//        int a,p;
//        a = len*brd;
//        p = 2*(len+brd);
//        System.out.println("Area = "+a);
//        System.out.println("Perimeter = "+p);
//    }
//}
//
//public class CWH_20_PRACTICE {
//    public static void main(String[] args) {
//        Rectangle r1,r2,r3;
//        r1 = new Rectangle();
//        r2 = new Rectangle();
//        r3 = new Rectangle();
//        r1.setdata(2,3);
//        r1.displayData();
//        r1.areaperi();
//
//        r2.setdata(3,3);
//        r2.displayData();
//        r2.areaperi();
//
//        r3.setdata(2,4);
//        r3.displayData();
//        r3.areaperi();
//    }
//}

//****************************************************
//                  FINALIZE(The Finalize method is used to perform cleanup operations on unmanage resources held by the current object before the
//                  object is destroyed. The method is protected and therefore is accessible only through this class or through a derived class.)
class example{
    private int data;
    public example(){
        System.out.println("Inside the constructor");
    }
    protected void finalize() throws Throwable{   // ISHE  ham public bhi declare nhi krr skte
        super.finalize();
    }
}

public class CWH_20_PRACTICE {
    public static void main(String[] args) {
        example e = new example();
    }
}