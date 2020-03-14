package staticMethod2;

class SyncThread implements Runnable {
    private static int count;

    public SyncThread() {
        count = 0;
    }

    public void circulate() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized static void method() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        if (Thread.currentThread().getName().equals("SyncThread1")) {
            method();
            return;
        }

        if (Thread.currentThread().getName().equals("SyncThread2")) {
            synchronized (this) {
                circulate();
            }
            return;
        }
        synchronized (this) {
            circulate();
        }
    }
}