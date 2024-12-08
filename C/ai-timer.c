#include <stdio.h>
#include <windows.h>
int main() {
    int n;
    printf("请输入要打印的秒数n: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        printf("已经过了 %d 秒\n", i + 1);
        Sleep(1000);  // 暂停1000毫秒，即1秒
    }
    return 0;
}
