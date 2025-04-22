import java.util.Collections;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.*;
public class CWH_16_CollectionFramework {
    public static void main(String[] args) {
//        ArrayList<Integer> l1 = new ArrayList<>();  // agr me shme koi value na dto iski initial value 10 hoti ahai
//        ArrayList<Integer> l2 = new ArrayList<>(5);
//        l2.add(12);
//        l2.add(15);
//        l2.add(12);
//        l2.add(13);
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        l1.add(5);
//        l1.addAll(l2);
//        l1.add(0,45);
//        l1.add(0,25);  // jo new wala tumne add kiya hai  hi phele print hoga
//
//        System.out.println(l1);
//        System.out.println(l1.size());
////                  clear
////                l1.clear();
//
////                contains
//        System.out.println(l1.contains(15));
//
////        indexof
//      int  l = l1.indexOf(12);
//      int  li = l1.lastIndexOf(12);
//        System.out.println(l);
//        System.out.println(li);
//
////        set isse ham jo jo hata chahe wo hata dete hai or uski jagah ek durse element ko add krr dete hai lekin add me agr ham kuch index pe add krte the to wo hatata nhi whi blki whi ki whi jod deta thaa
//        System.out.println(l1.set(0,50));
//
//        // remove
//        l1.remove(7);
//        System.out.println(l1);
//        System.out.println(l1.size());
//
////           loop
//        for(int i = 0; i<l1.size();i++){
//            System.out.print(l1.get(i));
//            System.out.print(",");
//        }
//
////         sorting of the array
//        Collections.sort(l1);
//        System.out.println(l1);
//

//        ***************************************************
//                            LINKED LIST( IT IS SAME LIKE ARRAY LIST BUT THIER IS ONLY A INTERNAL DIFFERNCE BETWEEN THESE TWO)

//        LinkedList<Integer> ll = new LinkedList<>();
//        LinkedList<Integer> l4 = new LinkedList<>();
//        ll.add(23);
//        ll.add(12);
//        ll.add(56);
//        ll.add(13);
//        l4.add(1);
//        ll.add(50);
//        l4.add(1);  // yani ki jo l4 hai wo last me hi add hoga vhahe tum use phele likh lo yaa baad me
//
//        l4.add(15);
//        System.out.println(ll);
////       **
//        ll.add(0,2);
//        System.out.println(ll);
//
////        **
//        ll.remove(3);
//        System.out.println(ll);
//
////         **
//        ll.addAll(l4);
//        System.out.println(ll);
//
////        **
//        ll.set(1,4);
//        System.out.println(ll);
//
////        **
//        System.out.println(ll.contains(129));
//
////        **  ADDFIRST AND ADDLAST
//        ll.addFirst(5);
//        ll.addLast(90);
//        System.out.println(ll);  // sabse age wale index pe jake add ho jayega koi bhi element ko remove nhi karega

//        *****************************************************************
//        ARRAY DEQUEUE(double ended queue means ham insertion piche se or age se dono jagah se krr skte haii)

//         ArrayDeque<Integer> ad = new ArrayDeque<>();
//         ad.add(2);
//         ad.add(5);
//         ad.add(3);
//         ad.add(4);
//        System.out.println(ad);
//        ad.addFirst(10);
//        ad.addFirst(12);
//        System.out.println(ad);

//it is very easy in iteration
//        HASHSET(ye over arraylist se accha ishliye hai kyuki agr ishme hame koi bhi element dhunga hoga to ham usse element%size se dudh lenege arram see)
//        dikkat ye hai ki agr remainder same aa gya to kya krenge to uske liye next free slot me ushe rakh denge age store krate rhenge age hamre pass jagah nhi hai
//        CHAINING ye krke bhi ek technique hoti hai jisse ham agr do same remainder aa rhe hai jese 72 & 92 to usshme ham indno ko ek linked list me store kara denge
        HashSet<Integer> hs = new HashSet<>(12,0.45F);  // default iska size 16 hota hai
        hs.add(23);
        hs.add(11);  // ye sirf ek hi element ko print krega agr usi jese same hai list me to
        hs.add(11);
        hs.add(15);
        System.out.println(hs);

//        LOADING FACTOR ( APKKI HASH TABLE KITNI INCREASE KI JAA SKTI HAI BEFORE APKI HASH TABLE KO BADAYA JAYE
//        TECHINIQUES(COLLECTIONS)
//        HASHSET, HASH MAP, LINKED HASH MAP , HASH TABLE

    }
}