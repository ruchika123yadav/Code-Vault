#include<stdio.h>
int rev(int arr);
int main(){
    int arr[5] ;
    
    printf(" the reverse of the no. are %d",rev(arr[5]));
    
    return 0;
}
int rev(int arr){
    for(int i=5;i>0;i--);
    printf("%d",arr[i]);
}