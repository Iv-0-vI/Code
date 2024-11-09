package Project.douyin;

import java.util.Scanner;

public class ButtonTest {
    public static void main(String[] args) {
        System.out.println("过程 开始 暂停 终止");
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        while (true) {
            if (string == "过程") {
                System.out.println("过程");
            }
            if (string == "暂停") {
                System.out.println("过程");
            }
            if (string == "终止") {
                System.out.println("过程");
            }
            if (string == "开始") {
                System.out.println("过程");
            }
        }

    }
}

abstract class Button {
    private String title;
    private int number;
    private int image;
}

class title_Button extends Button{
    this.title = "null";
}

class number_Button extends Button{
    this.number = "null";
}

class image_Button extends Button{
    this.image = "null";
}
