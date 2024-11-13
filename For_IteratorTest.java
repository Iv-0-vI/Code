import java.util.Arrays;
import java.util.Iterator;

public class For_IteratorTest {
    public static void main(String[] args) {
        System.out.println("============================================");
        int[] nums = new int[] { 1, 3, 4, 5, 6, 7, 8, 9, 0 };// 固定大小
        System.out.println("地址引用地址: "+Arrays.asList(nums));// 打印的是引用地址

        // for迭代器

        // 普通for循环
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result = "[" + nums[0] + ",";
            } else if (i >= 1 && i < nums.length - 1) {
                result = result + nums[i] + ",";

            } else {
                result = result + nums[i] + "]";
            }

        }
        System.out.print(result);//打印结果 [1,3,4,5,6,7,8,9,0]
    }
}
