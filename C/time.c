//not me
#include <stdio.h>
#include <time.h>

int main() {
    time_t now;
    struct tm *local_time;
    // 获取当前时间
    time(&now);//地址
    // 将Unix时间戳转换为本地时间
    local_time = localtime(&now);

    // 打印本地时间
    printf("Local time is: %d-%d-%d %d:%d:%d\n",
           local_time->tm_year + 1900, local_time->tm_mon + 1, local_time->tm_mday,
           local_time->tm_hour, local_time->tm_min, local_time->tm_sec);

    return 0;
}