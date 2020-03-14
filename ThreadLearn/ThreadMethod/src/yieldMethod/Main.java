package yieldMethod;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("myThread1");
        myThread1.start();
    }
}
