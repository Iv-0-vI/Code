package Demo.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] oldArray = { 1, 2, 3, 4, 5 };
        // deleteArrayByIf(oldArray, 0);
        deleteArrayByArrayList();
    }
    // 看不太懂
    public static void deleteArrayByIf(int[] oldArray, int deleteIndex) {
        int[] newArray = new int[oldArray.length - 1];
        if (deleteIndex < 0 || deleteIndex >= oldArray.length) {
            throw new RuntimeException("元素越界");
        }
        for(int i =0 , j = 0;i<oldArray.length;i++,j++){
            if (i == deleteIndex) {
                // 跳过删除的元素，但不增加j的值
                j--;
            } else {
                // 复制元素到新数组
                newArray[j] = oldArray[i];
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
    public static void deleteArrayByArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.remove(0);
        arrayList.removeAll(arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        Collection<Integer> tobeRemoved = new ArrayList<>(Arrays.asList(2));
        arrayList2.removeAll(tobeRemoved);
        System.out.println(arrayList);
        System.out.println(arrayList2);
    }
}
