//         ARRAY LIST
// array me ham apne int , float,objects ko store kra skte hai
//lekin array list me sirf objects ko store krr skte hai kyuki ye jese hi banege ham inhe objects me store krwa lenge  lekin primitve ke liye hame phele se bana ke rakhni padti hai
// ye saari ki sari store  hai heap and stack ke andr
//operations
//** ADD,GET,MODIFY,DELETE

 import java.util.ArrayList;
import java.util.Collections;
 //import java.util.*; // isse hame baar baar packacge ko import nhi krna padega jitni bhi pacakge honge sare import ho jayenge apne app

public class CWH_z_ARRAYLIST {
    public static void main(String[] args) {
        //ab yha int to store kra nhi skte to inke liye ek specific class hoti hai
        //like Integer /Float/string/Boolean sabka phela word capital hoga
ArrayList<Integer> list = new ArrayList<>();
//ArrayList<Integer> list = new ArrayList<>(Integer);
//ArrayList<Boolean> list = new ArrayList<>();

        //add elements ise hamre array list me elemnt add ho jate hai
        list.add(0);
        list.add(5);
        list.add(6);
        System.out.println(list);

        //get elements
    int element=    list.get(2);
        System.out.println(element);

        // add another element in between
        list.add(1,8);
        System.out.println(list);

        //set elements
        list.set(0,3);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size of array
        int size =list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println("");
        //sorting
        Collections.sort(list);   // collection me hamre ek sort naam ka function hota hai orr usek sath sath jitni bhi data structure hote hai like maps,tress,unko bhi sort krne ke liye ye hi hai jo ki hamre sorting me kaam ata hai
        System.out.println(list);

    }
}
