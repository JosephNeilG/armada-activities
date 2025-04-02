package a23_atmwithdrawalsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store account balances.
        double[] accountBalances = {1000, 3000, 5000, 20000, 25000};

        // Display available accounts.
        System.out.println("Available accounts:");
        displayAccounts(accountBalances);

        // Prompt user to select an account.
        System.out.print("\nEnter account index (0-4): ");
        int accountIndex = scanner.nextInt();

        // Check if the account index is valid.
        if (accountIndex >= 0 && accountIndex < accountBalances.length) {
            System.out.printf("Current balance: $%.2f%n", accountBalances[accountIndex]);

            System.out.print("\nEnter transaction type (1-Withdraw, 2-Deposit): ");
            int transacType = scanner.nextInt();

            // Process the transaction based on user choice.
            switch (transacType) {
                case 1:
                    processWithdrawal(scanner, accountBalances, accountIndex);
                    break;
                case 2:
                    processDeposit(scanner, accountBalances, accountIndex);
                    break;
                default:
                    System.out.println("Invalid transaction type.");
                    break;
            }
        } else {
            System.out.println("Invalid, enter a number between 0 and " + (accountBalances.length - 1) + ".");
        }

        scanner.close();
    }

     /**
     * Displays the available accounts with their indices.
     *
     * @param accountBalances The array holding the account balances.
     */
    private static void displayAccounts(double[] accountBalances) {
        for (int i = 0; i < accountBalances.length; i++) {
            System.out.println("[" + i + "] Account " + (i + 1));
        }
    }

    /**
     * Processes the withdrawal transaction for the selected account.
     * Ensures that the withdrawal amount is valid and sufficient funds are available.
     *
     * @param scanner The Scanner object to read user input.
     * @param accountBalances The array holding the account balances.
     * @param accountIndex The index of the selected account.
     */
    private static void processWithdrawal(Scanner scanner, double[] accountBalances, int accountIndex) {
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        // Check if withdrawal amount is valid.
        if (withdrawAmount <= 0) {
            System.out.println("\nAmount must be greater than 0.");
            return;
        } else if (withdrawAmount > accountBalances[accountIndex]) {
            System.out.println("\nInsufficient balance.");
            return;
        }

        // Update balance
        accountBalances[accountIndex] -= withdrawAmount;

        System.out.println("\nTransaction successful!");
        System.out.printf("New Balance: $%.2f%n", accountBalances[accountIndex]);
    }

    /**
     * Processes the deposit transaction for the selected account.
     * Ensures that the deposit amount is positive.
     *
     * @param scanner The Scanner object to read user input.
     * @param accountBalances The array holding the account balances.
     * @param accountIndex The index of the selected account.
     */
    private static void processDeposit(Scanner scanner, double[] accountBalances, int accountIndex) {
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();

        // Check if the deposit amount is positive.
        if (depositAmount > 0) {
            accountBalances[accountIndex] += depositAmount;

            System.out.println("\nTransaction successful!");
            System.out.printf("New Balance: $%.2f%n", accountBalances[accountIndex]);
        } else {
            System.out.println("Invalid amount. Please enter a positive amount.");
        }
    }
}