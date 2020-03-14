package newScheduled;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class People implements Runnable{
    private  int count = 0;

    @Override
    public void run() {
        System.out.println(System.currentTimeMillis()/1000);
        count ++;
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "计数为" + count);
    }
}
