package CallableType;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main2 {
    public static void main(String[] args) {
        Callable<Integer> callable = new People();
        FutureTask<Integer> future = new FutureTask<>(callable);
        Thread thread = new Thread(future);
        thread.start();
        try {
            Thread.sleep(1000);
            System.out.println("hello begin");
            System.out.println(future.isDone());
            future.cancel(false);
            if (!future.isCancelled()) {
                System.out.println(future.isCancelled());
                System.out.println(future.get());
                System.out.println(future.isDone());
                System.out.println("hello end");
                System.out.println(future.isCancelled());
            } else {
                System.out.println("cancel~");
                System.out.println(future.isCancelled());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
