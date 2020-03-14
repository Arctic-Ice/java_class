import org.junit.Test;

import java.util.ArrayList;

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
    public boolean equals(Object obj) {
        if (obj.getClass() != Student.class )  // 判断一下类型，否则比较不同类型的对象会报错
            return false;
        Student student = (Student)obj;
        return ( this.getAge() == student.getAge() ) && ( this.getName().equals(student.getName() ) );
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class testEquals {
    @Test
    public void testStudents() {
        Student student1 = new Student("张三", 30);
        Student student2 = new Student("张三", 30);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(new ArrayList<>()));

        for(int i = 0; i <10; i++) {
            System.out.println(i);
        }
    }
}
