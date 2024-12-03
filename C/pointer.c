//wrong
#include <stdio.h>;
int main(){
    int* a = 10;
    printf(a);
    printf(*a);
    return 0;
}

#include <stdio.h>

int main() {
    int value = 10;
    int* a = &value; //地址
    printf("%p\n", a);//0x7ffeedfffff8
    printf("%d\n", *a);//10
    return 0;
}