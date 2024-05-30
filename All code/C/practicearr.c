#include<stdio.h>

int main(){
    int array[10];
    int *ptr;
    ptr=&array[0];
    for(int i=0;i<10;i++)
    printf("enter the marks of the sunbjects %d\n",i+1);
    scanf("%d",ptr);
    ptr= ptr +2;
    return 0;
}
 for(int i=0;i<10;i++)
    printf(" the marks of the sunbjects is %d\n");
    scanf("%d",ptr);