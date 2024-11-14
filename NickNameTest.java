import java.util.ArrayList;

public class NickNameTest {
    public static void main(String[] args) {
        //学生: 刘泽楷
        ArrayList<String> 刘泽楷_nickNames = new ArrayList<>();// 不一样的
        刘泽楷_nickNames.add("小刘");
        刘泽楷_nickNames.add("泽楷");
        刘泽楷_nickNames.add("楷哥");
        刘泽楷_nickNames.add("阿捞");
        刘泽楷_nickNames.add("痞老板分佬");
        刘泽楷_nickNames.add("小小影帝");
        刘泽楷_nickNames.add("FAKER");
        刘泽楷_nickNames.add("__lv-vl__");
        Student stu1 = new Student("刘泽楷", 刘泽楷_nickNames);
        System.out.println(stu1.小名);
        //学生: 陈冠州
        ArrayList<String> 陈冠州_nickNames = new ArrayList<>();
        陈冠州_nickNames.add("Justin Bieber");
        陈冠州_nickNames.add("八宝州");
        陈冠州_nickNames.add("道野");
        陈冠州_nickNames.add("Jack Harlow");
        Student stu2 = new Student("陈冠州", 陈冠州_nickNames);
        System.out.println(stu2.小名);
    }
}

class Student {
    public String 名字;
    public ArrayList<String> 小名;

    Student(String name, ArrayList<String> nickNames) {
        this.名字 = name;
        this.小名 = nickNames;
    }
    //打印结果
    @Override
    public String toString(){
        return "空";
    }
}
