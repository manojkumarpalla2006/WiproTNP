package oopsandinheritence;

import java.util.Scanner;

public class ShortLongShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string a:");

        String a = sc.next();
        System.out.println("enter string b:");
        String b = sc.next();

        if (a.length() < b.length())
            System.out.println(a + b + a);
        else
            System.out.println(b + a + b);
    }
}