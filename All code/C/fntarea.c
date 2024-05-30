#include<stdio.h>
#include<math.h>
int main(){
    int side;
    printf("enetr the value of side");
    scanf("%d",&side);
    printf("the area of the square is %f",pow(side,2));        //yha pow ek double keyword me ata hai ishliye %f specifier lagana padega
    return 0;
}