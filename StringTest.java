
//Java 我能为你做些什么
//外星人打代码传输数据
public class StringTest {
    public static void main(String[] args) {
        printHello();// print: Hello Lzk
        System.out.println("============================================");
        String name = "Java";
        bianliJava(name);// output Java in line
        System.out.println("============================================");
        System.out.println('J' + 'a' + 'v' + 'a');// assemble Java
        System.out.println("============================================");
    }

    public static void bianliJava(String name) {

        for (int i = 0; i < 4; i++) {
            System.out.println(name.charAt(i));
        }
    }

    public static void printHello() {
        System.out.println("Hello Lzk");
    }
}

class Java {
    private String name = "Java";
    private int age = 22;
}