package a18_paymentprocessing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompts user to choose a payment method.
        System.out.print("Choose payment method (1: Credit Card, 2: Paypal, 3: CryptoWallet): ");
        int choice = scanner.nextInt();

        // Process the payment.
        processUserPayment(choice);

        scanner.close();
    }

    /**
     * Processes the user-selected payment method.
     * 
     * @param choice The user's selected payment method (1: CreditCard, 2: PayPal, 3: CryptoWallet).
     */
    private static void processUserPayment(int choice) {
        PaymentMethod paymentMethod; // Declare a PaymentMethod reference to hold different payment methods.

        // Instantiate the appropriate payment method based on user choice and process payment.
        switch (choice) {
            case 1: 
                paymentMethod = new CreditCard();
                paymentMethod.processPayment(100);
                break;
            case 2:
                paymentMethod = new PayPal();
                paymentMethod.processPayment(250.50);
                break;
            case 3:
                paymentMethod = new CryptoWallet();
                paymentMethod.processPayment(520.90);
                break;
            default:
                System.out.println("Invalid choice, choose from 1 to 3 only.");
        }
    }
}