package a30_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for first number
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            
            // Prompt user for second number
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Perform division
            int quotient = num1 / num2;

            // Display result
            System.out.println("Result: " + quotient);
        }
        catch (ArithmeticException ae) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException ime) {
            // Handle invalid (non-integer) input
            System.out.println("Invalid input. Please enter numbers only.");
        }

        scanner.close();
    }
}