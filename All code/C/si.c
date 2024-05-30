#include<stdio.h>

int main(){
   int principal,rate,year; 
   printf("enter the value of principal rate and year\n");
   scanf("%d%d%d",&principal,&rate,&year);
   float si=(principal*rate*year)/100;
   printf("\nthe value of simple interst is %f",si);
    return 0;
}