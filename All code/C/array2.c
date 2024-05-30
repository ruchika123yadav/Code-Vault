#include<stdio.h>

int main(){
    int students =3;
    int subjects =5;
    int marks[3][5];
    for(int i=0;i<students;i++){
    for(int j=0;j<subjects;j++){
    printf("enetr the marks of the student %d in subject %d:",i+1,j+1);
    scanf("%d",&marks[i][j]);
    }
}
for(int i=0;i<students;i++){
    for(int j=0;j<subjects;j++){
    printf("the marks of the student %d in subject %d is: %d",i+1,j+1,marks[i][j]);
    }

}

        return 0;
}