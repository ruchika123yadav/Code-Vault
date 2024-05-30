#include<stdio.h>

int main(){
    //FILE *ptr;
    //int a,b,c;
    // ptr = fopen("prac.txt", "r"); 
    // fscanf(ptr ,"%d %d %d",&a,&b,&c);
    // printf("the value of a is %d\n",a);
    //    printf("the value of b is %d\n",b);
    //       printf("the value of c is %d\n",c);  



       // FILE *ptr;
       // int n;
       // printf("enter the number which you want to see the table");
       // scanf("%d",&n);
       // ptr = fopen("table.txt","w");
       // for(int i=0;i<10;i++){
       //     fprintf(ptr , "the table is %d*%d=%d\n",n,i+1,n*(i+1));
       // }
       // fclose(ptr);
       // printf("succesfully generated table of %d",n);


        FILE *ptr1;
        FILE *ptr2;
        char c;
        ptr1 = fopen("a.txt", "r");
        ptr2 = fopen("b.txt", "w");
        c =  fgetc(ptr1);
        while(c=! EOF){
            fputc(c,ptr2);
             fputc(c,ptr2);
              c =  fgetc(ptr1);

        }
        fclose(ptr1);
        fclose(ptr2);
    return 0;
}