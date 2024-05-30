#include<stdio.h>
#include<string.h>
    struct employee {
        int code;
        float salary ;
        char name[10]; 
    };

int main(){
    /* struct employee e1,e2,e3;
     printf("eneter the value of employe 1 :");
     scanf("%d",e1.code);*/
     //struct employee facebook[100];  // yha seeda seeda mtlb ye hai ki me yha  baar baar e1 e2 na likhe seehe ek array bana du or usme valur store krte jaoo
    /* facebook[0].code  =100;
     facebook[0].salary =34.32;
     strcpy(facebook[0].name,"ruchi") ;



      facebook[1].code = 200;
     facebook[1].salary = 234.2;
     strcpy(facebook[1].name,"yi");


      facebook[2].code = 300;
     facebook[2].salary = 24.3;
     strcpy(facebook[2].name,"bnc");*/

/*struct employee ruchi ={100,34.32,"ruchi"};
printf("code:%d\n",ruchi.code);
printf("salary:%f\n",ruchi.salary);
printf("name:%s\n",ruchi.name);*/



struct employee e1;
struct employee *ptr;
ptr= &e1;
//(*ptr).code= 101;  
ptr->code=101;  // yha pointer ki use krke bhi krr skte haiii
printf("cod=%d",e1.code);
    return 0;
}