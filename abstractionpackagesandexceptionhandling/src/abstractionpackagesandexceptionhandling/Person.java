package abstractionpackagesandexceptionhandling;

public class Person {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                throw new InvalidAgeException(
                        "Please enter Name and Age as command line arguments.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException(
                        "Age should be >=18 and <60.");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Registration Successful");

        } catch (NumberFormatException e) {
            System.out.println("Age should be a valid integer.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}