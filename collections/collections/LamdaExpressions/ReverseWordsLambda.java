package LamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsLambda {

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

        Collections.reverse(al);

        al.forEach(s -> System.out.println(s));
    }
}