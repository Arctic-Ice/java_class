import org.junit.Test;

import java.util.Random;

public class testRandom {
    /**
     * 调用这个Math.Random()函数能够返回带正号的double型随机值，
     * 该值大于等于0.0且小于1.0，即取值范围是[0.0,1.0)的左闭右开区间。
     */
    @Test
    public void testMathRandom() {
        double random = Math.random();
        System.out.println(random);
    }

    /**
     * Random()：创建一个新的随机数生成器。
     * 该构造方法种子实际是当前系统时间的毫秒数作为种子数
     */
    @Test
    public void testRandom1() {
        Random random = new Random();
        System.out.println(random.nextInt());
    }

    /**
     * Random(long seed)：使用单个 long 种子创建一个新的随机数生成器。
     *
     */
    @Test
    public void testRandom2() {
        Random random1 = new Random(10);
        for (int i=0; i < 10; i++) {
            System.out.print(random1.nextInt(100) + "   ");
            // 13   80   93   90   46   56   97   88   81   14
        }
        System.out.println();
        Random random2 = new Random(10);
        for (int i=0; i < 10; i++) {
            System.out.print(random2.nextInt(100) + "   ");
            // 13   80   93   90   46   56   97   88   81   14
        }
    }
}
