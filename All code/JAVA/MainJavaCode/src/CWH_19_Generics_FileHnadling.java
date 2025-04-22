import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//class MyGenerics<T1,T2>{  // generics is like ham kisi bhi method me koi bhi function add krr skte hai apna khud ka ek datatype banake
//    int val;
//    private T1 t1;
//    T2 t2;
//    public MyGenerics(int val,T1 t1,T2 t2){
//        this.val = val;
//        this.t1 = t1;
//        this.t2 = t2;
//
//    }
//
//    public int getval(){
//        return val;
//    }
//    public void setval(int val){
//        this.val = val;
//    }
//    public T1 gett1(){
//        return t1;
//    }
//    public void sett1(T1 t1){
//        this.t1 = t1;
//    }
//    public T2 gett2(){
//      return t2;
//    }
//    public void sett2()
//    {
//       this.t2 = t2;
//    }
//}
//public class CWH_19_Generics_FileHnadling {
//
//    public static void main(String[] args) {
////        ArrayList<Integer> ar = new ArrayList<>();  // are generics to ye hi nikla😁 mtlb yha jo hamne ishme interger datatype diya hai yani ki yha pe ham supply krr dete hai datatype ka naam
//       ArrayList ar = new ArrayList();
//       ar.add("Urmila Yadav");
//       ar.add(45);
//       ar.add("Mala yadav");
//       ar.add("Rajesh yadav");
//       ar.add(5);
//        System.out.println(ar.get(4));
////        (int) type casting
//        int a =(int) ar.get(4);  // ab ham ishme kuch bhi save krr rhe hai to hame kuch bhi assign krne se pehle uska datatype dena hoga
//        System.out.println(a);
//        MyGenerics<String,Integer> ge = new MyGenerics(23, "Ruchika yadav is the best coder in the world ",45); // or ishme ham apne mnn ke according koi bhi datatype se skte hai
//        String str = ge.gett1();
//        Integer in = ge.gett2();
//        System.out.println(str+in);
//    }
//}

//*************************************
//               FILE HANDLING
//
//public class CWH_19_Generics_FileHnadling {
//    public static void main(String[] args) {
//        File myfile = new File("CWH_BanzaFile.txt");
////        try {
////            myfile.createNewFile();
////        } catch (IOException e) {
////            System.out.println("Enable to create this file");
////            throw new RuntimeException(e);
////        }
////         code to write to a file
//        try {
//            FileWriter fileWriter = new FileWriter("CWH_BanzaFile.txt");
//            fileWriter.write("Now i can write my file using the write method\n kuch jada hi nakhre nhi hai tumhre andr kuch bhi likne ke liye\n ha chalo abb byee");
//            fileWriter.close();
//        }
//        catch(IOException e){
//        e.printStackTrace();
//        }
//
////        try{
////            Scanner sc = new Scanner(myfile);  // jese input dene ke liye scanner class banate the aishe hi read krne ke liye bhi scanner class hi banange
////            while(sc.hasNextLine()){
////                String line = sc.nextLine();
////                System.out.println(line);
////            }
////            sc.close();
////        }
////        catch (FileNotFoundException e){
////            e.printStackTrace();
////        }
//
//        if(myfile.delete()){
//            System.out.println("I have deleted my filr:"+ myfile.getName());
//        }
//        else{
//            System.out.println("Due to some error file is not deleted");
//        }
//}}

//        ****************************************
//              PRACTICE SET
//2
class dep{
    @Deprecated
    public static int sum(int a, int b){
        int c = a+b;
        return c;
    }
}
//            4
@FunctionalInterface
interface Intface{
     void meth1();

}
public class CWH_19_Generics_FileHnadling {
    public static void main(String[] args) {
        @SuppressWarnings("Deprecation")
        dep d = new dep();
        System.out.println(dep.sum(2,3)); //  mere me nhi krta error show pata nhi kyuu
        Intface f = ()->{
            System.out.println("I am the interface");
        };
        f.meth1();

//        5
        File file = new File("CWH_Ruchika.txt");
//        try{
//            file.createNewFile();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        int n = 5;
        String table = "";
        for(int i = 1;i<=10;i++){
            table +=(n+"*"+i+" = "+n*i);
            table +="\n";
        }
        try{
            FileWriter fw = new FileWriter("CWH_Ruchika.txt");
            fw.write(table);
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Some error to write int this file");
        }
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line =sc.nextLine();
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}