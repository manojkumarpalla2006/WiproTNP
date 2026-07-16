package javafundamentals;

class Alphabeticalorder2 {
    public static void main(String[] args) {

        char c1 = 'a';
        char c2 = 'e';

        if (c1 < c2) {
            System.out.println(c1 + "," + c2);
        } else {
            System.out.println(c2 + "," + c1);
        }
    }
}