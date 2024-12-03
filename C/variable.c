#include <stdio.h>;
int main()
{
    int a = 1;
    float price = 22.22;
    double cost = 12.13;
    char b = 'b';
    printf(a, price, cost, b);
    printf("a: %d, price: %.2f, cost: %.2f, b: %c\n", a, price, cost, b); // a: 1, price: 22.22, cost: 12.13, b: b
    return 0;
}