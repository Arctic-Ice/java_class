class StaticCodeBlock{
    StaticCodeBlock(){
        System.out.println("构造方法调用");
    }
    {
        System.out.println("构造代码块调用");
    }
    static {
        System.out.println("静态代码块调用");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行");
        StaticCodeBlock s1 = new StaticCodeBlock();
        StaticCodeBlock s2 = new StaticCodeBlock();
        //结果,静态代码块只会调用一次，类的所有对象共享该代码块
        //一般用于类的全局信息初始化
    }
}