// 创建线程的方式
// 实现Runnable接口
// 继承Thread类
package MiniProgram;
import java.lang.Runnable;

public class TestThread {
    public static void main(String[] args) {
        //实现Runnable接口
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        try{
            // t1.join();
            //占据3s
            t1.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //继承Thread类
        Thread t2 = new Thread(new MyThread());
        t2.start();

    }

}

// 实现Runnable接口
class MyRunnable implements Runnable {
    private String name1 = "LZK";
    private String name2 = "XXX";

    @Override
    public void run(){
        // %s = \n
        System.out.printf("%s喜欢%s", name1,name2);
        System.out.println();
    }
}
// 继承Thread类
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("我是一个线程");
    }
}
