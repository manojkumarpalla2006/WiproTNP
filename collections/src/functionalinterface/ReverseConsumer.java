package functionalinterface;

import java.util.*;
import java.util.function.Consumer;

public class ReverseConsumer {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>(Arrays.asList(
                "Java","Python","C","Oracle","Spring",
                "HTML","CSS","React","Angular","Node"));

        Consumer<ArrayList<String>> c=l->{
            for(int i=0;i<l.size();i++){
                l.set(i,new StringBuilder(l.get(i)).reverse().toString());
            }
        };

        c.accept(list);

        System.out.println(list);
    }
}