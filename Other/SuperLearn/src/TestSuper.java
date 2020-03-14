class Animal {
    private String name;

    public String getName() {
        return name;
    }
}

class Dog extends Animal{
    public String getName() {
        return super.getName();
    }
}
public class TestSuper {
}
