#include<stdio.h>
#include<string.h>
    struct employee{
        int code;
        float salary ;
        char name[10]; 
    };
   /* int main()
    {
        int a=34;
        float b=33.3;
        char c="f";
        //agr me yha employee e1 krta to wo kaam nhi rkta uske liye mujhe strut define krna padta
    }*/
int main(){
   struct employee e1;
    e1.code=100;        //. ka mtlb hota hai member operator,,iska mtlb employee e1 ka jo code hai usse set krdo 100
    e1.salary=454.63;
    strcpy(e1.name,"harry");   //e1.name=harry kaam nhi krega kyuli wo ek string hai string ese kaam nhi krtii
//int no=100;
//float sa= 454.3;
//char str[]="ruchi";
printf("code=%d\n",e1.code);
printf("salary=%f\n",e1.salary);   //agr . ke baad 3 value tak dekhna hai to %.3f krdo
printf("name=%s",e1.name);




    return 0;
}