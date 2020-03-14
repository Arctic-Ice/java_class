package newSingle;

public class People implements Runnable{
    private  static int count = 0;

    @Override
    public void run() {
        count ++;
        System.out.println(Thread.currentThread().getName() + "计数为" + count);
    }
}
