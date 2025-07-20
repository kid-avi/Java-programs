// SubExample.java

import java.util.Scanner;

public class SubExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate sum
        int sub = num1 - num2;

        // Output the result
        System.out.println("The sub is: " + sub);

        sc.close();
    }
}
