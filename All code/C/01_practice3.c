/*to find out whetehr a student is pass or fail ,if it require total 40% and 33% in each subject to pass 
.Assume 3 subjects and take marks as an input from the user*/
#include<stdio.h>

int main(){
    int physics,chemistry,maths,total;
    printf("enter the marks of physics, chemistry and maths");
    scanf("%d%d%d",&physics,&chemistry,&maths);
    total=(physics+chemistry+maths)/3;
    if (total<40|| physics<33|| chemistry<33|| maths<33/* condition */)
    {printf("your percentage is %f sorry you are fail");
    }
    else{
    printf("your percentage is %f you are pass🙌");
    }
    return 0;
}