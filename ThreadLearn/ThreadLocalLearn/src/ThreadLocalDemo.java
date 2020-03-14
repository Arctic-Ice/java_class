import java.util.Locale;

public class ThreadLocalDemo {
    private static ThreadLocal<Integer> local=new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            System.out.println("init");
            return 0;//初始值
        }
    };

    public static void main(String[] args) {
        Thread[] threads=new Thread[3];
        for(int i=0;i<3;i++){
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    int mun=local.get();
                    for(int j=0;j<10;j++){
                        mun=mun+1;
                    }
                    local.set(mun);
                    System.out.println(Thread.currentThread().getName()+"==="+local.get());

                }
            });
        }
        for(Thread t:threads){
            t.start();
        }

    }


}

