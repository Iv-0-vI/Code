package MiniProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestFile {
    public static void main(String[] args) throws IOException {

        System.out.println("正在准备对象......");
        Person p1 = new Person("LZK", 22, "程序员");
        Person p2 = new Person("XXX", 21, "家庭主妇");
        System.out.println("准备对象完成......");

        System.out.println("正在准备对象写入列表");
        PersonSystem personList = new PersonSystem();
        personList.addPersonToList(p1);
        personList.addPersonToList(p2);
        System.out.println("准备对象写入列表完成");

        System.out.println("正在写入文件......");
        PersonSystem ps = new PersonSystem();
        ps.writeToFile("TestFile.txt");
        //打印
        System.out.println(p1);
        System.out.println(p2);

    }

}

class PersonSystem {
    private List<Person> personList;

    public PersonSystem() {
        this.personList = new ArrayList<>();
    }

    public void addPersonToList(Person p) {
        personList.add(p);
    }

    public void writeToFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello Cosmos");
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readFromFile(String fileName){
        BufferedReader br = new BufferedReader(new FileReader(fileName))

    }
}

class Person {

    private String name;
    private int age;
    private String job;

    Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return (name + "," + age + "," + job);
    }
}