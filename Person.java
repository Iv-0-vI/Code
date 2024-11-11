// package
// 用代码讲个故事
// 觉得哪里缺少补哪里
// import
// My Java AI alive
public class Person {
    private String name;
    private int age;
    private int count;

    public static void main(String[] args) {// 做实验
        Person p1 = new Person();// 空参构造一个对象
        Person p2 = new Person("刘紫柯", 22);// 有参构造一个对象
        System.out.println(p1.toString());// 所有都是提示 包括二级菜单 (.)
    }

    public Person() {// 构造方法 构造要有脑子()
        System.out.println("空参构造创建了一个Person对象");
        this.count++;
        System.out.printf("这个对象创建了%d次\n", count);
    }

    public Person(String name, int age) {
        System.out.println("有参创建了一个Person对象");
    }

    public String toString() {
        return "名字: " + this.name + "年龄: " + this.age + "出现" + this.count + "次";

    }
}

class Student extends Person {

}

class Children extends Person {

}
