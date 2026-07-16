package functionalinterface;

import java.util.*;
import java.util.function.Predicate;

public class PerfectSquare {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(
                Arrays.asList(2,4,7,9,10,16,18,25,30,36));

        Predicate<Integer> p=n->{
            int s=(int)Math.sqrt(n);
            return s*s==n;
        };

        list.stream()
            .filter(p)
            .forEach(System.out::println);
    }
}