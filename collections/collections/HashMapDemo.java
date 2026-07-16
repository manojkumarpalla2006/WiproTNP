package HashMap;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");

        System.out.println("Key Exists : " + map.containsKey("India"));
        System.out.println("Value Exists : " + map.containsValue("Tokyo"));

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> e = itr.next();
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}