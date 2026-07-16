package HashMap;

import java.util.*;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");

        Iterator<Object> itr = p.keySet().iterator();

        while (itr.hasNext()) {
            Object key = itr.next();
            System.out.println(key + " -> " + p.get(key));
        }
    }
}