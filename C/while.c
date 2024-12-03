#include <stdio.h>
int main(){
    int i=0;
    while (i<5)
    {
        printf("i:%d",i);//i:0i:1i:2i:3i:4
        i++;
    }
    do {
        printf("%d ", i++);
    } while (i < 5);
    printf("\n");
    
    return 0;
}