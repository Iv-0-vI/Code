public class GetClass {
    public static void main(String[] args) {
        Person p = new Person();//san yao yi yao lin lin ie giu san
        System.out.println(p.hashCode());
        System.out.println(p.toString());
        System.out.println(p.getClass());
    }
}
class Persons{
    private String code;
    public Persons(String code){
        this.code=code;
        System.out.println("有参构造");
    }
    public Persons(){
        System.out.println("空参构造");
    }
}
