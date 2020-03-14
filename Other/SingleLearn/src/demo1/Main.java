package demo1;

class SingletonHungary {
    private static SingletonHungary singletonHungary = new SingletonHungary();
    //将构造器设置为private禁止通过new进行实例化
    private SingletonHungary() {
        System.out.println("执行私有构造器");
    }
    public static SingletonHungary getInstance() {
        return singletonHungary;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("start main");
        SingletonHungary sh1 = SingletonHungary.getInstance();

    }
}