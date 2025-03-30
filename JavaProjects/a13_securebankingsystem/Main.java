package a13_securebankingsystem;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static BankAccount bankAccount;
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Secure Banking System");

        while (true) {
            // Display menu options
            System.out.println("\n1. Create Account ");
            System.out.println("2. View Account Details ");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Apply Interest ");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            // Handle user choice
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAccountDetails();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    applyInterest();
                    break;
                case 6:
                    viewTransacHistory();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Choose between 1-7 only.");
                    break;
            }
        }
    }

    /**
     * Creates a new bank account if one does not already exist.
     * Prompts the user to enter valid account details and ensures input validation.
     * Prevents duplicate account creation.
     */
    static void createAccount() {
        // Prevent creating of account if account exists already
        if (bankAccount != null) {
            System.out.println("You already created an account.");
            return;
        }

        // TODO: use arraylist for error (setter getter for errors) - advice from Armada senior dev
        bankAccount = new BankAccount(); 
        
        do {
            System.out.print("Enter Account Number (10 digits): ");
            bankAccount.setAccountNumber(scanner.nextLine());
        } while (bankAccount.getAccountNumber() == null);
    
        do {
            System.out.print("Enter Account Holder Name: ");
            bankAccount.setAccountHolder(scanner.nextLine());
        } while (bankAccount.getAccountHolder() == null);
    
        do {
            System.out.print("Enter Initial Deposit: ");
            while (!scanner.hasNextDouble()) { // Ensure numeric input
                System.out.println("Invalid initial deposit amount. Please try again.");
                scanner.next();
                System.out.print("Enter Initial Deposit: ");
            }
            bankAccount.setBalance(scanner.nextDouble());
            scanner.nextLine();
        } while (bankAccount.getBalance() < 0);

        System.out.println("Account created successfully!");
    }

    /** Display bank account details. */
    static void viewAccountDetails() {
        if (checkIfAccountExists()) {
            bankAccount.viewAccountDetails();
        }
    }

    /** Deposits money into account. */
    static void depositMoney() {
        if (checkIfAccountExists()) {
            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            scanner.nextLine();
            
            bankAccount.depositMoney(depositAmount);
        }
    }

    /** Withdraws money from the account. */
    static void withdrawMoney() {
        if (checkIfAccountExists()) {
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = scanner.nextDouble();
            scanner.nextLine();

            bankAccount.withdrawMoney(withdrawAmount);
        }
    }

    /** Apply interest to the account balance. */
    static void applyInterest() {
        if (checkIfAccountExists()) {
            bankAccount.applyInterest();
        }
    }

    /** Displays transaction history. */
    static void viewTransacHistory() {
        if(checkIfAccountExists()) {
            bankAccount.viewTransacHistory();
        }
    }

    /**
     * Checks if a bank account exists before performing any action.
     * @return true if the account exists, false otherwise.
     */
    static boolean checkIfAccountExists() {
        boolean isAccountExists = (bankAccount != null);

        if (!isAccountExists) {
            System.out.println("No account found. Please create an account first.");
        }

        return isAccountExists;
    }
}