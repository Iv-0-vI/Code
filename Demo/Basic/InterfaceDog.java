package Demo.Basic;
import Demo.Basic.InterfaceAnimal;;
public class InterfaceDog implements InterfaceAnimal{
    @Override
    public void eat(){
        System.out.println("bt eats shit");
    }
    @Override
    public void shit(){
        System.out.println("bt shits");
    }
    public static void main(String[] args) {
        InterfaceAnimal myDog = new InterfaceDog();
        myDog.abuse();
        myDog.eat();
        myDog.shit();
    }
}