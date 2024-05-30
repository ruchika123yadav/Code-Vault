#include<stdio.h>
    int fibonacci(int n);

int main(){
    int n,i,series;
    printf("enter the number to generate series");
    scanf("%d",&n);
    for(i = 0;i<n;i++);
    series = fibonacci(i);
    printf("series\t",series);  
    return 0;
}
 int fibonacci(int i) {  5
    int n;
     if (n==0)
     {
         return 0;
     }
     else if (n==1)

    
     {
       return 1;
     }
     else
     {
        return fibonacci(n-1) + fibonacci(n-2);
     }
     
 }

 