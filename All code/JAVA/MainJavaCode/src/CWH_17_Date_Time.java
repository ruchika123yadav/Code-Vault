
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
//class Date{
//    int year;
//    int month;
//    int date;
//    public Date(int Y, int M, int D){
//        this.year = Y;
//        this.month = M;
//        this.date = D;
//    }
//}

    public class CWH_17_Date_Time {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
////        1000 =sec , 3600 = min , 24 = din , 365 = saal
////        java 1970 se start year manta haii
//
//        // quiz
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
////        dekho bahi seedhi se baat haii hamre pass long me value 5 charects jaada padi hai store krne ke liye to wo hamare liye beneficial hai usse ushme stotr krne ke liyee
//
////        DATE AND TIME
////        Date d = new Date(23,34,12);  jo ki mujhse hua nhii
////        Date.year = 34;
//        Date d = new Date();
//        System.out.println(d);
//        System.out.println(d.getTime());
//        System.out.println(d.getDate());
//        System.out.println(d.getDay());
//        System.out.println(d.getYear());

// **********        CALENDAR CLASS(it is a abstract class so it is not a constructor)

//        Calendar c = Calendar.getInstance( TimeZone.getTimeZone("Asia/Singapore"));
//        Calendar c = Calendar.getInstance( );
////        agr me getinstance me kuch bbhi naa do to wo asia/calcutta wali id dikhayegaa
//        System.out.println(c.getCalendarType());
//// gregory calendar ye whi hai jo hamra normal calendar hota hai jo ham ghar me use krte haii
//        System.out.println(c.getTimeZone().getID());
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND)); // ye hame time ki darah dikha skta haii  // AGR RAILWAY WALI TIMING pata krni hai to hour of day ka use krr skte hai
//        System.out.println(c.SECOND);
//        System.out.println(c.YEAR);
//        System.out.println(c.DATE);

//        GERGORAIN CALENDAR CLASS(ye concride class hai)
// we ca change the year month & date using set method ye revise krkne ke baad kriyoo or rkna hai kisi bhi halat mee
//        GregorianCalendar cal = new GregorianCalendar();
//        System.out.println(cal.isLeapYear(2020));  // ye function hame ye year leap year hai ki nhi ye batata hai


//        TIME ZONE
//        System.out.println(TimeZone.getAvailableIDs()[0]);
//        System.out.println(TimeZone.getAvailableIDs()[1]);
//        System.out.println(TimeZone.getAvailableIDs()[2]);
//        //get default
//        System.out.println(TimeZone. getDefault());
//        System.out.println(TimeZone.getID());   // get id to haii hi nhii

//         time pacakge
//        LocalDate d = LocalDate.now();
//        System.out.println(d);
//
//        LocalTime t  = LocalTime.now();
//        System.out.println(t);
//
//        LocalDateTime dt = LocalDateTime.now();
//        System.out.println(dt);  // ye hame date or time dono print krkek deta haii  ishme khasiyat ye hai ki ishme nanosec me hi dekhata haii

//         DATE TIME FORMATTER  ishme java.time ek api haii
//        LocalDateTime dt = LocalDateTime.now();  //This is the actual date
//        System.out.println(dt);
////        agr me apne manpasand formatter ka date time lena chau too
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("DD/MM/YYYY -- E H:m a ");  //ishme mene phome me photo click krr li haii ki kis letter pe kya dikhayega          // ye koi date nhi hai ye bss ek formatter hai jo ki hame jis fomat me date chaiye hogi uhme krta hai
//        //ye mtlb ush treke se jese tumhare man chahe format me aa jaye
//           String myDate = dt.format(df);   //bahi mujhe aishe string chahiye jo ki dt date ko df format me laa dee
//           // class mene localdatetime kii lee or usko implement kraya datetimeformatter ne
//        System.out.println(myDate);
//        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        String mydate = dt.format(df2);  // mujhe ish date ko ish format me krke dedo
//        System.out.println(mydate);

//         PRACTICE SET
//        1
//     ArrayList<String> name = new ArrayList<String>();
//        name.add("Ruchika yadav");
//        name.add("Rajesh yadav");
//        name.add("om yadav");
//        name.add("Mala yadav");
//        name.add("Urmila yadav");
//        name.add("Shanu yadav");
//        name.add("Shalu yadav");
//        name.add("Pooza yadav");
//        name.add("Preeti yadav");
//        name.add("Priyanka yadav");
//        name.add("Mami yadav");
//        for(int i = 0 ; i<name.size();i++){
//            System.out.println(name.get(i));
//         }
//        for(Object o : name){    // for each loop
//            System.out.println(o);
//        }

//        2
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("DD:MM:YY");
        String mytime = dt.format(dt2);
        System.out.println(mytime);
//     System.out.println(dt.getHour() +":"+ dt.getMinute()+ ":"+dt.getSecond());   //another method
//        3
        Calendar c = Calendar.getInstance( );
        System.out.println(c.get(Calendar.HOUR_OF_DAY) +":"+ c.get(Calendar.WEEK_OF_MONTH) + ":" + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//        4
         LocalDateTime d = LocalDateTime.now();
         DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
         String mydate = d.format(df);
        System.out.println(mydate);
//        5
        HashSet<Integer> hs = new HashSet<>();
        hs.add(34);
        hs.add(34);
        hs.add(24);
        hs.add(14);
        hs.add(54);
        System.out.println(hs);
    }
}