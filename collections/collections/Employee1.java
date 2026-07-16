package collections;

public class Employee1 {

    int id;
    String name;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}