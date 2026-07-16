package streamapi;

import java.util.ArrayList;

public class StudentDemo {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Ravi", 75));
        list.add(new Student(2, "Anil", 45));
        list.add(new Student(3, "Kiran", 90));
        list.add(new Student(4, "Sita", 55));
        list.add(new Student(5, "Rahul", 35));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed = " + count);
    }
}
