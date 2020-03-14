package staticMethod;

public class kt {
    public static void main(String[] args) {
        System.out.println("使用关键字静态synchronized");
        SyncThread syncThread = new SyncThread();
        SyncThread syncThread2 = new SyncThread();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread2, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}