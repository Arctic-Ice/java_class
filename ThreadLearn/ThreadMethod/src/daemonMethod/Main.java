package daemonMethod;

public class Main {
    public static void main(String[] args) {
        People people = new People(10);
        Student student = new Student(1);
        Thread threadOne, threadTwo;
        threadOne = new Thread(people);
        threadOne.setName("people");
        threadTwo = new Thread(student);
        threadTwo.setName("student");
        threadTwo.setDaemon(true);
        threadOne.start();
        threadTwo.start();
    }
}
