package Demo.Archived;

// 父
class Animal{
    public void eat(){
        System.out.println("我是一只动物");
    }
}

// 子1
class Penguin extends Animal{
    public void eat(){
        super.eat();
        System.out.println("我是一只企鹅");
    }
}

// 子2
class Mouse extends Animal{
    public void eat(){
        super.eat();
        System.out.println("我是一只老鼠");
    }
}

public class Extend {
    public static void main(String[] args){
        // 追溯到父类方法
        Animal animal1 = new Penguin();
        animal1.eat();
        System.out.println("=============");
        Animal animal2 = new Mouse();
        animal2.eat();
        System.out.println("=============");
        Penguin penguin = new Penguin();
        penguin.eat();
    }
}
