package a05_loops;
import java.util.Scanner;

public class LargestNumberFinderJNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; // Stores largest num entered, initialized to smallest possible int value
        boolean validInput = false; // Checks if any valid num was entered


        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int numInput = scanner.nextInt();

            // Checks for sentinel value to stop input
            if (numInput == -1) {
                break;
            }

            // Mark that a valid num was entered
            validInput = true;

            // Update largest if new num is greater
            if (numInput > largest) {
                largest = numInput;
            }
        }

        if (validInput) {
            System.out.println("The largest number entered is: " + largest);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();
    }
}