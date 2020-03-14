package joinMethod;

public class Main {
    public static void main(String[] args) throws Exception{
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        myThread1.join();
        System.out.println("main");
    }
}
