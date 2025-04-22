public class CWH_5_loops {
    public static void main(String[] args) {
//        int i = 10 ;
//        WHILE LOOP
//        while(i<=20){    //ye dhyan rakhna idar semi colon nhi lagta but do while me lagta hai
//            System.out.println(i);
//            i++;
//        }

//        *************************
//        DO WHILE LOOP
        int ii = 3;
        do {
            System.out.println(ii);
            ii++;
        }
        while (ii <= 2);



//
//        ***********************************
////        FOR LOOP
//        for(int i=1;i<=10;i++) {
//            System.out.println(i);
//        }
//            2i= even number = 0,2,4,6
//            2i +1 = odd number = 1,3,5
//        for even no. sout(2*i);
//        for odd no, sout(2*i+1);

//        for(int i=10;i>0;i--){
//            System.out.println(i);
//        }
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//        break and continue statement
//        for(int i=0;i<5;i++){
//        System.out.println(i);

//            if(i==2) {
//                System.out.println("Ending oof the loop");
//        break;
//       FOR WHILE YHA I++ OR LIKHNA HOGA IDHAR
//        for do while iske baad while me condition likh dene hai bss



//        CONTINUE
 for(int i=0;i<5;i++){
        if(i==2){
        System.out.println("ending the loop");
                continue;  //ishme jis iteration ke baad ham continue lagate hai wo uske niche ki condition ko print krke seedhe upr wali contion pe chala jata hai like yha pe direct 3 pe chala jayega
            }   //control statement wo hota hai jha hamara code execute hota hai
                System.out.println(i);
                System.out.println("java is a fantastic language");
//
        }
// do while me krne ke liye phele do kee i++ lagana hoga wrna to 2 to 2 hi rhega na badega hi nhi

//|||||||||||||||||||||||||||||||||||||||||||||||||||(this type of arrow mwans apni practice)
//        int i=100;
//        while(i<=200){
//            System.out.println(i);
//            i++;
//       }

//        for(int i=5;i<10;i++){
//            if(i%2!=0) {
//                System.out.println(i);
//            }
//        }
    }
}
