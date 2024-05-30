#include<stdio.h>
//checking of a prime no.
int main(){
    //prime no is a no. which is divided by 1,0 and itsown no.
    int n,i;
    printf("enter the no.");
    scanf("%d",&n);
    for(i=2;i<=n;i++){
        if (n%i==0 && n!=2){
            printf("this is not a prime no.");
            break;
        }
    
        else{
            printf("this is a prime no.");
            break;
        }
    
    }
    return 0;
}