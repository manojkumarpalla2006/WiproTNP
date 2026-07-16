package LamdaExpressions;

import java.util.ArrayList;

public class OddLengthStrings {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Cat");
        al.add("Dog");
        al.add("Elephant");
        al.add("Fish");
        al.add("Goat");
        al.add("Horse");
        al.add("Ice");
        al.add("Jack");

        al.forEach(s -> {
            if (s.length() % 2 != 0)
                System.out.println(s);
        });
    }
}
