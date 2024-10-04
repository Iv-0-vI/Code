package Demo.Basic;
import java.util.ArrayList;
import java.util.Vector;
public class InstanceOfClass {
    public static void main(String[] args) {
        Object o1 = new ArrayList<>();
        Object o2 = new Object();
        Object o3 = new Vector<>();
        displayObjectClass(o1);
        displayObjectClass(o2);
        displayObjectClass(o3);
    }
    public static void displayObjectClass(Object o){
        if (o instanceof ArrayList){
            System.out.println("我是ArrayList实例");
        }else if(o instanceof Vector){
            System.out.println("我是Vector实例"); 
        }else{
            System.out.println("我是其他实例");
        }
    }
}

