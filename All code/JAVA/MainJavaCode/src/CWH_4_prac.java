import java.util.Scanner;


class BinaryTree{

    static void print(int n,int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        print(n-1,0,str+"0");
        if(last==0){
            print(n-1,1,str+"1");
        }
    }


    public static void main(String[] args) {

        print(3,0,"");


    }
}
