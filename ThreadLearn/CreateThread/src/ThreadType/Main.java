package ThreadType;

public class Main {
    public static void main(String[] args) {
        People personOne, personTwo;
        StringBuffer str = new StringBuffer();
        personOne = new People("zhang", str);
        personTwo = new People("li", str);
        personOne.start();
        personTwo.start();
    }
}
