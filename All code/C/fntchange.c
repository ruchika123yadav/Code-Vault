#include<stdio.h>
    void change(int a);

int main(){
    int b = 23;
    printf("before changing the value of b is%d\n",b);
    change(b);
    printf("after the chnaging of value of b is %d\n",b);
    return 0;
}
void change(int a) {
    int b;
b = 77;
}