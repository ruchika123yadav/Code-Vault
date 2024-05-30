#include<stdio.h>
#include<string.h>
struct employee {
        int code;
        float salary ;
        char name[20]; 
    };
    void show(struct employee e1){
        printf("code=%d\n",e1.code);
        printf("salary=%f\n",e1.salary);   //agr . ke baad 3 value tak dekhna hai to %.3f krdo
        printf("name=%s",e1.name);


    }
int main(){
    struct employee e1;
    e1.code=100;        //. ka mtlb hota hai member operator,,iska mtlb employee e1 ka jo code hai usse set krdo 100
    e1.salary=454.63;
    strcpy(e1.name,"harry");
    show(e1);



    return 0;
}