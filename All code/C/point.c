#include<stdio.h>
 int change(int *a);
    main(){
    int a=4;
      change(&a);
      printf(" the value of a is after changing is %d",a);
    return 0;
}
 int change(int *a) {
    
    *a *=10;
 }
// void sumandavg( int a, int b,int *sum, float *avg);
//
// main(){
// int a=5, b=2;
// int sum;
// float avg;
// sumandavg(  a,  b, &sum, &avg);
// printf("the sum  is %d\n ",sum);
//  printf("the sum  is %d\n ",avg);
//urn 0;
//
//id sumandavg( int a, int b,int *sum, float *avg) {
//
// tats why are he he heh eh eh eh ehe heh
//sum = a + b;
//
// *avg =*sum/2;
//
 