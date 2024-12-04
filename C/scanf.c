#include <stdio.h>

int main() {
    char text[100];
    printf("请输入一个文本：");
    scanf("%99s", text);
    printf("你输入的文本是：%s\n", text); // 打印输入的文本
    return 0;
}