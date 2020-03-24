public class ConstructCodeBlock {
    private int initValue;//成员变量的初始化交给代码块来完成
    {
        //代码块的作用体现于此：在调用构造方法之前，用某段代码对成员变量进行初始化。
        //而不是在构造方法调用时再进行。一般用于将构造方法的相同部分提取出来。
        for (int i = 0;i < 100;i ++) {
            initValue += i;
        }
        System.out.println("initValue=" + initValue);
    }

    ConstructCodeBlock(){
        System.out.println("构造方法运行");
    }
}

class testConstructCode {
    public static void main(String[] args) {
        ConstructCodeBlock ccb1 = new ConstructCodeBlock();
        ConstructCodeBlock ccb2 = new ConstructCodeBlock();
    }
}

