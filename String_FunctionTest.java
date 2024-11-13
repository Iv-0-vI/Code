public class String_FunctionTest {
    public static void main(String[] args) {
        //String创建对象
        String s1 = "MCOne";
        String s2 = new String("KGO1ne");
        System.out.println(s1);//MCOne
        System.out.println(s2);//KGO1ne
        //String类的函数
        System.out.println(s2.concat(s2));//KGO1neKGO1ne 连接字符串
        System.out.println(s2.hashCode());//-2079806891
        System.out.println(s1.charAt(0));//M
        System.out.println(s2.replaceAll("\\w+", "123"));//KGO->123
    }
}
