//meri jindgi ka phela game koi ek language kaaaa😎😎😎😎😎
#include<stdio.h>
#include<stdlib.h>//ye hame chahiye hoti hai jab ham koi random no, generate krr rhe ho
#include<time.h>
int main(){
    int number,guess,nguesses=1;
    srand(time(0));/*time zero apko sec me time return krta hai or har baar jab aap program run 
    kroge to almost ek alag no. ayega*/
    number = rand()%100 + 1;//generate random no. between 1 and 100
  //  printf("the no is %d",number);
    do//kam se kam ek baar program ko chalana hi tha
    {
        printf("GUESS THE NUMBER BETWEEN 1 TO 100\n");
        scanf("%d",&guess);
        if(guess>number){
            printf("LOWER NUMBER PLEASE\n");
        }
        else if(guess<number){
            printf("HIGHER NUMBER PLEASE\n");
        }
        else{
            printf("YOU GUESSES %d ATTEMPTS\n",nguesses);
            
        }

nguesses++;

    } while (guess!=number);
    
    return 0;
}