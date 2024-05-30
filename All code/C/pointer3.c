#include<stdio.h>

int main(){
    char i=34;
    char *j = &i;              //ishme jo *j hai wo value of i print karega lein agr usse asihe likho to wo address store krr rha hai
  //  printf("the value of i is %d\n",i);
    printf("the value of i is %d\n",*j);
    printf("the address of i is %u\n",j);
   // printf("the address of i is %u\n",&i);
    // printf("the address of j is %u\n",j);
   //   printf("the address of i is %u\n",*j);
     //  printf("the value of j is %u\n",*(&j));
     j= j+1;
         j= j+1;
             j= j+1;
      printf("the address of i is %u\n",j);
    return 0;
}