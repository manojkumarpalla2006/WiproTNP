package functionalinterface;

import java.util.*;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Ravi","Pune",25000));
        list.add(new Employee(102,"Kiran","Hyderabad",30000));
        list.add(new Employee(103,"Rahul","Chennai",28000));
        list.add(new Employee(104,"Sita","Pune",35000));
        list.add(new Employee(105,"Anil","Delhi",27000));

        Function<Employee,String> f = e -> e.location;

        ArrayList<String> locations = new ArrayList<>();

        for(Employee e:list)
            locations.add(f.apply(e));

        System.out.println(locations);
    }
}