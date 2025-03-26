package a05_loops;
import java.util.Scanner;

public class SumOfNumbersJNG {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");

        // Check if input is a valid integer
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        int num = scanner.nextInt();

        // Check if input is positive
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        // Initialize variables for summation
        int i = 1;
        int sum = 0;

        // Calculate sum from 1 to num
        while (i <= num) {
            sum += i;
            i++;
        }

        // Display result
        System.out.println("The sum of natural numbers from 1 to " + num + " is: " + sum);

        scanner.close();
    }
}