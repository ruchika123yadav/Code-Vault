#include <stdio.h>


int main() {
int a[1000];
int n,i,sum=0;
 
    scanf("%d",&n);
    printf("\n");
    for(i=0;i<n;i++){
        scanf("%d\t",&a[i ]);
    }
    for(i=0;i<n;i++)
    {
        sum = sum + a[i];
    }
        printf("%d",sum);
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}