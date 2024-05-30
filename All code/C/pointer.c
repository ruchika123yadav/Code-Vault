#include<stdio.h>

int main(){
    int a[5]={1,2,3,4,5};
    int*p;
    p=a;
    printf("printing the array elements using pointers\n");
   
    for(int i=0;i<5;i++)
    {
        printf("\n%d",*p);
        p++;
    }
    return 0;
}
  p