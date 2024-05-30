#include<stdio.h>

int main(){
    /*FILE *ptr;
    int num =45;
     ptr = fopen("ruch.txt", "w");
    fprintf(ptr," the number is %d\n",num);
    fprintf(ptr,"thanks for using fprintf");
fclose(ptr);*/

FILE *ptr;
// ptr = fopen("ruchi.txt", "r");
// printf("the value of my character is %c\n",fgetc(ptr));  //fgetc hamre sentence ko character by character ko read krne me kaam ata hai 
// printf("the value of my character is %c\n",fgetc(ptr));
// printf("the value of my character is %c\n",fgetc(ptr));
// printf("the value of my character is %c\n",fgetc(ptr));
// printf("the value of my character is %c\n",fgetc(ptr));



 ptr = fopen("ruc.txt", "w");
 putc('c',ptr);
 putc('c',ptr);
 putc('c',ptr);
 fclose(ptr);

    return 0;
}
