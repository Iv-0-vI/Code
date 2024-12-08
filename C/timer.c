#include <stdio.h>
#include <Windows.h>
int main(){
    int max= 100;
    for(int i=0;i<max;i++){
        printf("第%d秒",i);
        Sleep(1000);
    }
    return 0;
}