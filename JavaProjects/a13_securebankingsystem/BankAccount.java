package a13_securebankingsystem;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory = new ArrayList<>(); // Stores transaction history
    private static final double INTEREST_RATE = 0.05; // Fixed interest rate of 5%
    private static final DecimalFormat df = new DecimalFormat("#.##"); // Formats decimal values to 2 decimal places

    /**
     * Retrieves the account number.
     * @return The account number as a string.
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Sets the account number if it is exactly 10 digits.
     * @param accountNumber The account number as a string.
     */
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.matches("\\d{10}")) {
            this.accountNumber = accountNumber;
        }
        else {
            System.out.println("Invalid account number. It must be numeric and exactly 10 digits.");
        }
    }

    /**
     * Retrieves the account holder's name.
     * @return The account holder's name.
     */
    public String getAccountHolder() {
        return this.accountHolder;
    }

    /**
     * Sets the account holder's name if it is not empty or null.
     * @param accountHolder The name of the account holder.
     */
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        }
        else {
            System.out.println("Account holder name cannot be empty.");
        }
    }

    /**
     * Retrieves the current balance.
     * @return The current balance as a double.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Sets the initial balance if it is a positive amount.
     * Also records the initial deposit in the transaction history.
     * @param balance The initial deposit amount.
     */
    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
            transactionHistory.add("- Deposit $" + df.format(balance));
        }
        else {
            System.out.println("Initial deposit amount cannot be negative. Please try again.");

            this.balance = -1;
        }
    }

    /**
     * Deposits a specified amount into the account.
     * Updates the balance and records the transaction.
     * @param depositAmount The amount to be deposited.
     */
    public void depositMoney(double depositAmount) {
        if (depositAmount > 0) {
            this.balance += depositAmount;
            transactionHistory.add("- Deposit $" + df.format(depositAmount));

            System.out.println("Deposit successful. New Balance: $" + df.format(this.balance));
            System.out.println("Transaction recorded: Deposit $" + df.format(depositAmount));
        }
        else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    /**
     * Withdraws a specified amount from the account.
     * Ensures sufficient funds before processing.
     * @param withdrawAmount The amount to be withdrawn.
     */
    public void withdrawMoney(double withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= this.balance) {
            this.balance -= withdrawAmount;
            transactionHistory.add("Withdraw: $" + df.format(withdrawAmount));

            System.out.println("Withdrawal successful. New Balance: $" + df.format(this.balance));
            System.out.println("Transaction recorded: Withdraw $" + df.format(withdrawAmount) + "\n");
        } 
        else if (withdrawAmount > this.balance) {
            System.out.println("Insufficient funds.");
        } 
        else {
            System.out.println("Withdrawal amount must be greater than 0.");
        }
    }

    /**
     * Applies interest to the current balance based on a fixed interest rate.
     * Updates the balance and records the transaction.
     */
    public void applyInterest() {
        double interest = this.balance * BankAccount.INTEREST_RATE;
        this.balance += interest;
        transactionHistory.add("- Interest Applied: $" + df.format(interest));
        
        System.out.println("Interest applied. New Balance: $" + df.format(this.balance) + " (Interest Rate: 5% annual)");
    }

    /**
     * Displays the transaction history.
     * If there are no transactions, it notifies the user.
     */
    public void viewTransacHistory() {
        System.out.println("--- Transaction History ---");

        if (transactionHistory.isEmpty()) {
            System.out.println("Transaction History is Empty.");
        } 
        else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

    /** Displays the account details, including account number, holder's name, and balance. */
    public void viewAccountDetails() {
        System.out.println("--- Account Details ---");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: $" + df.format(this.balance));
    }
}