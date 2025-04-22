import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class CWH_21_HashMap {
    public static void main(String[] args) {
//        HashMap<String,Integer> h= new HashMap<>();
////        PUT
//        h.put("India",21);
//        h.put("India",25);
//        h.put("Japan",22);
//        h.put("America",24);
//        System.out.println(h);
//
////        GET
//        System.out.println( h.get("America"));
////        CONTAINKEY
//        System.out.println(h.containsKey("Japan"));
//        System.out.println(h.containsKey("tree"));
//
////        REMOVE
//        System.out.println(h.remove("India"));
//        System.out.println(h);
//
////        ITERATION
//        Set<String> s= h.keySet();
//        System.out.println(s);
////        NOW PRINTTING THE KEYS
//        for (String k: s) {
//            System.out.println("The values"+k+"are"+h.get(k));
////  LinkedList<Node> l= bucket[bi];
//            h.clear();
////            for(String s: s){
////                if(s == s.get(s){
////                    s.add(s);
////                }
////            }

//        }

        Set<student> students=new HashSet<>();
        students.add(new student("Ruchika",66));
        students.add(new student("Om",63));
        students.add(new student("Rajesh",66));
        students.add(new student("Mala",61));
        System.out.println(students);

    }
}
