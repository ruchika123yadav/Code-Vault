import java.util.Scanner;
//public class CWH_15_Errors {
//    public static void main(String[] args) {
//        //  SYNTAX ERROR
//        int a = 0     no semicolon
//                b=8;   b is not decalred

        // LOGICAL ERROR
//        System.out.println(2);
////        for(int i = 1;i<5;i++){
////            System.out.println(2*i+1);  // 9 IA  not a prime no. so it is a logical error
////        }
//        //INDONO ME TO PROGRAMMER KI GALTI HAI LEKIN RUNTIME ME USER KI GALTI HOTI HAI

//        System.out.println(1000/k); // if you given 0 as a input

//          RUNTIME ERROR
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        ****************+
//        int a = 8;
//        int b = 0;          // airtmethic exceptions
////        int c = a/b;
////        System.out.println(c);
//        try{ // tum try ke andr kuch bhi dalte to ho to ushe run krne ki kosihish ki jayegi
//            int c  = a/b;
//            System.out.println("the result is"+ c);
//        }
////        yha jo exception hai wo ek object hai or e ek class hai
//        catch(Exception e){ //agr exception ayi to directly dalke ye code execute ho jaeyga or nich eka code execute krega kuch bhi exception ayi to
//            System.out.println("we failed to divide.Reason");
//            System.out.println(e);
//        }
//        System.out.println("End of the code");  //agr me wihtout try ke kaam kru to end of the program muhe likke nhi milega
//}}

//        **************

//        int[] arr = new int[3];
//        arr[0] = 34;
//        arr[1] = 20;
//        arr[2] = 30;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array index");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the value you want to divide the value with");
//        int n = sc.nextInt();
//
//        try {
//            System.out.println("the value of array index entered is" + arr[a]);
//            System.out.println("The divide value is" + arr[a] / n);
//
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic exception occur");
//            System.out.println(e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("array out of bound exception occur");
//            System.out.println(e);
//            // agr ishme koi aur bhi exception aa jatio hai to ham catch ke code ke andr likh denge
//        } catch (Exception e) {
//            System.out.println("some other exception occur");
//            System.out.println(e);
//        }
//    }}
//        *****************
//              NESTED TRY CATCH(try ke andr try yani ham ek exception ko handle krke dusri exception ko continue krna chate hoo)

//           QUICK QUIZ
//        int[] ary = new int[3];
//        ary[0] = 34;
//        ary[1] = 20;
//        ary[2] = 30;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of index");
//        int ind = sc.nextInt();
//        boolean flag = true;
//        while (flag) {  //(bss ish code me ye dikkat hai ki agr mene array index shi duay to wo to try me chala jayega or niche false hoke while se bhr aa jayega
//          //   lekin agr arry index ke bhr value di to wo catch me jayega or catch me to false kiya hi nhi to wo infinite loop tak chalte hi rhega)
//            try {  // yha ham try me wo code likhte hai jo ham print krwana chate hai or catch  me wo likte hai jisse eception show ho jaye
//
//                System.out.println("welcome to ruchi world");
//                try {
//                    System.out.println(ary[ind]);
//                    flag = false;
//
//                } catch (ArrayIndexOutOfBoundsException e) {  // ye hai dusre wale ka try ka catch
//                    System.out.println("Hey i am  exception ");
//                    System.out.println("I am the exception of level 2");  // agr ye wala catch chal jayega to fir niche wala cathc nhi chalega
//                    flag= false;
//                }
//            } catch (Exception e) {  // ye hai phele wale ka try ka catch
//                System.out.println("I am the exception of level two");   // phele trym me to kabhi error ayega hi nhi to ye kabhi print hi nhi hoga
//            }
//        }
//        System.out.println("thank you for using this program");
//
//    }
//}
/*
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i=0; i < 4; i++) {
            System.out.println("enter the value of " +arr[i]);
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<4;i++){
            System.out.println(arr[i]);
        }
    }
}
*/

//}
//        *************************
//

//******************************
//    area of the square(ish program me hamne result try me nhi prin tkraya kyuki jo negatice result ayeg a wo hame pata hai ki side egative nhi hoo skti lekin cp ko to nhi pata ishliye alg se krne pada
//mtlb ishme apne aap program error catch nhi krr payega to try or catch dono hi chala dega

//class negativeside extends Exception{ // if else se bhi banaya mene ishee
//    public String toString(){
//        return "Side can't ne negative!!";
//    }
//}
//public class CWH_15_Errors {
//    static int rec(int a , int b) throws negativeside{
//        if(a<0 || b<0){
//            throw new negativeside();
//        }
//        int result = a*b;
//        return result;
//    }
//    public static void main(String[] args) {
////        int a, b;
////        Scanner sc = new Scanner(System.in);
////        a = sc.nextInt();
////        b = sc.nextInt();
//////        System.out.println("Area of the recatangle is"+ a*b);
////
////        if (a < 0 || b < 0) {
////            try {  //ye hamne try catch me ishliye dala ki ek error thow kiya jaa rha hai or ham nhi chate ki program me koi error aye
////                throw new ArithmeticException("You cannot enter the negative value of a square side");  // ye jo hai wo sare code ko run krne ke baad ayega
////            } catch (Exception e) {
////                System.out.println("this is an exception");
////                System.out.println(e);
////            }
////
////        } else {
////            System.out.println("Area of the recatangle is" + a * b);
////        }
////        *****
//        try {
//            System.out.println("Area of the rectangle is"+rec(-4, 5));
//        }
//        catch(Exception e){
//            System.out.println("this is an exception");
//            System.out.println(e);
//        }
//    }
//}

//*************************
//            THROWS
//class negativearea extends Exception{  // to yha ham custom exception banayenge
//    public String toString(){
//        return "Radius can not be negative!!";
//    }
//}
//
//public class CWH_15_Errors {
//    static double area(int r) throws negativearea{  // ye ishliye use hota hai ki hamra code whi ki whi terminate ho jaye
//        if(r<0){
//            throw new negativearea();
//        }
//       double result = Math.PI*r*r;
//       return result;
//    }
//    static float divide(int a, int b) throws ArithmeticException {  // yha ham throws keyword lagake bata skte hai ki ye ek exception throw krta hai
//        float result = a / b;
//        return result;
//    }
//// throws ka mtlb hota hai ek sankeet jo ki dusure programmer ko pata chlata agr wo apka prgram ishtmaal krr rha hai ki bhai ruke ishme exception aa skta hai jara shabhal ke
//    public static void main(String[] args) {
//        try {
//            System.out.println(area(-4));
////            System.out.println(divide(8, 0));
////        System.out.println(divide(2,4));      // ye yha pe 0.5 nhi de rhaa
//        }
//        catch(Exception e){
//            System.out.println("This is an exception");
//            System.out.println(e);
//        }
////        System.out.println(area(4));  // to yha pe apko ek warning mill rhi hai ki ye exception throw krta hai  yani ki ishe hame try catch me dalna hogaa
//    }
//}


//****************************
//              FINALLY BLOCK(aisha code jisko execute hona jaruri hi haii chae exception aye ya naa aye)


//public class CWH_15_Errors {
//    public static int finallyy() throws Exception{
//        try{
//            int a =4  ;
//             int b= 0;
//            int c = a/b;
//            return c;
//        }
//
//        catch(Exception e){
//            System.out.println(e);
//        }
//        finally{  // yha kya hoga ki try block shi nikal jayega fir bhi finally print hoga aur agr aap try block ho hata do to ye print nhi hoga
//            System.out.println("hello I am finally");
//        }
//        return 0;  //yha function  ke baad return krna padega re babu bhaiya
//    }
//    public static void main(String[] args) {
//        try{
//            finallyy();
//
//        }
//
//        catch(Exception e){        //   are ish try ke kathm hone ke baad ham sirf or sirf catch ko hi likh skte hai or kisi ko bhi add nhi krr skte wese finally bhi daal skte hai
//            System.out.println(e);
//        }
////    finally{  // ishme
////            System.out.println("hello I am finally");
////        }
//////        **
////        System.out.println(finallyy());
////
////
//        int a = 10;
//        int b=5;
//        while(true){
//            try{
//                System.out.println(a/b);
//            }
//            catch(Exception e){
//                System.out.println(e);
//                break;  //agr yha ye break nhi lagaunga to ye loop chlata hi rhegaa
//            }
//            //chahe tum break statement bhi laga do tab bhi finally print hoke rahungaa
//            finally{
//                System.out.println("are yrr me print honga hii chae tum kuch bhi krr loo");
//            }
//            b--;
//        }
//            try{                   //  or agr try me kuch exception aa jaye to finally printhoga catch ki tarah                      // ham try ke baad bhi finally ko likh skte hai
//        System.out.println(5/0);}
//            finally{
//                System.out.println("are aa gya");
//            }
//}
//}

//************************************************
//                  PRACTICE SET


//public class CWH_15_Errors {
//    public static void main(String[] args) {
//        syntax error
//        int a =0
//         b= 4;
//        System.out.println(a+b);

//        Logical error
//        write a program for even numbers
//        for(int i = 0; i<5;i++){  hamne to proragm evenka likha hai lekin cp ko kese pata ki ye even ki jagah odd ho gya hai
//            System.out.println(2*i +1);
//        }

//        runtime error
//        int a= 2;
//        int b=0;  // thows a runtime error
//        System.out.println(a/b);
//    }
//
//}

//*****************
//2
//class pre extends Exception{
//    public String toString(){
//        return "haha";
//    }
////    public String getMessage(){
////        return "hehe";
////    }
//}
//
//public class CWH_15_Errors {
//    static int ru() throws pre {
//        int a = 8;
//        int b = 0;
//        int c = a / b;
//        return c;
//    }
//
//    static int tu(int a, int b) throws IllegalArgumentException {
////        System.out.println(a+b);
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//
//        try {
//            System.out.println(ru());
//            throw new pre();
//        } catch (Exception e) {
//            System.out.println(e);}
//
//            try {
//                System.out.println(tu(2, 3));
//
//            } catch (Exception e) {
//                System.out.println("hehe");
//            }
//        }
//    }

//ye upr itna bada program likha koi fayda nhi
// whi program lik rh ahu dubra

//public class CWH_15_Errors {
//    public static void main(String[] args) {
//
//        try{
//            int a= 343/0;
//        }
//        catch(ArithmeticException e){
//            System.out.println("haha");
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("hehe");
//        }
//    }
//}

// 4*******************


//public class CWH_15_Errors {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the values of the array");
//        int[] arr = new int[5];
//        for (int i = 0; i<5;i++){
//             arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the value of array index which you want to know");
//        int i = sc.nextInt();
//        try{
//
//            System.out.println(arr[i]);
//        }
//        catch(Exception e){
//            System.out.println("Exception bete Exception");
//        }
//    }
//}