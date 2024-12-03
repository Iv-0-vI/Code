#include <stdio.h>
int main()
{
    int expression = 100;
    switch (expression)
    {
    case 50:
        printf("50 if fine");
        break;
    case 100:
        printf("100 if excellent");
        break;
    default:
        printf("null if 啊");
        break;
    }
    char grade = 'B';
    switch (grade)
    {
    case 'A':
        printf("Excellent\n");
        break;
    case 'B':
        printf("我是B yeah~~\n");
        break;
    case 'C':
        printf("Good\n");
        break;
    default:
        printf("Not Graded\n");
        break;
    }
    return 0;
}
/*
100 if excellent
我是B yeah~~
*/