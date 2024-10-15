package Demo.Array;

import java.util.*;

public class ArrayFill {
    public static void main(String[] args) {
        int[] array = new int[6];
        Arrays.fill(array, 100);
        for (int i : array) {
            System.out.println(i);
        }
        //[3, 6)
        Arrays.fill(array, 3, 6, 50);
        System.out.println();
        for (int i : array) {
            System.out.println(i);
        }
    }
}
