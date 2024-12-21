package MiniProgram;

public class ElevatorDoing {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(21, 11);
        if (elevator.now_floor<elevator.target_floor) {
            elevator.isRunning=true;
            elevator.move_up();
            elevator.isRunning=false;
        }else if (elevator.now_floor>elevator.target_floor) {
            elevator.isRunning=true;
            elevator.move_down();
            elevator.isRunning=false;
        }else{
            System.out.println("Sorry Oops");
        }
    }
}
class Elevator{
    public int now_floor;
    public int target_floor;
    public boolean isRunning;
    Elevator(int now_floor,int target_floor){
        System.out.println("电梯已就位");
        System.out.println("当前在"+now_floor+"楼");
        this.target_floor=target_floor;

    }
    public void move_up(){
        if (this.now_floor==this.target_floor) {
            return;
        }
        for (int i = this.now_floor; i <= this.target_floor; i++) {
            System.out.println("上升中，当前楼层：" + (i + 1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("已到达"+this.target_floor+"楼");
    }
    public void move_down(){
        if (this.now_floor==this.target_floor) {
            return;
        }
        for (int i = this.now_floor; i >= this.target_floor; i--) {
            System.out.println("下降中，当前楼层：" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("已到达"+this.target_floor+"楼");
    }
}
