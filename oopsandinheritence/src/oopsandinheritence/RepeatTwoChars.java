package oopsandinheritence;

import java.util.Scanner;

public class RepeatTwoChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");

        String str = sc.nextLine();

        String first = str.substring(0, 2);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += first;
        }

        System.out.println(result);
    }
}
