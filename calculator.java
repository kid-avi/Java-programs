// Calculator to perform addition, subtraction, multiplication, and division

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch (choice) {
            case 1:
                int sum = num1 + num2;
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.println("The subtraction is: " + sub);
                break;
            case 3:
                int product = num1 * num2;
                System.out.println("The product is: " + product);
                break;
            case 4:
                if (num2 != 0) {
                    double division = (double) num1 / num2;
                    System.out.println("The division is: " + division);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Close the scanner
        sc.close();
    }
}