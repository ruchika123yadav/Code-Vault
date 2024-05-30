#include<stdio.h>
    struct vector{
        int x;
        int y;
    };
  struct vector sumvector( struct vector v,struct vector v2 ){
 struct vector result;
        result.x= v.x + v2.x;
        result.y = v.y + v2.y;
        return result;
  }

int main(){

    struct vector v,v2,sum;
    v.x=34;
    v.y=45;
    printf("the value of vector 1 are %d and %d\n",v.x,v.y);


     v2.x=56;
    v2.y=65;
    printf("the value of vector 2 are %d and %d\n",v2.x,v2.y);


    sum = sumvector(v,v2);
    printf("x vector value is %d and y vector value is %d", sum.x,sum.y);
    return 0;
}