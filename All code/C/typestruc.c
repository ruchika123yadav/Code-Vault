#include<stdio.h>
    #include<string.h>
  typedef struct employee {
        int code;
        char name[20]; 
        float salary ;
} emp;   // yha prr me emp ki jagah kuch bhi de skta tha mtlb koi bhi alphabet bss uuse ye hota ki wo alphabet likha padta emp ki jagah
int main(){

    emp e1;    // mujhe baar baar struct employee likhna pad rha tha lekin ab jo mera strut eployee datatype tha wo emp data type me change ho gya or ha me yha strut employee bhi likh skta  hu
    emp *ptr;
    ptr = &e1;
    ptr->code=101;
     e1.salary=454.63;
    strcpy(e1.name,"harry");

    printf("code=%d\n",e1.code);
printf("salary=%f\n",e1.salary);   //agr . ke baad 3 value tak dekhna hai to %.3f krdo
printf("name=%s",e1.name);

    return 0;
}