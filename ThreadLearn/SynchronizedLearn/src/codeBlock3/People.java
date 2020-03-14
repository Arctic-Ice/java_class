package codeBlock3;

class People implements Runnable {
    private static int count;
    public People() {
        count = 0;
    }
    public void circulate() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("线程名:" + Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public  void run() {
        if ( Thread.currentThread().getName().equals("People")) {
            synchronized (this) {
                circulate();
            }
        } else {
            synchronized ("33") {
                circulate();
            }
        }
    }
}