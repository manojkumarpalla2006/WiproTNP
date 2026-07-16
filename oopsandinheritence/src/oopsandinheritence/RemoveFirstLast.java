package oopsandinheritence;

import java.util.Scanner;

public class RemoveFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the string:");
        String str = sc.nextLine();

        System.out.println(str.substring(1, str.length() - 1));
    }
}