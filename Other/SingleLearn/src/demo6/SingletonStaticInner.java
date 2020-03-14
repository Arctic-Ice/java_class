package demo6;

import java.io.Serializable;

//使用静态内部类实现单例模式--线程安全
class SingletonStaticInner{
    private SingletonStaticInner() {

    }
    private static class SingletonInner {
        private static SingletonStaticInner singletonStaticInner = new SingletonStaticInner();
    }
    public static SingletonStaticInner getInstance() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return SingletonInner.singletonStaticInner;
    }
}
