package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ravi", 25, "Pune"));
        list.add(new Employee(102, "Kiran", 28, "Hyderabad"));
        list.add(new Employee(103, "Anil", 30, "Pune"));
        list.add(new Employee(104, "Sita", 27, "Chennai"));
        list.add(new Employee(105, "Rahul", 29, "Pune"));

        List<Employee> puneList = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        puneList.forEach(System.out::println);
    }
}