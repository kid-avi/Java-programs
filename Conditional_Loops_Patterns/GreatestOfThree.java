// Find the greatest of three numbers

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Determine the greatest of the three numbers
        int greatest;
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Output the result
        System.out.println("The greatest number is: " + greatest);

        // Close the scanner
        sc.close();
    }

}
