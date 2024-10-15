package Demo.Array;

public class ArrayReverse {
    public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        int j = a.length-1;
        for (int i = 0; i < a.length; i++) {
            b[j]=a[i];
            j--;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int[] reverseArray=reverse(array);
        for(int i =0;i<reverseArray.length;i++){
            System.out.print(reverseArray[i]);
        }
    }
}
