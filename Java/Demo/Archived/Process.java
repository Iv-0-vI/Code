package Demo.Archived;

import java.util.Scanner;
//要精通 switch while if else 顺序控制语句
public class Process {
    public static void main(String[] args) {
        System.out.println("过程 开始 暂停 终止");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (true) {
            if (s.equals("过程")) {
                System.out.println("1个过程");
                break;
            }
            if (s.equals("暂停")) {
                System.out.println("1个暂停");
                break;
            }
            if (s.equals("终止")) {
                System.out.println("1个终止");
                break;
            }
            if (s.equals("开始")) {
                System.out.println("1个开始");
                break;
            }
        }

    }
}
