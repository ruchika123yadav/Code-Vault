
import java.util.HashSet;
public class CWH_z_RECURSSION {
// stack over flow means agr recurssion me koi condition na de or to infinitely chalta jayega chlaya jayega

    //                          jab bhi memory me recursive calls hoti hai to wo stack ki formme hoti hai mtlb ek ke upr ek

    // *******IMPORTANT QUESTION ISHLIYE PEHELE KRR RHA HU
    //PRINT ALL SUBSEQUENCES OF A STRING(subsequence ka mtln ki agr koi string hamre jo ham nayi string bana rhe hai ushme add hona chti hai ki nhi)

public static void subseqs (String str, int idx, String newstr){
    if(idx== str.length()){
        System.out.println(newstr);
        return;
    }
    char curr=str.charAt(idx);     //ye ek particular integral pe ush charcter ki vlaue batat hai
    // character ana chta hai ke liye ye function
    subseqs(str,idx+1,newstr+curr);

    // or nhi ana chata ke liye ye wala
    subseqs(str,idx+1,newstr);

}
    public static void main(String args[]) {

    String str="abc";  //total no of sub hote hai 2 ki power jitni length ki strinf di hai
    subseqs(str,0,"");

//***************************************
// AGR ISIQUESTION KO MODIFY KRKE ISHME UNIQUE STRING ADD KRWANI HOTI TO LIKE ISHME HAM AAA DENGE TO WO WHI 7 STEPS ME AYEGI LEIN HAME TO AAA,AA,A LANA TO YE
//    USE HASHSET ITS LIKE A SET JIME HAM UNIQUE VALUES STORE KRWATE HAI

//    public static void subseqs (String str, int idx, String newstr,HashSet<String> set){
//    if(idx== str.length()){
//         if (set.contains(newstr)){   //yha.conatsins mtlb agr wo string set me exist yani conatain krti ho
//        return;
//    }
//         else{
//
//             set.add(newstr);  //or ishme add ka mttb set me wo hamari new string add krdo
//             System.out.println(newstr);
//             return;
//         }
//    }
//    char curr=str.charAt(idx);
//    // character ana chta hai ke liye ye function
//    subseqs(str,idx+1,newstr+curr,set);
//
//    // or nhi ana chata ke liye ye wala
//    subseqs(str,idx+1,newstr,set);
//
//}
//    public static void main(String args[]) {
// HashSet<String> set= new HashSet<>();
//    String str="aaa";  //total no of sub hote hai 2 ki power jitni length ki strinf di hai
//    subseqs(str,0,"",set);
//
//******************************************************************************************
//    MOBILE FUNCTION(mtlb mobile ke sare keypad jo ate the jis no. pe usse print krwana
//mujhe nhi samaj aya ye wala pata nhi kya hi tha😒
//   public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//
//   public static void prtcomb(String str, int idx,String comb){
//
//       if(idx==str.length()){
//           System.out.println(comb);
//           return;// yha return ishliye lagaya hai kyuki ek function ki value milne ke bad ye dubara wapas chala jaye dusrw function ke pass
//       }
//       char curr=str.charAt(idx);
//       String mapping = keypad[curr-'0'];
//       for(int i=0;i<mapping.length();i++){
//           prtcomb(str,idx+1,comb+mapping.charAt(i));
//
//       }
//   }
//
//    public static void main(String args[]) {
//       String str="4";
//          prtcomb(str,0,"");
//


//    **************************************************8
//    ADVANCED QUESTIONS




//    public static void main(String args[]) {












//    public static int fact(int n){
//       if ( n==1){
//           return 1;
//       }
//       else {
//
//           return ( n * fact(n - 1));
//       }
//
//    }
//
//
//
//    public static void main(String[] args) {
//        int n=5;
//        System.out.println( fact(n));
//***********************************************
//public static void printSum(int n, int sum) {
//    if(n == 0) {
//        System.out.println(sum);
//        return;
//    }
//    sum += n;
//    printSum(n-1, sum);
//}
//    public static void main(String args[]) {
//        printSum(3, 0);


    //    ***********************************
//    public s


//    **************************************
//         FABONACCI SEREIS
//    public static int fab(int n){
//
//        if (n==0){
//            return 0;
//        }
//        if (n==1) {
//        return 1;
//        }
//        System.out.println(n);          // isse wo turn print nhi ho rhe

//    return fab(n-1) + fab(n-2);
//
//
//}
//
//    public static void main(String[] args) {
//        int n=8;
//        System.out.println(fab(n));


//    ***************************************
    // STACK HEIGHT (mtlb jitne no. ham function ko call krrwa rhe ho)

//public static double stack(int x, int n){
//    if (n==0){
//        return 1;
//    }
//    if (x==0){
//        return 0;
//    }
//    return x* Math.pow(x,(n-1));   //ye baat dhyaan rkahna ki pow wala funtion double me chalta hai
//}
//
//         public static void main(String[] args) {
////    int n=2;
////    int x=5;
//        System.out.println(stack(2,5));

//    ******************************
    // PRINT X^n ( stack height = logn)



//    public static void main(String[] args) {


//    ***************************
    //TOWER OF HANOI(GAMAAR QUESTION)

//    public static void hanaoi(int n,String src,String helper,String dest){
//        if(n==1){
//            System.out.println("transfer disk" +n+ "from" +src+ "to" +dest);
//            return;
//        }
//        hanaoi(n-1,src,dest,helper);
//        System.out.println("transfer disk" + n + "from" + src + "to" + dest);
//        hanaoi(n-1,helper,src,dest);
//
//
//    }
////
////
//    public static void main(String[] args) {
//        int n=3;
//        hanaoi(n,"S","H","D");

//    *********************************************
////    REVERSE THE STRING
//public static void string( String str, int idx){
//    if (idx==10){
//        System.out.println(str.charAt(idx));
//        return;
//    }
//    System.out.println(str.charAt(idx));
//    string(str,idx-1);
//
//}
//
//    public static void main(String[] args) {
//    String str = "abcd";
//    string(str,str.length()-1);   //are ha tu yha 0 se start krr rhi hai na to uski length me se 1 to - krna hi hoga na
//
//
//      String name="abcd";
//      for (int i=(name.length()-1); i>0;i--)
//          System.out.println(name.indexOf( i));


//    ********************************

//public static int first = -1;
//public static int last =-1;
//    public static void index(String str,int idx,char element){
//        if (idx== str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(currChar==element){
//            if (first == -1){
//                first=idx;}
//            else{
//                last = idx;
//            }
//        }
//          index(str,idx+1,element);
//    }
//
//    public static void main(String[] args){
//        String  str ="abaacdaefaah";
////        System.out.println(name.indexOf("a"));
////        System.out.println(name.lastIndexOf("a"));
//              index(str,0,'a');  //yha  ek character o double code se nhi likhte


//    ************************************
    // SORTED NUMBERS
//    public static boolean sort(int arr[],int idx){
//        if(idx==arr.length-1) {
//        return true;
//        }
//        if (arr[idx]<arr[idx+1]){
//
//            return sort(arr,idx+1);
//        }
//        else {
//            return false;
//        }
//    }
//public static void main(String[] args){
//              int [] arr={1,2,3};
//    System.out.println(sort(arr,0));


//    ***************************
    //MOVING ALL X TO LAST(accha question tha 😀)
//    public static void ex(String str,String newstr,int idx,int count){
////        count++;   agr me ishe yha likhunga to ye to code run 7 baar krega to ye count ki value bhi 7 ho jayegi
//if (idx== str.length()) {
//    for (int i = 0; i < count; i++) {
//        newstr += 'x';  // ham ye ishme aishe bhi likh skte hai
//    }
//    System.out.println(newstr);
//    return;
//}
//char curr= str.charAt(idx);
//if (curr!='x'){
//newstr +=curr;  // are yha bhi to niche function call krwana hoga kyuki agr if shi hua to wo else me jayega hi nhi or function bhi calll nhi hoga
//    ex(str, newstr, idx + 1, count);
//}
//else {
//    count++;
//    ex(str, newstr, idx + 1, count);
//}
//    }
//
//public static void main(String[] args){
//        String str="axbcxxd";
//         String newstr= "";
//    ex(str,newstr,0,0);

//    *************************************
    //REMOVE DUPLICATES(ish question me ye important hai ki tum boolean se approacj lagake solve krr skte ho question)
//    public static  boolean []map = new boolean[26];
//    public static void remove(String str,int idx,String newstr){
//        if(idx==str.length()){
//            System.out.println(newstr);
//            return;
//        }
//        char curr=str.charAt(idx);
//        if (map[curr - 'a']){   //ishme hame boolean ke arry me san me false store krwaya hai to pehle jo bhi ayega wo hamw false hi dikheyga lekinbaad me hamne else me usse true krr diya to wo reapeat nhi hoga
//            remove(str,idx+1,newstr);
//        }
//        else {
//            newstr +=curr;
//            map[curr-'a']=true;
//            remove(str,idx+1,newstr);
//        }
//    }
//public static void main(String[] args){
//        String str= "abbcdda";
//    remove(str, 0, "");
    }
}