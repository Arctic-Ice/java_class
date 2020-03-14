package currentThread;

public class MyThread1 extends Thread {
    static {
        System.out.println("静态块的打印：" + Thread.currentThread().getName());
    }

    public MyThread1() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("run()方法的打印：" + Thread.currentThread().getName());
    }
}