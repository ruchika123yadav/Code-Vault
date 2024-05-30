#include <stdio.h>




int main()
{
int a,b,add,sub;
float c,d,sum,minus;
printf("enter the two no.which you want to add or subtract");
scanf("%d%d/t",&a,&b);	
    add=(a+b);
    sub=(a-b);
    printf("addition and subtraction is %d%d/t",add,sub);
    printf("enter the two no, which you want to sum or minus");
    scanf("%f%f/t",&c,&d);
    sum=(c+d);
    minus=(c-d);
    printf("summation and minus is %f%f/t",sum,minus);
    return 0;
}
