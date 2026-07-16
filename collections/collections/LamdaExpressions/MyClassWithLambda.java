package LamdaExpressions;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> {
            if (str == null || str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String s = "Java is easy to learn";

        System.out.println("Number of words = " + wc.count(s));
    }
}