package daemonMethod;

public class Student implements Runnable{
    private int age;
    public Student(int age) {
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
        for (int i = 0; i < 100; i++) {
            age += 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("学生" + i);
        }
    }
}
