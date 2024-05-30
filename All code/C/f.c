#include<stdio.h>
float convert(int c){
   int f;
   f= (c*1.8) + 32;
   return f;
}
int main(){
int a;
printf("enter the value");
scanf("%d",&a);
printf("f=%f",convert(a));
}


//  /*  int n,i,factorial=1;
//    printf("enter the vlaue of n");
//    scanf("%d",&n);
//    for(i=1;i<=n;i++){
//        factorial=factorial*i;
//    }
//    printf("factorial=%d",factorial);*/

    
// void wrong_swap(int a, int b);
// void swap(int *a, int *b);

// int main(){
//     int a=3, b=4;
//     printf("The value of x and y before swap is %d and %d\n", a, b);
//     //wrong_swap(x, y); // will not work due to call by value
//     wrong_swap(a,b);
//     printf("The value of x and y after wrong swap is %d and %d\n", a, b);



//     swap(&a, &b); // will work due to call by reference
//     printf("The value of x and y after swap is %d and %d\n", a, b);

//     return 0;
// }

// void wrong_swap(int a, int b){
//     int temp;
//     temp = a;
//     a = b;
//     b = temp;
// }

// void swap(int *a, int *b){
//     int temp;
//     temp = *a;
//     *a = *b;
//     *b = temp;
// }

