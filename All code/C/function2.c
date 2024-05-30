#include<stdio.h>
void display();                      // function prototype

int main(){
    printf("this is display\n");
display();                           //function call
printf("display\n");
return 0;
}
void display(){                    //function body
    printf("HI I AM DISPLAY\n") ;   
    return 0;
}