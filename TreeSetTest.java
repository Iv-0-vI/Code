import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(1);
        ts.add(2);
        ts.add(3);
        System.out.println("TreeSet: " + ts);// [1, 2, 3]
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println("HashSet: " + hs);
    }
}
