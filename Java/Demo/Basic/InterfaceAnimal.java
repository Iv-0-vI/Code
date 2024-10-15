package Demo.Basic;

//main方法应该在public内
public interface InterfaceAnimal{
    void shit();
    void eat();
    default void abuse(){
        System.out.println("bt abuse lzk");
    }
}
