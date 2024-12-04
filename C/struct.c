#include <stdio.h>
struct Employee{
    int age;
    int code;
};
int main(){
struct Employee e={2333,12333333};
printf("age:%d  code:%d",e.age,e.code);//age: 2333 code: 12333333
return 0;
}