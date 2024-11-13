//还不如定义一个新函数 哪怕新建一个类

@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}

public class LambdaTest {
    public static void main(String[] args) {
        // 匿名函数 行为
        Operation operation = (int a, int b) -> {
            return a - b;
        };
        
        // 调用函数式接口的方法来执行Lambda表达式
        int result = operation.operate(5, 3);
        System.out.println(result); // 输出结果应该是 2
    }
}