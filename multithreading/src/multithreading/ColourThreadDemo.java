package multithreading;

import java.util.Random;

class ColourRunnable implements Runnable {

    @Override
    public void run() {

        String[] colours = {
            "white", "blue", "black",
            "green", "red", "yellow"
        };

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red selected. Stopping...");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ColourThreadDemo {

    public static void main(String[] args) {

        ColourRunnable obj = new ColourRunnable();
        Thread t = new Thread(obj);

        t.start();
    }
}