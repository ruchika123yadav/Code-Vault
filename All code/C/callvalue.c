#include<stdio.h>
    int sum(int a, int b);

int main(){
    int a = 3, b=4;
    printf("before calling the function %d\n",a,b);
    printf("the value of sum of a and b is %d",sum(a,b));

    return 0;
}
 int sum(int a, int b) {
 int sum;
 sum = a + b ;
 a=2,b=3;
    return sum;
 }