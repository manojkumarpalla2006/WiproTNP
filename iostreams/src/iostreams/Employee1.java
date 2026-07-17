package iostreams;






import java.io.Serializable;
import java.util.Date;

public class Employee1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee1(String name, Date dateOfBirth, String department,
                     String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}