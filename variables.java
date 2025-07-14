
// TYPES OF VARIABLES
import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        // create scanner for user input
        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your account balance: ");
        double accountBalance = sc.nextDouble();

        System.out.println("Enter your height in meters: ");
        float height = sc.nextFloat();

        System.out.println("Enter your phone number: ");
        long phoneNumber = sc.nextLong();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Enter your blood group (A, B, AB, O, A+, B+): ");
        char bloodGroup = sc.next().charAt(0);

        // Displaying the user inputs
        System.out.println("----- User Information -----");
        System.out.println("Your full name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your account balance is: " + accountBalance);
        System.out.println("Your height is: " + height + " meters");
        System.out.println("Your phone number is: " + phoneNumber);
        System.out.println("Are you a student? " + isStudent);
        System.out.println("Your blood group is: " + bloodGroup);

        sc.close(); // Close after you're done with all input

    }
}
