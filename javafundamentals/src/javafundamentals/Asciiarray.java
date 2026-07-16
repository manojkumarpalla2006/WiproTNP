package javafundamentals;

public class Asciiarray {
    public static void main(String[] args) {

        int[] a = {65, 66, 67, 68, 69, 70};

        for (int i = 0; i < a.length; i++) {
            System.out.print((char) a[i] + " ");
        }
    }
}
