package Demo.Array;

import java.util.Arrays;

public class ArraySortAndSearch {
    public static void main(String[] args) {
        int[] array = { 1, 7, 3, 5};
        Arrays.sort(array);
        int index = array.length;
        System.out.println("数组长度为: " + index);
        printArray(array);
        int binarySearchResult = Arrays.binarySearch(array, 3);
        System.out.println("二分查找索引为" + binarySearchResult);

    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element);
        }
        System.out.println();
    }
}
