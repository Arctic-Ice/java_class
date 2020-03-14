package RunnableType;

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
        for (int i = 0; i < 1000; i++) {
            age += 1;
        }
        System.out.println(age);
    }
}
