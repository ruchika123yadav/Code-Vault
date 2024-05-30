#include<stdio.h>
  int  wswap(int a ,int b);
    int swap(int *a, int *b);

int main(){
    int a=2, b=5;
    printf("before swapping the value %d and %d\n",a,b);
   // wswap( a , b);
   // printf("after swapping the value of a and b is %d and %d",a,b);
    swap(&a,&b);  
    printf("after swapping the value of a and b is %d and %d\n",a,b);
    return 0;
}
/*int wswap(int a ,int b) {
    int c;
    c=a;
    a=b;
    b=c;}*/
    int swap(int *a ,int *b) {
    int c=8;
    c=*a;
    *a=*b;
    *b=c;
    }
