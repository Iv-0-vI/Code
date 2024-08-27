package Demo;

import java.util.Scanner;

public class StringRemove {
    public static void main(String[] args) {
        String string = "Hello WorldHello WorldHello WorldHello WorldHello World";
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("请输入数字范围" + "0-" + (string.length() - 1));
                int nextInt = scanner.nextInt();
                if (nextInt > string.length() - 1 || nextInt < 0) {
                    System.out.println("请重新输入");
                } else {
                    System.out.println("删除后的字符串为" + removeCharAt(string, nextInt));
                    break;
                }
            }

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("删除字符超过范围");
        } finally {
            System.out.println("这是一个finally块");
            scanner.close();
        }
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

}