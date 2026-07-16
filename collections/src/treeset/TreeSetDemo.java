package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("USA");
        ts.add("Japan");
        ts.add("Australia");

        System.out.println("Original TreeSet:");
        System.out.println(ts);

        System.out.println("\nReverse Order:");
        System.out.println(ts.descendingSet());

        System.out.println("\nUsing Iterator:");

        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nIndia Exists? " + ts.contains("India"));
        System.out.println("Canada Exists? " + ts.contains("Canada"));
    }
}