package Demo.String;

public class StringCreatePerformance {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        for(int i = 0;i<500000;i++){
            String s = "123";
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("消耗时间为"+(endTime1-startTime1)+"毫秒");
        long startTime2 = System.currentTimeMillis();
        for(int i = 0;i<500000;i++){
            String s = new String("123");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("消耗时间为"+(endTime2-startTime2)+"毫秒");
    }

}
