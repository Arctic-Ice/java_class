package demo5;

// 单例模式的懒汉实现1--线程不安全
class SingletonLazy1 {
    private static SingletonLazy1 singletonLazy;

    //将构造器设置为private禁止通过new进行实例化
    private SingletonLazy1() {

    }

    public static SingletonLazy1 getInstance() {
        try {
            if (null == singletonLazy) {
                // 模拟在创建对象之前做一些准备工作
                Thread.sleep(1000);
                synchronized (SingletonLazy1.class) {
                    if (null == singletonLazy) {
                        singletonLazy = new SingletonLazy1();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singletonLazy;
    }
}
