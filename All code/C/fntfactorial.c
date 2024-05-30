#include<stdio.h>
    int factorial(int a);

int main(){
    int a;
    printf("enetr the the value of a");
    scanf("%d",&a);
     
    printf("the value of factorial is %d",factorial( a));
    return 0;
}
 int factorial(int a) {
     printf("calling factorial %d\n",a);
     if (a==1 || a==0) {
         return 1;
     }
else {
    return a*factorial(a-1);
}
 }