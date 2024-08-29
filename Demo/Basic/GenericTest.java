package Demo.Basic;
// 
public class GenericTest<T> {
    private T t;
    public GenericTest(){
        System.out.println("构造方法");
    }
    public T getter(){
        return t;
    }
    public void setter(T t){
        this.t=t;
    }
    public static void main(String[] args) {
        GenericTest<Integer> g1 = new GenericTest<>();
        g1.setter(10086);
        System.out.println(g1.getter());
    }
}
