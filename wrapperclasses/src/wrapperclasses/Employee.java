package wrapperclasses;

public class Employee implements Cloneable {

    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        try {

            Employee e1 = new Employee(101, "Manoj", 50000);

            Employee e2 = (Employee) e1.clone();

            // Change original object
            e1.empId = 102;
            e1.empName = "Kumar";
            e1.salary = 60000;

            System.out.println("Original Employee");
            e1.display();

            System.out.println("Cloned Employee");
            e2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}