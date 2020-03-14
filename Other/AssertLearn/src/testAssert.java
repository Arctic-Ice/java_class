import org.junit.Test;
import static org.junit.Assert.*;

public class testAssert {
    @Test
    public void testAssert1() {
        int a = 1;
        int b = 2;
        assert a > b;
        System.out.println("end");
    }

    @Test
    public void testAssert2() {
        int a = 1;
        int b = 2;
        assert a > b:"错误，a不大于b";
        System.out.println("end");
    }

    @Test
    public void testAssertTrue() {
        int a = 1;
        int b = 2;
        assertTrue(a > b);
        System.out.println("end");
        assertFalse(a < b);
    }


    @Test
    public void testAssertEquals() {
        int a = 1;
        int b = 2;
        assertEquals(a < b, false);
        System.out.println("end");
    }
}
