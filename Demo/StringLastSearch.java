package Demo;

public class StringLastSearch {
    public static void main(String[] args) {
        String str = "Hello World, hello Cosmos";
        System.out.println("字符串长度"+str.length());
        String searchString = "s";
        int lastIndex = str.lastIndexOf(searchString);//0起
        if (lastIndex == -1) {
            System.out.println("字符串没有找到");
        }else{
            System.out.println("字符串在"+lastIndex);
        }
    }
}