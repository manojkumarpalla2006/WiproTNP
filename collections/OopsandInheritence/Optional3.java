package oopsandinheritence;

import java.util.Optional;

class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Optional3 {
    public static void main(String[] args) {

        Employee emp = null;

        try {
            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Employee is null"));

            System.out.println("Employee ID: " + e.id);
            System.out.println("Employee Name: " + e.name);

        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}