#include <stdio.h>
int main(){
    double pi= 3.1415926;
    int* num = 31415926;
    scanf("%d", num); // 应该使用%d，并且不需要&操作符，因为num本身就是一个指针
    printf("%d", *num); // 应该使用%d来打印num指向的整数值，而不是打印指针本身
    return 0;
}