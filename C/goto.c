#include <stdio.h>
int main()
{
    int age = 0;
    int i = 0;
    goto a;
a:
    do
    {
        printf(age);//0 1 2 3 4
        i++;
    }
    while (i < 5);
    
}