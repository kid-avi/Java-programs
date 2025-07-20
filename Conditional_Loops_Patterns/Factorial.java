// Factorial of a number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int factorial = 1;

        // Calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("Factorial of " + number + " is " + factorial);
        sc.close();
    }
}