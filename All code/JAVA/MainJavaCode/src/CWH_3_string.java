import java.util.Scanner;
public class CWH_3_string {                                                                    //String ki length pata chal jayegi
    public static void main(String[] args) {                                                    //change upper case,lower case
       Scanner sc = new Scanner(System.in);                                                     //with gap ke sth bhi print
//        String name = "RUCHI";                                                                  //beech me se word kaat kr likh skte hai
                                                                                                   // ek particular point pe ek index ke char ko pbhi print krwa skte hai
//        System.out.print("The name is :");                                                      // replace krr skte hai kisi bhi word or 2-3 aplabets ko
//        System.out.println(name);                                                             //ye check krr skte hai ki end ke word ish leeter se khatam ho rhe hai ki nhi
        int a= 45;                                                                             //kisi bhi letter ka index pata krr skte hai
     // ishme ham kisi bhi word ki index pata krr skte hai ek particular index se jese ruccuhi hai to ushme mujhe c ki index janani hai prr 3 index se to wo 2 wale c ki index batayega na hi phele wale c ki
     //ishme ham last index se bhi kisi bhi leeter ka indexing jaan skte hai
     //ishme ham String ke leeters bhi check krr skte hai equal hai ki nhi with their upper and lower letter

     //****STRING BUILDER
//     ISSE HAM kisi bhi do character ke beech ki value kate ya ushme kuch jode bss ishme phele wali string me hi modify hota jayega baki same upe wali se

        float b = 45.3f;  // yha f likhna padega float value ke baad wrna eeror dikhayegakyuki wo usse double me consider krega

//        System.out.printf("The value of a and b is  %d  and %f\n",a,b);   //mtlb yha \n ,\t bhi laga skta hu

//        System.out.format("The value of a and b is  %d  and %1.3f",a,b);  // ye bhi printf ki tarah kaam krta hai
//         me yha %8.2f bhi le skta tha jiise yha 8 tak space aa or do point ke baad value ati;

//        String sr = sc.nextLine();
//        System.out.println(sr);


        //*************************************t
        //STRING METHODS
        String name = "RUCHI";
//        int value = name.length();
//        System.out.println(value);
//        String lowercase = n.toLowerCase();
//        System.out.println(lowercase);


//        System.out.println(n.charAt(4));//
//        String uppercase = name.toUpperCase();
//       // System.out.println( uppercase);
////        System.out.println( name.toLowerCase()); // ye me aishe bhi print krwa skta tha
//
//        String nonTrimmedString = "     RCUHIKA      ";
//        System.out.println(nonTrimmedString);
//        String trimmed = nonTrimmedString.trim();  // me ishe aishe bhi assigh krr skta huuu
//        System.out.println(trimmed );
//
//        System.out.println(name.substring(2));  //  jo phele index hai wo 0 hi maani jati hai ye ek index jo ham dete hai wha se start hoti hai or end tak jati hia
//        System.out.println(name.substring(2,4));  //  ishme jo end string ham likhenge ushme jo end string likhi wo char hat jayega baki sab print ho jayega

//        System.out.println(name.replace('R','t'));  // ishe ham char change krr skte hai
//        System.out.println(name.replace("RUC","tmk"));
//        System.out.println(name.replace("U","tmk"));

//        System.out.println(name.endsWith("CHI"));
//        System.out.println(name.startsWith("Ruc"));// ye upper case o
//        System.out.println(name.indexOf("UC"));
        String ne= "Harryrry";
        System.out.println(ne.indexOf("r",0));   //ye index batata hai ki r konse index no. pe ayega
        System.out.println(ne.lastIndexOf("y"));  //ishme jo index searh hota hai wo last se hota hai lekin indexing value suru se hi start hogi;
        System.out.println(ne.lastIndexOf("rry",7));

//        System.out.println(name.equals("Rughhi"));           //yha ye upper case bhi dekhega ki same hai ki nhi
//        System.out.println(name.equalsIgnoreCase("rucHi"));  // yha se ye  upper case ko ignore karega or value milaega bss

//        System.out.println("I am escape sequence \t double code \t ye mene apne se try kiya");  // yha ham double code laga skte hai
        // iise me ek cheez to krr skta hu ki ki kisi bhi char ko likne ke liye baar baar println ka use nhi krna padega
//        System.out.println(name.toLowerCase());
//        String nam= sc.nextLine();
//        System.out.println("Dear \n\t" +nam+ "\n\t thanks a lot");  //yhs bss jese ham keyboard se variable bana ke add nhi krr skte wo usko print hi lega not variable so plus hi lagana padega

//***************************************************************




//              STRING BUILDER(Its just like ki ham string me kuch bhii ad ya remove kre to wo agli string ke liye add ya remove hoke ayegaa)
     //ek cheez dekh rhe ho ki jo hamne upr jitni bhi string me change kiya tha usse niche wali ko farak nhi pad rha tha
     //lekin yha pe string builder me change hoke value aa rhi hai mtlb wo value whi rhegi jo agli/ me change krenge wo ushi pehle wali change me hi modify hoke ayegi

//       String name= "ruchi";
//        System.out.println(name+ "lu");
//        System.out.println(name+"tm");  indono me upr ruchi wali me hi change hoke ayega
        StringBuilder yo= new StringBuilder("tony Stark");   //its a class
        System.out.println(yo);
   // isse me apne name me or koi bhi characters add krr skata hu
        yo.insert(0,"ru"); //agr me niche wale ko uncomment krr du to wo ruru do waar print ho jayega
//        System.out.println(  yo.insert(0,"ru"));     //isse hamre name ke phele  letter bhi judh jayenge jo hame jodne honge
        System.out.println(yo);
//        System.out.println(yo.replace("ton","appy" ) );     // string builder me ham replace nhi laga skte
//
        yo.insert(3,"ru");  //jese mene ishme 3 letter se ru jodna chaha hai to wo 3 index pe hi start ho jayega print hona
        System.out.println(yo);
//        ek cheez dekh rhe ho ki jo hamne upr jitni bhi string me change kiya tha usse niche wali ko farak nhi pad rha tha

                //isse ham name ke characters delete krr skte hai
        yo.delete(2,5);  // ishme 2 include hoga lekin 5 nhi
        System.out.println(yo);
        System.out.println(yo. substring(2,4));  //areee ye 2 se 4 ke beech ke character likhega or delete wal 2 se 5 ke beech ke charater delete krega

        // ishme ham cheeze append bhi krr skte hai
        StringBuilder sb= new StringBuilder("H");

//        sb.append("E");
//        sb.append("L");
//        sb.append("L");     // same sstring me modify ho rha hai to operations kam lag rhe hai or time and space bhi  bach rha HAI
//        sb.append("O");
     sb.insert(1,"E");// ye to insert se bhi ho gyaa
     sb.insert(2,"l");
     sb.insert(3,"l");
     sb.insert(4,"0");
        System.out.println(sb);

     System.out.println(sb.length());

        System.out.println(sb);

     //     REVERSE STRING
//     EK NAME KE CHARACTER KO REVERSE KRITO

    }


}
