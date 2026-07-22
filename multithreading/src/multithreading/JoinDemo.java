package multithreading;

class EvenThread extends Thread {

    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}

class OddThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();

        try {
            even.join();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        odd.start();
    }
}