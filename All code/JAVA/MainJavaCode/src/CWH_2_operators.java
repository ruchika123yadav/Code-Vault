import java.util.Scanner;
public class CWH_2_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = 4;  // assignment operator
//        int b = 6 % 4;  // modulus operator
        // 4.8%1.1 --> returns decimal no. also
//        b += 5; // airtmetic opertotr
//        System.out.println(b);
//        System.out.println(6 > 3); // logical operator
//
//        System.out.println(65 > 3 && 56 > 24); // logical operator
//
//        System.out.println(2 > 3 || 6 > 24);

        //*********precedence and associativity

//        int a = 6*5-34/2;
        //int g = 5/50.f * 45/50,f;
        /*
        =30 -34/2    ye precendence hai jha alg alg priority hai
        30 - 17
        13
         */
//        int b = 60/5-34*2;
        /*     yha associativity yha same precedence hoti hai ishliye left to right leke jayenge
        12-68
        -56
         */

        // quik quiz

//        int x =4;
//        int y =0;
//        int s = 0;
      //  int z =x * y/2;
        //System.out.println(z);
//        int z = y*y - (4*x*s)/(2*x) ;
       // System.out.println(z);
//        System.out.println(a);
//        System.out.println(b);

        //   sum of two datatype

//        int a = 64 ;
//        int e = 5;
//        int g = 6;
//        int i= a + e;
//        float f = 5.34f + 45;
//        System.out.println(f);

        //*********increament and dreacrement  operators

//        int f= 67;
//         int b= f ++;  //first b is assigned f and then increamented
//        System.out.println(f);
////         int b= ++f;  //first b is increamented f and then assignedd
//        System.out.println(++f);
//        System.out.println(f);
//        System.out.println(f++);
//        System.out.println(f);

        // qiuz
        //find x

         int y = 7;
         int x = ++y *6;
         char ch = 'a';
         ch++;
         ch++;
         ch++;
//        System.out.println(ch);
//        System.out.println(x);
//      **************************
//                                                           BIT MANUPULATIONS OPERATIONS

//        BITWISE OPERATORS


//        & = 0101   // 1 TREAT LIKE TRUE EK BHI FALSE TO FALSE MILEGA
//            0110
//            0100
        System.out.println(12&4);
//
//               || = 0101   // binary or
//                   0110
//                   0111
        System.out.println(12|4);

//                ^ = 0101 // binary xor   same type ke honge to zero ho jayenge
//                    0110
//                    0011
        System.out.println(12^4);
//
//               ~ = 0101      //binary one or complement   complement ho jayega
//                   1010
                      System.out.println(~0);

//               << =  0101  and 0110<<1         //binay let shift  sare value left me shift ho jayego or last me 0 add ho  jayega
//                     1010      1100
//
//
//                >> =  0101  and 0110>>1   //binary right shift
//                      0010      0011

//                     PROGRAM TO FIND NUMBER IS ODD OR EVEN
//        System.out.println("Enter the number to check");
//        int a=sc.nextInt();
//        if((a&1)==0){
//            System.out.println("Number is even");
//        }
//        else{
//            System.out.println("Number is odd");
//        }

//                                            BIT  OPERATIONS(ye bit operations hai agr agr ham number digit me bhi de to operation wo binary me hi krenge)
//                            GET BIT(isse ham kisi bh position ki value nikaal sktehai ki ush jagah 1 ahi ya 0)
//        System.out.println("Enter the value of position to find the bit");
//        int i=sc.nextInt();
//        int bitmask=1<<i; //isse hame jis position me value chahiye wo position pe 1  aa jayega uske alawa sab 0
//        System.out.println(bitmask);
//        int n=10;
//
//        if((n & bitmask)==0){    //isko 1 ke equal nhi kee skte kyuki wrna condition hamesha false hi ayegi kyuki ye number 0 dega ya to fir non-zeo
//            System.out.println("Bit is 0");
//        }
//        else{
//            System.out.println("bit is 1");
//        }


//        SET BIT( ish program se ham kisi bhi bit ko change krr rhe hai 0 ki jagah 1)
//            int n=5;
//            int pos = 3;
//            int bitMask= 1<<pos;    //
//
//        System.out.println((bitMask));
//        int num= bitMask | n ;            // ishme ham bitwise or ka use krenge
//        System.out.println(num);



// CLEAR BIT(KISI BHI INDEX PE JAKE USH INDEX ki value pe ush particular no, ko 0 krna)
//        int n=5;
//        int pos = 0;     //ishme dimaag asihe lagao ki ham i bit ka no, lenge to hame jis position pe 0 uske liye ham 1 bit wale no. me ushi same position pe o krr de to fir AND laga de to o ki wajah se hame 0 mil jayega
//        int bitMask= 1<<pos;
//      int comp= ~(bitMask);
//        System.out.println(bitMask);
//        int num=  comp & n ;       // yha ham use krege not ka and AND ka
//        System.out.println(num);

//     UPDATE BIT(ISHME HAM BIT ME KUCH UPDATE KRR RHE HONGE LIKE KISI JAGAH 1 HAI TO USHE 0 BANA DENGE AGR 0  HAI TO 1 BANA DENGE)
//
//        int n=5;    //0101
//        int oper=sc.nextInt();
//        int pos = 1;
//        int bitMask=1<<pos;
//        if (oper==1){
//            int num= bitMask | n;
//            System.out.println(num);
//        }
//        else {
//            int comp=~(bitMask);
//            int newnum= comp & n;
//            System.out.println(newnum);
//        }

//       clear LAST Ith BIT
        int no=10;
        int ii=2;
        System.out.println(no & ((-1)<<ii));

        System.out.println(1000|100); // agr me aishe likhu fir bhi ye inhe decimal hi consider krenge or decimal me hi value return krenge

//        CLEAR RANGE OF BIT
        int h=10;
        int i=2,j=4;
        int a =((~0)<<(j+1));
        int b=(1<<(i))-1; //yha i tak 00 lana hai or usse 1 minus krr dena haii
        int bitmask=a | b;
        System.out.println(h & bitmask);

//        PRACTICE QUESTION(NUMBER IS POWER OF 2 OR NOT)
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("Yes the number is of power of 2");
        }
         else{
            System.out.println("No,Number is not power of 2");
        }

//         COUNT SET BIT IN A NUMBER
          int u =15;
//         int base =2
         int count=0;
         for(int s=0;s<=3;s++){
             if((u&1)!=0){
                 count++;
             }
            u=u>>1;
         }
        System.out.println(count);
//        System.out.println((Math.log(u)) / Math.log(2));


//*********************************************************************************
        // PRACTICE PROBLEM
//        for(int i=0;i<5;i++){
//
//            for(int j=5;j>i;j--){
//                System.out.printf("*");
//            }
//            System.out.println("\n");
//        }

//        ****************************
//    int n = 4,sum=0;           //ye first four even no. nhi blki  first four natural no. me se even no. dekh rha hai
//    for(int i = 0;i<n;i++) {
//        if (i % 2 == 0) {
//            sum = sum + i;
//        sum = sum + (2*i);
////        }
//    }
//        System.out.println(sum);

//        ***********************
//        int n=5;
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d*%d=%d\n",n,i,n*i);
//        }
//**************************************
//        int n=5;
//        for(int i = 10; i >= 1; i--) {
//            System.out.printf("%d*%d=%d\n",n,i,n*i);
//        }
//*****************************************************************
//        int n=6,fact=1;
//        for(int i=1;i<=n;i++){
//            fact= fact*i;
//        }
//        System.out.print("the factorial of the number 4 is");
//        System.out.println(fact);

//        **************************************************
//            int n=8,sum=0;
//            for(int i = 10; i >= 1; i--) {
//                System.out.printf("%d*%d=%d\n",n,i,n*i);
//                sum = sum+ (n*i);
//            }
//            System.out.print("the sum of the number multiplication table of 8 ");
//            System.out.println(sum);
//

        }
}