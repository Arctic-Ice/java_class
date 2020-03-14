package newCache;


public class People implements Runnable{
    private  int count = 0;
    @Override
    public void run() {
        count ++;
        System.out.println(Thread.currentThread().getName() + "计数为" + count);
    }
}
