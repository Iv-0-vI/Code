#include <stdio.h>
int main(){
    const MAX_VALUE = 1000;
    if (MAX_VALUE<=1000)
    {
        printf("max<=1000");
    }else if (MAX_VALUE<2000)
    {
        printf("max>2000,max<3000");
    }else{
        printf("max溢出3000!!!");
    }
    return 0;
}