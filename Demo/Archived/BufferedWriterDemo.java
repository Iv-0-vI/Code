package Demo.Archived;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        
        // 不知道为什么写入不了
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("BufferedWriterDemo.txt"))) {
            writer.write("HelloCosmos", 0, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return (name + "," + age);
    }
}
