package oopsandinheritence;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {

        String names[] = new String[5];

        Optional<String> op = Optional.ofNullable(names[0]);

        System.out.println(op.map(String::length).orElse(0));
    }
}