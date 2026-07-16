package methodreference;

public class MainClass1 {

    public static void main(String[] args) {

        DigitInterface ref = DigitCount::digitCount;

        System.out.println("Digits = " + ref.count(123456));
    }
}