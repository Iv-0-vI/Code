package Demo.Basic;
abstract class Animal{
    public abstract void makeSound(); 
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("我在狗叫什么");
    }

}
public class AbstractClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.eat();
    }
}
