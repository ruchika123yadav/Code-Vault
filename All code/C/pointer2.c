#include<stdio.h>
#include<stdlib.h>


int main(){
int n,*p ,i,j, temp;
printf("\n HOW MAY NUMBERS");
scanf("%d",&n);
p= (int*)malloc(n*2);
if(p==NULL)   
{
    printf("\nMEMORY ALLOCATION UNSUCCESFUL");
}
for(i=0;i<n;i++)
{
    printf("\n ENTER NUMBER %d",i+1);
    scanf("%d",p+i);
}
for(i=0;i<n;i++){
    for(j=0;j<n;j++)
    {
        if((p+i)<(p+j))
        {
            temp=*(p+i);
            *(p+i)=*(p+j);
            *(p+j)=temp;
        }
    }
}
printf("\nTHE SORTED NUMBER ARE:\n");
for(i=0;i<n;i++){
    printf("%d\t",*(p+i));
}
    return 0;
}