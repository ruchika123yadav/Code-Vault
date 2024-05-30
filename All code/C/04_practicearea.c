#include<stdio.h>

int main(){
     int radius;
    float area,pi=3.14;
    printf("enter the value of the radius");
    scanf("%d",&radius);
    area=(radius*radius*pi);
    printf("area of the circleis %f",area); 
    return 0;
}