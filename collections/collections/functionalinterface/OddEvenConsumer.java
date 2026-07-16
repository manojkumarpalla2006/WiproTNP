package functionalinterface;

import java.util.*;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(
                Arrays.asList(2,5,8,9,11,12,15,20,23,30));

        Consumer<Integer> c=n->{
            if(n%2==0)
                System.out.println(n+" even");
            else
                System.out.println(n+" odd");
        };

        list.forEach(c);
    }
}