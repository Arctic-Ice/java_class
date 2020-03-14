import org.junit.Test;

import java.io.*;

public class TestFileInputStream {
    @Test
    public void testRead() {
        int b;
        byte[] tom = new byte[100];
        try {
            FileInputStream in = new FileInputStream("read.txt");
            while ((b=in.read(tom, 0, 100)) != -1) {
                String s = new String(tom, 0, b);
                System.out.println(s);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
