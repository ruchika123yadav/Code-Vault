#include<stdio.h>
int pass(int a);


int main(){
    /*int a=2;   //agr yhi b ko define krna hota to *b se define hota
    int *b =&a;
    printf("the address of a is %u\n",&b);
     printf("the value of a is %d\n",*b);
      printf("the address of a is %d\n",&b);
       printf("the address of a is %u\n",*b);
    return 0;
}*/
// next question
int i =5;

//printf("the address of a is %u\n",&j);
//printf("the value of a is %d\n",*j);
pass( i);
printf("the value of address i is%u\n",&i);
return 0;
}     // iska seeda seeda mtlb hai ki mene yha i ko pass karya lekin or yha jo main me value di hai wo to main me hi rhegi or wo value a me copy ho jayegi lekin agr address ki baat kre to adress to undono ka alg alg hoga na jha in dono ki value store hui hai to mtlb ye ki value to same rhti hai lekin address alg alg rhata hai
int pass(int a) {
    printf("the value of adress a is %u",&a);
}






