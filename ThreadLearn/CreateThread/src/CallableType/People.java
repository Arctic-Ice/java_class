package CallableType;

import java.util.Random;
import java.util.concurrent.Callable;

public class People implements Callable<Integer> {
    @Override
    public Integer call() throws Exception{
        Thread.sleep(6000);
        return new Random().nextInt(100);
    }
}
