package priorityMethod;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread2的线程优先级是"+this.getPriority());
    }
}
