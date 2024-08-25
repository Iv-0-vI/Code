class Animal{

    public void eat(){
        System.out.println("我是一只动物");
    }
}
class Penguin extends Animal{
    public void eat(){
        super.eat();
        System.out.println("我是一只企鹅");
    }
}
class Mouse extends Animal{
    public void eat(){
        super.eat();
        System.out.println("我是一只老鼠");
    }
}
public class Extend {
    public static void main(String[] args){
        Animal animal1 = new Penguin();
        animal1.eat();
        Animal animal2 = new Mouse();
        animal2.eat();
    }
}
