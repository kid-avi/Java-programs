// MultiplyExample.java

import java.util.Scanner;

public class MultiplyExample {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate multiplication
        int product = num1 * num2;

        // Output the result
        System.out.println("The product is: " + product);

        // Close the scanner
        sc.close();
    }
}
