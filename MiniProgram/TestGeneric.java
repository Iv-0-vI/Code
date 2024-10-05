package MiniProgram;

public class TestGeneric {
    public static void main(String[] args) {

        Block<Integer> b1 = new Block<Integer>();
        Block<String> b2 = new Block<String>();
        Block<Character> b3 = new Block<Character>();
    }
}

// 泛型 可以是String Integer Character
class Block<T> {
    T t;
    int count = 0;

    public Block() {
        count++;
        System.out.println("空构造Block对象" +getClass()+ count + "次");

    }

    public Block(T t) {
        System.out.println("有参构造我是一个block");
    }

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
