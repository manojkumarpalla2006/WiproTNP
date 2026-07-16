package methodreference;

public class Prime {

    public Prime(int n) {

        if (n < 2) {
            System.out.println("Not Prime");
            return;
        }

        boolean prime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}