
import java.util.Scanner;
public class CWH_4_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter the age");
//        int age= sc.nextInt();
//        if(age>18){
//            System.out.println("you can drive");
//        }
//        else{
//            System.out.println( "Sorry you cannot drive");
//        }

        // 0r
        //int age=18;
      /*  boolean cod = (age== 18);
        if(cod){
            System.out.println("you can drive");
        }
        else{
            System.out.println( "Sorry you cannot drive");
        }*/
//        ***************************************************************
//            LOGICAL OPERATORS
//          boolean a= true;
//          boolean b=false;
//          if (a&&b){       //agr ishme me T and T bhi kru tabhi wo y dikhyega wrna n blki f and f me bhi nhi
//              System.out.println("y");
//          }
//           else {
//              System.out.println("n");
//          }
////****
//       if (a||b){
//        System.out.println("y");//     ishme jab tak f and f nhi dikhayega tab tak n nhi hoga
//          }
//           else {
//              System.out.println("n");
//          }
////********
//        System.out.println("not(a)");
//        System.out.println(!a);
//        System.out.println("not(b)");
//        System.out.println(!b);

//**********************************************************
//        ELSE IF
        // ek baat dhyan rakna ki if jese a= b nhi hoga == ye lagana paega

//         if else if ladder*************
            System.out.println("enter your age");
            int age = sc.nextInt();
//        System.out.printf("your age is %d\n", age);
//
//        if(age>56){
//            System.out.println("you are experienced");
//        }
//        else if(age>45){
//            System.out.println("tou are semi experienced");
//        }
//        else if(age>20){
//            System.out.println("you are semi semi experience");
//        }
//        else System.out.println("you are not experinced");

//        switch*************
            //ehnace switch
            //            we can also enhace switch use the enhance switch
            //            we can use char and string datatype also
            if (age == 18) {
                System.out.println("you are going to become addult");
            } else if (age == 40) {
                System.out.println("you are not fully mature");
            } else if (age == 60) {
                System.out.println("you are now complete you all of the task in your life");
            } else if (age == 80) {
                System.out.println("you only injoy your life ");
            } else {
                System.out.println("yup!! doing nice");
            }
        }

    }
