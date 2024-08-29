package Demo.Array;
import java.util.Set;
import java.util.HashSet;
public class ArrayFindDupicate {
    public static void main(String[] args){
        int[] array= {1,2,2,3,4,5,5,5,5,6,2,7};
        findDupicateByLoop(array);
        findDupicateByHashSet(array);
    }
    //数量超过2会出错 O(n^2)
    public static void findDupicateByLoop(int[] array){
        System.out.println("loop方法");
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j = i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                    System.out.print("重复元素为: ");
                    System.out.println(array[j]);
                }
            }
        }
    }
    //复杂度O(n)
    public static void findDupicateByHashSet(int[] array){
        System.out.println("HashSet方法");
        Set<Integer> set =new HashSet<>();
        Set<Integer> dupicates =new HashSet<>();
        for(int a:array){
            if(!set.add(a)){
                dupicates.add(a);     
            }
        }
        System.out.println(dupicates);
    }
}
