///**
// * This class is to demonstrate out Java doc and how it is used in the java industry
// * This is <i>italic</i> word<p>THis is my paragraph</p>
//@author Ruchika (code with RUchika)
// @version 0.2
// @since 2003
// @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">java Docs</a>
//
// */
//// yha jo mene html di ahi wo render hoo rhi haii

//public class CWH_18_javaDoc {
//    /**
//     * this is the discription of the method
//     * @param a This is the first number to add
//     * @param b This is the second number to add
//     * @return It returns c as a  which is a sum of the two numbers
//     * @throws Exception If a is equal to 0
//     * @deprecated This method is depricated please use + operator
//     */
////    deprecated means ye proragram mtt use kro yr purana ho gya haii isse bhi behtar naye tareke hai
//    public static int add(int a, int b) throws Exception{
//        if(a==0){
//            throw new ArithmeticException();
//        }
//      int c = a+b;
//      return c;
//    }
//    public static void main(String[] args) {
//        System.out.println("I am the method one");
//        System.out.println("Now today,I have been completed my java videos");
//    }
//}
//ishme agr ham koi bhi doc kisi methos ke upr banate hai to to ush methos ki do cbanegii
//or agr kisi class ke upr banay e to wo class ki baneegi

//jese ki dekho jo class ka discription hai wotumhe home pe nazar ayega
//lekin mehtos ks disriptionnazar nhi ayegaa

//****************************************************************88
//             ANNOTATIONS(ye hamre pakad krti ahi agr hamne koi spelling mistake ki hai koi like ish type

//
//ye krna baad mee//class rec extends rectangle{
//    public void teme(){
//        System.out.println("The time is 8 pm");
//    }
//}
//class dep{
//    @Deprecated
//    public static int sum(int a, int b){
//        return a+b;
//    }
//}
//@FunctionalInterface //its means this interface sirf ek hi method caontain karega mtlb seedhi se baat sirf ek hi methos likh skte hai iske andr
//interface myFunctionnal{
//    public void thismethod();
////    public void thismeme();
//}
//public class CWH_18_javaDoc {
//
//    public static void main(String[] args) {
//        @SuppressWarnings("Deprecation") //like compiler ki awaaz ko dabana // iska mtlb mujhe koi bhi wrning dekhno ko na milee
////       rec r = new rec();
////     dekh ruchi ishe krna hai tujhe revise krne ke baad kyuki abhi tereko kuch aa nhi rhaa bhuddhu
////        video no. 108 dubara dekh lenaa
//               dep d = new dep();
//        System.out.println( dep.sum(2,3));  //mere ko to ye result dikha rha haii
//
////        FUNCTIONAL INTERFACE
//
//    }
//}
//**********************************
//                       L A M D A EXPRESSION()age mene anstract class me sirf ek hi methos likha hai tab use hoga agr do likah to anonymous class ko use krr skte hai
//          ANONYMOUS CLASS(agr ham ksisi lass ko use kra chahte hai ek baar to ham anonymous class ka use krte haii)
@FunctionalInterface
    interface DemoAno {
        void meth1(int a);

//        void meth2();
            }

//    class AnonyDemo implements DemoAno{
//        public void meth1(){
//            System.out.println("I am meth1");
//        }
//        public void meth2(){
//            System.out.println("I am meth2");
//        }
//        public void display(){
//            System.out.println("heloo");
//        }
//    }
        public class CWH_18_javaDoc {
            public static void main(String[] args) {
//        DemoAno obj = new AnonyDemo(); // DYNAMIC MEMORY DISPATCH
//        obj.meth1();
//  ab upr hamne ek interface banaya hai jiska ham object nhi bana skte the fir hame dusri class banai padti
// ab hamne yha naonomous class bana di jisse hame koi dusri class bhi nhi banani padi aur hamra object bhi ban gya
//                DemoAno obj = new DemoAno() {
//  isse hame koi bhi aur lass banake ki jarurt nhi hai//ishme mene obj diya hai ek class ka jiak koi naam hi nhi hai ushi ko ham Nonymous class khte haii
//  ye actual me ek class to nhi ahii fir bhii ek class hai
//       @Override
//        public void meth1() {
//           System.out.println("I am the meth1");
//     }
//
//    @Override
//        public void meth2() {
//        System.out.println("I am meth2");
//        }
//       };
//                obj.meth1();
//                LMABDA EXPRESSION(are yrr ye maiyowa ko functionalinterface chaiye tlb ek hi methos hona chaiye
                  DemoAno dm = (a)->{
                      System.out.println("I am the method\n itti mushkil se to aya ye pagal lamda"+a);
                  };
                    dm.meth1(5);
     }
}