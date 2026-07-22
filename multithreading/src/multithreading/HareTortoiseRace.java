package multithreading;
class RaceThread extends Thread {

    private static boolean raceOver = false;

    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100 && !raceOver; i++) {

            System.out.println(getName() + " : " + i + " meters");

            if (getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping for 1 second...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }

            if (i == 100 && !raceOver) {
                raceOver = true;
                System.out.println("\n*** " + getName() + " wins the race! ***");
            }
        }
    }
}

public class HareTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}