#include <stdio.h>
#include <stdlib.h>

// 定义电梯结构体
typedef struct {
    int currentFloor;  // 当前楼层
    int targetFloor;   // 目标楼层
} Elevator;

// 初始化电梯
void initElevator(Elevator *elevator) {
    elevator->currentFloor = 1;
    elevator->targetFloor = 1;
}

// 电梯上升操作
void moveUp(Elevator *elevator) {
    if (elevator->currentFloor < elevator->targetFloor) {
        elevator->currentFloor++;
        printf("电梯上升到了 %d 层\n", elevator->currentFloor);
    }
}

// 电梯下降操作
void moveDown(Elevator *elevator) {
    if (elevator->currentFloor > elevator->targetFloor) {
        elevator->currentFloor--;
        printf("电梯下降到了 %d 层\n", elevator->currentFloor);
    }
}

// 设置目标楼层
void setTargetFloor(Elevator *elevator, int floor) {
    elevator->targetFloor = floor;
    printf("目标楼层设置为 %d 层\n", floor);
}

int main() {
    Elevator elevator;
    initElevator(&elevator);

    int choice, target;
    while (1) {
        printf("1. 设置目标楼层\n");
        printf("2. 上升\n");
        printf("3. 下降\n");
        printf("4. 退出\n");
        printf("请输入你的选择: ");
        scanf("%d", &choice);

        switch (choice) {
        case 1:
            printf("请输入目标楼层: ");
            scanf("%d", &target);
            setTargetFloor(&elevator, target);
            break;
        case 2:
            moveUp(&elevator);
            break;
        case 3:
            moveDown(&elevator);
            break;
        case 4:
            printf("退出程序\n");
            exit(0);
        default:
            printf("无效的选择，请重新输入\n");
        }
    }

    return 0;
}
