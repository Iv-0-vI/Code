import java.util.random.*;

public class ArrayTest {
    public static void main(String[] args) {
        String[] java = { "J", "a", "v", "a" };
        String stringJava = "Java";
        for (int i = 0; i < stringJava.length(); i++) {
            System.out.print(stringJava.charAt(i) + "\t");
            char c = stringJava.charAt(i);
            if (c == 'a') {
                System.out.println(true);
            } else {

                System.out.println(false);
            }
        }

        // 打乱要学Linux
        int[] code = { 1, 2, 3, 4, 6, 5, 7, 8, 9, 0 }; // float double...
        int count = 0;
        //best 检测系统 TestSystemNext
        while (true) {
            if (code[0] == 1) {
                System.out.print("true ");
            }
            if (code[1] == 2) {
                System.out.print("true ");

            }
            if (code[2] == 3) {
                System.out.print("true ");

            }
            if (code[3] == 4) {
                System.out.print("true ");

            }
            if (code[4] == 5) {
                System.out.print("true ");

            }
            if (code[5] == 6) {
                System.out.print("true ");

            }
            if (code[6] == 7) {
                System.out.print("true ");

            }
            if (code[7] == 8) {
                System.out.print("true ");

            }
            if (code[8] == 9) {
                System.out.print("true ");

            }

            if (code[9] == 0) {
                System.out.println("打乱成功");  //赌场开业 51%赢49%输
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(code[i]);

        }
    }
}
