package methodreference;

public class MainClass {

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        MyInterface ref = obj::factorial;

        System.out.println("Factorial = " + ref.calculate(5));
    }
}
