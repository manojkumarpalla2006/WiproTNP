package functionalinterface;

import java.util.*;
import java.util.function.Predicate;

public class EmployeePredicate {

    public static void main(String[] args) {

        ArrayList<Employee1> list=new ArrayList<>();

        list.add(new Employee1(1,"Ravi",9000));
        list.add(new Employee1(2,"Anil",12000));
        list.add(new Employee1(3,"Kiran",8000));
        list.add(new Employee1(4,"Sita",15000));
        list.add(new Employee1(5,"Rahul",7000));

        Predicate<Employee1> p=e->e.getSalary()<10000;

        list.stream()
            .filter(p)
            .forEach(e->System.out.println(e.getName()));
    }
}