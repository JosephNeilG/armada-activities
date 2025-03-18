package assignment04_conditionalstatement;
import java.util.Scanner;

public class OddEvenJNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Odd or Even Checker ===");

        // Get user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        scanner.close();
    }
}
