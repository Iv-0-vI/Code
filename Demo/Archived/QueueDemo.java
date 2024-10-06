package Demo.Archived;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("刘");
        queue.add("泽");
        queue.add("楷");
        System.out.println(queue);// [刘, 泽, 楷]
        queue.remove();
        System.out.println(queue);// [泽, 楷]
        queue.poll();
        System.out.println(queue);// [楷]
        String peekResult = queue.peek();
        System.out.println("peekResult = " + peekResult);

        // 准备Queue [X1, X2, X3]
        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("X1");
        queue1.offer("X2");
        queue1.offer("X3");

        for (String q : queue1) {
            System.out.printf("%s ", q);
        }

        System.out.println();

        String queueElement = queue1.element();//返回第一个元素
        System.out.println(queueElement);
    }
}
