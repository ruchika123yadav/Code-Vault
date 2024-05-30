#include<stdio.h>
int fab(int n){

}
int main(){
    int i,n;
    printf("enter the number ");
    scanf("%d",&n);

    for(i=0;i<n;i++){
        printf("%d\t",fab(n));
    }
    return 0;
}
 int fab(int n){

    if(n==1){
        return 0;
    }
    if(n==2){
        return 1;
    }
    return fab(n-1) + fab(n-2);
}