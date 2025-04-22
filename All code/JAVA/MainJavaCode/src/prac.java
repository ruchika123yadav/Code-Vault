import java.util.*;

public class prac {

    public static void main(String[] args) {
        String s= "leetcode";
        int k=2;
        String ss="";
        int res=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            ss+=String.valueOf((c-'a')+1);
        }
        System.out.println(ss);
//        12552031545
        while(k>=1){
            String [] digit= ss.split("");
            for(int i=0;i<digit.length;i++){
                res+=(int)Integer.valueOf(digit[i]);
                System.out.println(res);
            }
            ss=String.valueOf(res);
            k--;
        }
     }
}
