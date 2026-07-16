package collectionsproject6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

       
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                sb1.append(s2);
            else
                sb1.append(s1.charAt(i));
        }
        list.add(sb1.toString());

        
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last && first != -1) {
            String rev = new StringBuilder(s2).reverse().toString();
            String result = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            list.add(result);
        } else {
            list.add(s1 + s2);
        }

        
        if (first != last && first != -1) {
            String result = s1.substring(0, first) + s1.substring(first + s2.length());
            list.add(result);
        } else {
            list.add(s1);
        }

        
        int n = s2.length();
        int split = (n % 2 == 0) ? n / 2 : n / 2 + 1;

        String firstHalf = s2.substring(0, split);
        String secondHalf = s2.substring(split);

        list.add(firstHalf + s1 + secondHalf);

        
        StringBuilder sb5 = new StringBuilder();

        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) != -1)
                sb5.append('*');
            else
                sb5.append(ch);
        }

        list.add(sb5.toString());

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter S1:");
        String s1 = sc.nextLine();

        System.out.println("Enter S2:");
        String s2 = sc.nextLine();

        ArrayList<String> result = performOperations(s1, s2);

        System.out.println(result);

        sc.close();
    }
}