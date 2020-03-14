package codeBlock3;

public class kt {
    public static void main(String[] args) {
        System.out.println("使用关键字synchronized");
        SyncThread syncThread = new SyncThread();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        Thread thread3 = new Thread(new People(), "People");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

