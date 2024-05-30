#include<stdio.h>
    float force(float mass);

int main(){
    float m;
    printf("enter the value of mass\n");
    scanf("%f",&m);
    printf("the mass is %.2f\n",force(m));          //.o ishliye lagaya ki exact value aye uskiii

    return 0;
}
float force(float mass) {
    float result;
    result = mass * 9.8;
    return result;
}