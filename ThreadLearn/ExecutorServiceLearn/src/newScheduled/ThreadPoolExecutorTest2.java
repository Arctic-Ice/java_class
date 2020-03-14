package newScheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool  = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 10; i++) {
            scheduledThreadPool.scheduleAtFixedRate(new People(), 1, 3, TimeUnit.SECONDS);
//            scheduledThreadPool.execute(new People());
        }
    }
}
