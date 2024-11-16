public class Thread0Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run();
        MyRunnable t2 = new MyRunnable();
        t2.run();; //运行不了

    }
}

class MyRunnable implements Runnable {
    // run方法是空的
    @Override
    public void run() {
        System.out.println("Runnable线程开跑");
        System.out.println("通过实现Runnable接口重写线程代码来完成线程代码");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread线程开跑");
        System.out.println("通过继承Thread覆写Run方法来实现\'线程代码\'从主程序分离");
    }
}
