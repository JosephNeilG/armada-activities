package a22_inventorystockmanagement;

import java.util.Arrays;
import java.util.Scanner;

/** Allows the user to view, update, and display the product with the highest and lowest stock levels. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize stock levels for 10 products.
        int[] stocks = {10, 25, 14, 30, 5, 18, 22, 40, 12, 8};

        // Display current stock levels.
        System.out.println("Current stock levels:");
        System.out.println(Arrays.toString(stocks));

        // Prompt user to enter the product index to update.
        System.out.print("\nEnter the product index to update (0-" + (stocks.length - 1) +"): ");
        int index = scanner.nextInt();

        // Validate the index and update stock if valid.
        if (index >= 0 && index < stocks.length) {
            System.out.print("Enter the new stock value: ");
            int newStockValue = scanner.nextInt();
            stocks[index] = newStockValue;
        } else {
            System.out.println("Invalid, enter a number between 0 and " + (stocks.length - 1) + ".");
        }

        // Display updated stock levels.
        System.out.println("\nUpdated stock levels:");
        System.out.println(Arrays.toString(stocks));

        // Variables to track highest and lowest stock levels.
        int highestStock = stocks[0];
        int lowestStock = stocks[0];

        // Loop array to determine highest and lowest stock values.
        for (int stock : stocks) {
            if (stock > highestStock) {
                highestStock = stock;
            }

            if (stock < lowestStock) {
                lowestStock = stock;
            }
        }

        // Display highest and lowest stock.
        System.out.println("\nHighest Stock: " + highestStock);
        System.out.println("Lowest Stock: " + lowestStock);

        scanner.close();
    }
}