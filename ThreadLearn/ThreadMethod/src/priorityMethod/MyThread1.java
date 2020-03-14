package priorityMethod;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1的线程优先级是"+this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}