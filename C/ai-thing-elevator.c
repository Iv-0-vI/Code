#include <stdio.h>
#include <stdbool.h>

#define MAX_FLOORS 10

// 电梯状态
typedef struct {
    int currentFloor; // 当前楼层
    bool isMoving;    // 是否在移动
    bool isDoorOpen;  // 门是否打开
} Elevator;

// 初始化电梯
void initElevator(Elevator *elevator) {
    elevator->currentFloor = 1; // 假设电梯从1楼开始
    elevator->isMoving = false;
    elevator->isDoorOpen = false;
}

// 打开电梯门
void openDoor(Elevator *elevator) {
    if (!elevator->isMoving) {
        elevator->isDoorOpen = true;
        printf("Door opened at floor %d.\n", elevator->currentFloor);
    } else {
        printf("Cannot open door while elevator is moving.\n");
    }
}

// 关闭电梯门
void closeDoor(Elevator *elevator) {
    if (!elevator->isMoving && elevator->isDoorOpen) {
        elevator->isDoorOpen = false;
        printf("Door closed.\n");
    } else {
        printf("Door is already closed or elevator is moving.\n");
    }
}

// 移动电梯
void moveElevator(Elevator *elevator, int direction) {
    if (!elevator->isDoorOpen) {
        if (direction > 0) { // 上升
            if (elevator->currentFloor < MAX_FLOORS) {
                elevator->currentFloor++;
                printf("Elevator moving up to floor %d.\n", elevator->currentFloor);
            }
        } else if (direction < 0) { // 下降
            if (elevator->currentFloor > 1) {
                elevator->currentFloor--;
                printf("Elevator moving down to floor %d.\n", elevator->currentFloor);
            }
        }
        elevator->isMoving = true;
        // 模拟电梯移动需要时间，可以在这里添加延迟
        elevator->isMoving = false;
    } else {
        printf("Cannot move while door is open.\n");
    }
}

int main() {
    Elevator myElevator;
    initElevator(&myElevator);

    int command;
    do {
        printf("Enter command (1: Open Door, 2: Close Door, 3: Move Up, 4: Move Down, 5: Exit): ");
        scanf("%d", &command);

        switch (command) {
            case 1:
                openDoor(&myElevator);
                break;
            case 2:
                closeDoor(&myElevator);
                break;
            case 3:
                moveElevator(&myElevator, 1);
                break;
            case 4:
                moveElevator(&myElevator, -1);
                break;
            case 5:
                printf("Exiting program.\n");
                break;
            default:
                printf("Invalid command.\n");
        }
    } while (command != 5);

    return 0;
}