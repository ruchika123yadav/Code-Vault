#include<stdio.h>

int main(){
    int i=1,n,factorial=1;
    printf("eneter the no. which you want to know the factorial");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
    factorial= factorial*i;
    }
    printf("the factorial is %d",factorial);
    
    return 0;
}