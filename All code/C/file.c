#include<stdio.h>
// character by charater ham apni sample file ko read krr ste hai lekin wo hamari txt file honi chahiye
//kisi bhi file ke ant me content ko jondne ko apend khte hai
int main(){
    FILE *ptr;   // yha ham file or null ko captial words me hi likhenge
    int num[20];
    int num2[12];
     int num3[12];
    ptr = fopen("ruch.txt", "r"); 
    if (ptr == NULL){
        printf(" This file does not exist");
    }
    else{
     //for reading the file
    fscanf(ptr, "%s",num);
    fscanf(ptr, "%s",num2);
    fscanf(ptr, "%s",num3);
    printf(" the valueof num is %s\n",num);      // yha me integer or character dono ko hi print ya read krwa skta hu
     printf(" the valueof num is %s\n",num2);
      printf(" the valueof num is %s\n",num3);
     
    }
   // ptr = fopen("sample.txt", "w");    //for writing to a file 
    return 0;
}




//htow rufpwoe rut wks fhf