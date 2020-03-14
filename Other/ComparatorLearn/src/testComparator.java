import org.junit.Test;

import java.util.*;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class StudentCompatator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // 升序
        return o1.getAge() - o2.getAge();
        // 升序
//        return o2.getAge() - o1.getAge();
    }

    // 该方法已经被Object类重写
//    @Override
//    public boolean equals(Object obj) {
//        return false;
//    }
}
public class testComparator {
    @Test
    public void testOrder() {
        List<Student> stus = new ArrayList<Student>();
        stus.add(new Student("张三", 30));
        stus.add(new Student("李四", 20));
        stus.add(new Student("王五", 40));
        stus.add(new Student("赵六", 30));
        stus.add(new Student("陈七", 40));
        stus.add(new Student("周八", 20));

//        Collections.sort(stus, new StudentCompatator());
        stus.sort(new StudentCompatator());
        System.out.println(stus);
    }
}
