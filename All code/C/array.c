#include<stdio.h>

int main(){
    int marks[5],i;
    int *ptr;
    ptr= &marks[0];  // yha pe me marks bhi likh skta tha khali to bhi chla jata  


    for(i =0; i <5; i++)
    {
        printf("enter the value of marks for student %d\n",i+1);
        scanf("%d",ptr);
    ptr++;
    }
     for(int i =0; i <5; i++)
      {
        printf("The value of marks for students %d is %d\n",i+1,marks[i]);
    }
    return 0;
}
