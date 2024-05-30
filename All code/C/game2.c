// my second game yooo ruchi know you will at that level to make the games like PUBG,VICE CITY etc😁😁😎😎
#include<stdio.h>
#include<stdlib.h>//ye hame chahiye hoti hai jab ham koi random no, generate krr rhe ho
#include<time.h>
//return 1 if you win ,-1 if you loose, 0 for tie
 int   snakewatergun(char you, char comp){
    if(you==comp){
        return 0;
    }
    if(you=='s' && comp=='g'){
        return -1;
    }
  if(you=='s' && comp=='w'){
        return 1;
    }  
   if(you=='w' && comp=='g'){
        return 1;
    } 
    if(you=='w' && comp=='s'){
        return -1;
    }
    if(you=='g' && comp=='s'){
        return 1;
    }
    if(you=='g' && comp=='w'){
        return -1;
    }
    
 }

int main(){
    char you, comp,number;
     srand(time(0));
      number = rand()%100 + 1;
      if(number<33){
        comp = 's';
      }
       else  if(number>33 && number<66){
        comp = 'w';
      }
      else{
        comp = 'g';
      }
    printf("enter 's' for snake, 'w' for water, 'g' for gun");
    scanf("%c",&you);
    int result = snakewatergun(you,comp);
    if(result==0){
    printf("game draw\n");}
    if(result==1){
    printf("you win\n");}
    if(result==-1){
    printf("you loose\n");}
    printf("you choose %c and computer choose %c",you,comp);
    return 0;
}