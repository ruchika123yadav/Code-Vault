#include<stdio.h>
int sum(a,b);
int main(){
    int a,b,c;
    printf(" enter the value of a nad b");
    scanf("%d%d",&a,&b);
   c = sum(a,b);
    printf("sum=%d",c);           /*ishem jo diye jate hai wo argumnets hote hai or joisme value dali jati hai wo parameters*/
    return 0;
}
int sum(a,b) {
    int summation;           //agr mene yha pe sam evariable declare krr diya jo upr kar rakha hai uska yha koi mtlb nhi hai wo alg hai ye alg hai
    
    summation = a+b;
    return summation;
}