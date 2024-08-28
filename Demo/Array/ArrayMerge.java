package Demo.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayMerge {
    public static void main(String[] args) {
        String[] a={"a","b","c","d"};
        String[] b={"e","f","g"};
        List<String> list = new ArrayList<>(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        System.out.println(list);
    }
}
