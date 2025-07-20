// Reverse the number using while loop

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit
        }

        System.out.println("Reversed Number: " + reverse);
        sc.close();
    }
}
