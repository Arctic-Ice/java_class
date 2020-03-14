package RunnableType;

public class Main {
    public static void main(String[] args) {
        People people = new People(10);
        Thread threadOne, threadTwo;
        threadOne = new Thread(people);
        threadOne.setName("one");
        threadTwo = new Thread(people);
        threadTwo.setName("two");
        threadOne.start();
        threadTwo.start();
    }
}
