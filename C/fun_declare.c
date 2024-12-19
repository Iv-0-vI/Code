#include <stdio.h>
#define PI 3.1415923

int add(int* a, int* b);

int main() {
    int x = 1;
    int y = 2;
    int c = add(&x, &y);
    printf("%d\n", c);
    return 0;
}

int add(int* a, int* b) {
    int c = *a + *b;
    return c;
}