package daemonMethod;

public class People implements Runnable{
    private int age;
    public People(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                '}';
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            age += 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("people" + i);
        }
        System.out.println(age);
    }
}
