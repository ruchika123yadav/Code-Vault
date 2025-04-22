public class pattern2 {
    public static void main(String[] args) {
//        01 SIMPLE STAR PATTERN
//        for(int i=0;i<4;i++){
//            for(int j=0;j<4;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        02
//*
//**
//***
//****
//*****
//        for(int i=0;i<5;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        03
//        1
//        12
//        123
//        1234
//        12345
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j =1;j<=n;j++){
//                if((n-i)>=j){
//                    System.out.print(" ");
//                }
//                else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int val=0;
            for(int j=1;j<=2*i-1;j++){
                if(i<j){
                    val--;
                    System.out.print(val);
                }
                else{
                    val++;


                    System.out.print(val);



                }
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
