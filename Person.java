// package
// 用代码讲个故事
// 觉得哪里缺少补哪里
// 天马行空|奇思妙想
// import
// My Java AI alive

//Object > Person > Student|Children
class Student extends Person {
    private String name;
    private int age;
    private String code;

    Student(String name, int age, String code) {
        super();
        System.out.println("上一步是调用父类方法");
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public String toString() {
        return "名字: " + this.name + " " + "年龄: " + this.age + " " + "学号" + this.code;

    }

}

class Children extends Person {
    // 不会写了 写代码好累 ps.跟电脑打字monologue
    // 空参构造
    public Children() {
        System.out.println("空参构造一个Children对象");
    }
}

public class Person {
    private String name;
    private int age;
    private int count;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person() {// 构造方法 构造要有脑子()
        System.out.println("空参构造创建了一个Person对象");
        this.count++;
        System.out.printf("这个对象创建了%d次\n", count);
    }

    public Person(String name, int age) {
        System.out.println("有参创建了一个Person对象");
    }

    public String toString() {
        return "名字: " + this.name + " " + "年龄: " + this.age + " " + "出现" + this.count + "次";

    }

    public static void main(String[] args) {// 做实验
        System.out.println("============================================");
        System.out.println("我在做实验");
        Person p1 = new Person();// 空参构造一个对象
        Person p2 = new Person("刘紫柯", 22);// 有参构造一个对象
        System.out.println(p1.toString());// 所有都是提示 包括二级菜单 (.)
        System.out.println("============================================");
        // 创建一个Student对象
        Person s1 = new Student("脉冲星之子", 22, "20020101");
        System.out.println(s1.toString());
        System.out.println(s1.getAge() + " " + s1.getName() + " " + s1.getClass());// 调用父类方法
        s1.getClass();
        System.out.println("============================================");

    }
}

/*
============================================
我在做实验
空参构造创建了一个Person对象
这个对象创建了1次
有参创建了一个Person对象
名字: null 年龄: 0 出现1次
============================================
空参构造创建了一个Person对象
这个对象创建了1次
上一步是调用父类方法
名字: 脉冲星之子 年龄: 22 学号20020101
0 null class Student
============================================
 */
