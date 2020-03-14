package CallableType;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        Callable<Integer> callable = new People();
        FutureTask<Integer> future = new FutureTask<>(callable);
        Thread thread = new Thread(future);
        thread.start();
        try {
            Thread.sleep(1000);
            System.out.println("hello begin");
            System.out.println(future.isDone());
            System.out.println(future.get());   // 阻塞，抛出异常
            System.out.println(future.isDone());
            System.out.println("hello end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
