import java.util.Scanner;
import java.util.Random;

//public class Gaming {
//    public static void main(String[] args) {
        //0 for Rock
        //1 for paper
        //2 for Scissor

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter 0 for Rock,1 for paper and 2 for scissor ");
//        int n = sc.nextInt();
//
//        Random random= new Random();
//        int compinput = random.nextInt(3);  // iska mtlb ye hai ki computer 1,2ya 3 me shi kuch chune
//
//
//        if(n==compinput){
//            System.out.println("Game is draw");
//        }
//
//        else if(n==0 && compinput==2 || n==1 && compinput==1 || n==2 && compinput==1){
//            System.out.println("You winn!!!!");
//        }
//        else{
//            System.out.println("Computer winn");
//        }
//
//        System.out.println("Computer choice"+ compinput);
////
// }
////          }
//        *********************************************************
//create a class game, which allows a user to play "guess the number game once". Game should have the following methods
//
class game{
    int  number;
    public game(int n){
     this.number = n;
    }
//    public int userinput(){
//        retur
//    }
}


public class Gaming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you number please");
        int n = sc.nextInt();
        Random random = new Random();
        int number=random.nextInt(100);

        if(n==number){
            System.out.println("your guess is correct");
        }
        else if(n<number){
            System.out.println("please enter some greater number");
        }
        else {
            System.out.println("please enter some smaller number");
        }
        System.out.println("computer guess number"+ number);
    }
}
