package joinMethod;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 10000);
            Thread.sleep(1000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}