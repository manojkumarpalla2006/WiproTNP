package javafundamentals;

import java.util.Arrays;

public class Sortedarray {
    public static void main(String[] args) {

        int[] arr = {28, 15, 45, 5, 30};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}