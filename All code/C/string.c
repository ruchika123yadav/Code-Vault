#include<stdio.h>
#include<string.h>

int main(){
   /* char str[]= "RUCHIKA";
    char *ptr = str;
    while(*ptr!='\0'){
        printf("%c",*ptr);
        ptr++;
    }
    
   /* int main(){
    char name[8];  // or me yha *ptr or ptr[] bhi likh skta hu name[8] ki jagah
    printf("eneter your full name\n");
    scanf("%s",name);
    printf(" your name is %s",name);*/
    



   /* int main(){
    char s[34];
    printf("enter the your name\t");
    gets(s);   //ishme nahi % or nahi& use hota hai bss naam likhna hai
    puts(s);*/
    //printf(" your name is%s ",s);
        
   /* int main(){
        char s[35]="ruchika ";
        int a = strlen(s);
        printf(" the lenght of the string is %d",a);*/



/*char s[15]="this";
char s2[24];
strcpy(s2 , s);
printf(" the value of s2 is %s",s2);*/

char s[15]="ruchika";
char s2[24]= "yadav";
strcat(s , s2);  // ab yha jo concatenate higa wo one mae jayega
printf(" the value of s2 is %s",s);
    return 0;




    return 0;
}