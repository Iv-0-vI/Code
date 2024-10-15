package MiniProgram;

public class TestGeneric {
    public static void main(String[] args) {

        Block<Integer> Integer_b1 = new Block<Integer>();
        Integer_b1.add(1);
        System.out.println(Integer_b1.get());
        Block<String> String_b2 = new Block<String>();
        String_b2.add("1");
        System.out.println(String_b2.get());
        Block<Character> Character_b3 = new Block<Character>();
        Character_b3.add('1');
        System.out.println(Character_b3.get()); 
    }
}

// 泛型 可以是String Integer Character
class Block<T> {
    T t;
    int count = 0;

    public Block() {
        count++;
        System.out.println();
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
