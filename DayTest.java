import java.util.Scanner;
public class DayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//0 Sunday
        int num = scanner.nextInt();
        Day day = Day.FRIDAY;
        if (num==0) {
            System.out.println("今天是"+Day.SUNDAY);
            day = Day.SUNDAY;
        }else if(num==1){
            System.out.println("今天是"+Day.MONDAY);
            day = Day.MONDAY;
        }else if(num==2){
            System.out.println("今天是"+Day.TUESDAY);
            day = Day.TUESDAY;
        }else if(num==3){
            System.out.println("今天是"+Day.WEDNESDAY);
            day = Day.WEDNESDAY;
        }else if(num==4){
            System.out.println("今天是"+Day.THURSDAY);
            day = Day.THURSDAY;
        }else if(num==5){
            System.out.println("今天是"+Day.FRIDAY);
            day = Day.FRIDAY;
        }else if(num==6){
            System.out.println("今天是"+Day.SATURDAY);
            day = Day.SATURDAY;
        }
        // System.out.println("测试 "+Day.FRIDAY);
        //游戏入口
        System.out.println("什么时候工作呢?");
        switch (day) {
            case SUNDAY:
                System.out.println("还可以理解");
                break;
            case MONDAY:
                System.out.println("达摩克里斯之剑");
                break;
            case TUESDAY:
                System.out.println("君子之道, 可知天命");
                break;
            case WEDNESDAY:
                System.out.println("ah~~~");
                break;
            case THURSDAY:
                System.out.println("嗯呃呃");
                break;
            case FRIDAY:
                System.out.println("我一定能成为我想成为的人");
                break;
            case SATURDAY:
                System.out.println("钓了这么多鱼终于下班了");
                break;
            default:
                System.out.println("ehh haha工作完毕");
                break;
        }
        //今天星期几

        if (day == Day.FRIDAY) {
            System.out.println("success");
        }
    }
}
