//check a no. is divisible by 97 or not
#include<stdio.h>

int main(){
    int num;
    printf("enter a no. which you want to check\n");
    scanf("%d,&num");
    printf("divisibility test return %d\n",num%97);
    return 0;
}