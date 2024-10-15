package Demo.Archived;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        // Arrays类静态方法创建集合
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        boolean boolContain = list1.contains(5);
        System.out.println(boolContain);// true

        // List创建集合
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);// size = 11
        int list2Size = list2.size();
        System.out.println("list2Size = " + list2Size);

        // 遍历迭代器1
        Iterator<Integer> it1 = list1.iterator();
        System.out.println("===");
        System.out.println("迭代器遍历");
        while (it1.hasNext()) {
            Integer nextInt = it1.next();
            System.out.printf("%d ", nextInt);
        }
        
        // 分割行
        System.out.println();
        System.out.println("===");

        // 遍历迭代器2
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()) {
            System.out.printf("%d ",it2.next()); 
        }
        
    }
}
