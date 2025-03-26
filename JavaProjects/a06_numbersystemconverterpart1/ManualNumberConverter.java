package a06_numbersystemconverterpart1;
import java.util.Scanner;

public class ManualNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int numInput = scanner.nextInt();

        // Display conversion results
        System.out.println("=== Number System Conversions ===");
        convertToBinary(numInput);
        convertToOctal(numInput);
        convertToHexadecimal(numInput);

        scanner.close();
    }

    /**
     * Converts a decimal number to binary and prints the result.
     * 
     * @param num The decimal number to convert
     */
    public static void convertToBinary(int num) {
        long binaryNum = 0;
        int binaryPlace = 1;

        // Loop to calculate binary equivalent
        while (num != 0) {
            int remainder = num % 2; // Remainder (0 or 1)
            binaryNum += remainder * binaryPlace; // Add remainder at the correct place value
            num /= 2; // Divide by 2 for next iteration
            binaryPlace *= 10; // Increase place value
        }
        System.out.println("Binary: " + binaryNum);
    }

    /**
     * Converts a decimal number to octal and prints the result.
     * 
     * @param num The decimal number to convert
     */
    public static void convertToOctal(int num) {
        long octalNum = 0;
        int octalPlace = 1;

        // Loop to calculate octal equivalent
        while (num != 0) {
            int remainder = num % 8; // Remainder (0-7)
            octalNum += remainder * octalPlace; // Add remainder at the correct place value
            num /= 8; // Divide by 8 for next iteration
            octalPlace *= 10; // Increase place value
        }
        System.out.println("Octal: " + octalNum);
    }

    /**
     * Converts a decimal number to hexadecimal and prints the result.
     * 
     * @param num The decimal number to convert
     */
    public static void convertToHexadecimal(int num) {
        int[] hexNum = new int[100]; // Array to store hexadecimal digits
        int i = 0;

        // Loop to calculate hexadecimal equivalent
        while (num != 0) {
            hexNum[i] = num % 16; // Remainder (0-15)
            num /= 16; // Divide by 16 for next iteration
            i++;
        }

        System.out.print("Hexadecimal: ");
        // Print hexadecimal number in reverse order (most significant digit first)
        for (int j = i - 1; j >= 0; j--) {
            if (hexNum[j] > 9) {
                System.out.print((char) (55 + hexNum[j])); // Convert 10-15 to A-F
            } else {
                System.out.print(hexNum[j]); // Print 0-9 as is
            }
        }
    }
}