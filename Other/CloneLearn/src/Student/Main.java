package Student;

import org.junit.Test;

class Pepole {
    private String name;

    public Pepole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pepole{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main {
    @Test
    public void testClone() {
        Pepole pepole = new Pepole("张三");
        Pepole pepole1 = pepole;
        System.out.println(pepole);  // Pepole{name='张三'}
        System.out.println(pepole1); // Pepole{name='张三'}
        pepole.setName("李四");
        System.out.println(pepole);  // Pepole{name='李四'}
        System.out.println(pepole1);  // Pepole{name='李四'}
    }
}
