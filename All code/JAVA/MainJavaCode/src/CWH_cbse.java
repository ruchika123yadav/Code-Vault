import java.util.Scanner;
public class CWH_cbse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of subject 1");
        int s1= sc.nextInt();
        System.out.println("enter the marks of subject 2");
        int s2= sc.nextInt();
        System.out.println("enter the marks of subject 3");
        int s3= sc.nextInt();
        System.out.println("enter the marks of subject 4");
        int s4= sc.nextInt();
        System.out.println("enter the marks of subject 5");
        int s5= sc.nextInt();
        System.out.println("enter the total marks");
        float tm= sc.nextFloat();
        float mo= s1+ s2 + s3 + s4 + s5;
        float percentage= (mo*100)/tm;
        // float per = (mo/500.0f)*100  isse int se float divide krega to float hi ayega
        System.out.println(percentage+"%");
    }
}
