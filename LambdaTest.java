//还不如定义一个新函数 哪怕新建一个类


//wrong
interface Operation {
    int operate(int a, int b);
}

public class LambdaTest {
    public static void main(String[] args) {
        // 匿名函数 行为
        Operation operation = (int a, int b) -> {
            return a - b;
        };

        int result = operation.operate(5, 3);
        System.out.println(result); // 输出结果应该是 2
    }
}