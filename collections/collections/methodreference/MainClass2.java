package methodreference;

public class MainClass2 {

    public static void main(String[] args) {

        PrimeInterface ref = Prime::new;

        ref.check(17);
        ref.check(20);
    }
}
