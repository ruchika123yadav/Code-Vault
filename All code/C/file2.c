#include<stdio.h>

int main(){
    FILE *ptr;
    char c;
    ptr= fopen("ruch.txt","r");
    c = fgetc(ptr);
    while(c!=EOF){     //EOF is end of file jaha pr hamri file end ho jati hai
        printf("%c",c);
        c =  fgetc(ptr);
    }
    return 0;                   
}