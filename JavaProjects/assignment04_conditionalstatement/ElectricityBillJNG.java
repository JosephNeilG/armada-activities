package assignment04_conditionalstatement;
import java.util.Scanner;

public class ElectricityBillJNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for billing rates
        final double RATE_FIRST_100 = 1.50;
        final double RATE_NEXT_200 = 2.50;
        final double RATE_BEYOND_300 = 3.50;

        // Get user input
        System.out.print("Enter number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Store total bill amount
        double totalBill = 0;

        // Calculate bill based on the number of units consumed
        if (unitsConsumed <= 100) {
            // Charge at first rate if units are 100 or less
            totalBill  = unitsConsumed * RATE_FIRST_100;
        } else if (unitsConsumed <= 300) {
            // Charge first 100 units at RATE_FIRST_100
            // Charge remaining units (up to 200 more) at RATE_NEXT_200
            int remainingUnits = unitsConsumed - 100;
            totalBill = (100 * RATE_FIRST_100) + (remainingUnits * RATE_NEXT_200);
        } else {
            // Charge first 100 units at RATE_FIRST_100
            // Charge next 200 units at RATE_NEXT_200
            // Charge any units beyond 300 at RATE_BEYOND_300
            int remainingUnits = unitsConsumed - 300;
            totalBill = (100 * RATE_FIRST_100) + (200 * RATE_NEXT_200) + (remainingUnits * RATE_BEYOND_300);
        }

        System.out.println("Total bill: " + totalBill);

        scanner.close();
    }
}