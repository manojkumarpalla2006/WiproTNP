package oopsandinheritence;

import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string1:");

        String s1 = sc.next();
        System.out.println("enter the string2:");
        String s2 = sc.next();

        if (Character.toLowerCase(s1.charAt(s1.length() - 1)) ==
                Character.toLowerCase(s2.charAt(0))) {
            System.out.println((s1 + s2.substring(1)).toLowerCase());
        } else {
            System.out.println((s1 + s2).toLowerCase());
        }
    }
}