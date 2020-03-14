package demo3;

// 单例模式的懒汉实现1--线程不安全
class SingletonLazy1 {
    private static SingletonLazy1 singletonLazy;

    //将构造器设置为private禁止通过new进行实例化
    private SingletonLazy1() {

    }

    public static synchronized SingletonLazy1 getInstance() {
        if (null == singletonLazy) {
            try {
                // 模拟在创建对象之前做一些准备工作
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singletonLazy = new SingletonLazy1();
        }
        return singletonLazy;
    }
}
