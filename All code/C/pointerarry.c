#include<stdio.h>
void printarray(int *ptr, int n){
    for (int i=0;i<7;i++)
    {
        printf("the value of element %d is %d\n",i+1,*(ptr+i));
    }
ptr[2]= 5454;  // this value will be changes in arr array as well
}
int main(){
    int arr[] = {24,3,5,3,5,17};
    printarray(arr,7);   // yha ham 7 size ko pass kra rhe hai wrna loop kab tak chlat arhe kuch pata nhi hoga
    printf("%d",arr[2]);
    return 0;
}