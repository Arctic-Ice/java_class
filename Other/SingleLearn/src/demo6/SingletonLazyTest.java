package demo6;

public class SingletonLazyTest {
    public static void main(String[] args) {
        Thread2[] threadArr = new Thread2[10];
        for (int i = 0; i < threadArr.length; i++) {
            threadArr[i] = new Thread2();
            threadArr[i].start();
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println(SingletonStaticInner.getInstance().hashCode());
    }
}
