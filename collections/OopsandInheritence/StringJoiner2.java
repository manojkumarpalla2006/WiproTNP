package oopsandinheritence;

import java.util.StringJoiner;

public class StringJoiner2{
    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi").add("Mumbai").add("Hyderabad");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Chennai").add("Pune");

        System.out.println("s1 merged to s2");
        StringJoiner temp1 = new StringJoiner("-");
        temp1.add("Chennai").add("Pune");
        temp1.merge(s1);
        System.out.println(temp1);

        System.out.println("s2 merged to s1");
        StringJoiner temp2 = new StringJoiner("-");
        temp2.add("Delhi").add("Mumbai").add("Hyderabad");
        temp2.merge(s2);
        System.out.println(temp2);
    }
}