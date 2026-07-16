package iostreams;

import java.io.*;
import java.util.Date;

public class EmployeeDemo {

    public static void main(String[] args) {

        try {

            Employee emp = new Employee(
                    "Manoj",
                    new Date(),
                    "IT",
                    "Software Engineer",
                    50000.0);

            // Serialization
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");

            // Deserialization
            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("\nEmployee Details");
            System.out.println("Name : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
