package HashMap;

import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Manoj", 111111);
        contacts.put("Rahul", 222222);
        contacts.put("Kiran", 333333);

        System.out.println("Contains Key : " + contacts.containsKey("Manoj"));
        System.out.println("Contains Value : " + contacts.containsValue(222222));

        Iterator<Map.Entry<String, Integer>> itr = contacts.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> e = itr.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}