import java.util.Scanner;

public class CWH_1_literal {
    public static void main(String[] args) {
        byte age =34;  //jo yr right hand side wali value hai bss ye jo jesse 23,a,3.4,3.44 ye sab lteral hai
        char po ='A';
        float f =3.4f;  //yha float me baad me f likne padega
        double d = 3.44d;  // ishme d baad me likho ya mtt likho koi jada fark nhi padega kyuki wo default hi hai
        System.out.println(f);
        System.out.println(age);
        System.out.println(d);
        System.out.println(po);
        boolean a = true;
        long no = 374387893843l;  // yha long me mujhe l likhna padega kyuki int itni badi value store nhi krr skta ishliye l likhenge
        String str = "Ruchika";  // string me s capital hoga
        System.out.println(str);
        System.out.println(a);

        Scanner sc = new Scanner(System. in);
//        System.out.println("enter the first the number");
        //int a = sc.nextInt();
        //   System.out.println("enter the second number");
        // int b = sc.nextInt();
        //System.out.println("enter the third number");
        //  int c = sc.nextInt();
        //int sum = a + b + c;
        //  System.out.println(sum);


// second question
        //float subject1 = 90;
        //  float subject2 = 93;
        //    float subject3 = 95;
        // float per = (subject3 + subject2 + subject1)*100/300; // yha har ek me float ishliye lagaya hai kyuki integer ka interger se divide integer hi deta  hai ishliye sab ko// hi float bana diya
//        float cgpa = per/10;
        // float fcgpa = cgpa*10;
        // System.out.println(cgpa);

        //
        // question 3
        //System.out.println("enter your name");
        //String name = sc.nextLine();
        //System.out.println("Hello " + name + " have a good day" );


        // question 5
        System.out.println("enter the number");

        boolean number = sc.hasNextInt();
        System.out.println( number );
    }
}
