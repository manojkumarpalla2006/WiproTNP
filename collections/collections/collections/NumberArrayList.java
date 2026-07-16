package collections;

import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(25.5);
        numbers.add(98.75f);
        numbers.add(500L);

        System.out.println(numbers);
    }
}