package Demo.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class ArrayDifferenceSet {
    public static void main(String[] args) {
        differenceByHashSet();
        System.out.println();
        intersectionByArrayList();
    }
    public static void intersectionByArrayList() {
        System.out.println("differenceByArrayList正在运行");
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList1.add(0, "1");
        arrayList1.add(1, "2");
        arrayList1.add(2, "3");
        arrayList1.add(3, "4");

        arrayList2.add(0, "1");
        arrayList2.add(1, "3");
        arrayList2.add(2, "2");
        arrayList2.add(3, "4");
        arrayList1.retainAll(arrayList2);
        System.out.print(arrayList1);
        System.out.print(arrayList2);
        System.out.println("交集为" + arrayList1);
    }

    public static void differenceByHashSet() {
        System.out.println("HashSet正在运行");
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8,10};
        Set<Integer> intersection = new HashSet<>();
        for (int i : array1) {
            intersection.add(i);
        }
        // System.out.println(Arrays.toString(array1));
        for (int i : array2) {
            if (intersection.contains(i)) {
                intersection.remove(i);
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("差集为: " + intersection);
    }

}
