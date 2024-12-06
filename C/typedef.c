#include <stdio.h>

// 定义一个结构体 别名
typedef struct {
    char name[20];
    int age;
} Person;

int main() {
    Person p;
    strcpy(p.name, "张三");
    p.age = 20;
    printf("姓名: %s, 年龄: %d\n", p.name, p.age);
    return 0;
}
