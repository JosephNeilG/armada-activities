package a18_paymentprocessing;

/**
 * Class representing a PayPal payment method.
 * Implements the PaymentMethod interface.
 */
public class PayPal implements PaymentMethod {

    /**
     * Processes a PayPal payment.
     * 
     * @param amount The amount to be processed.
     */
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing PayPal payment of $%.2f%n", amount);
    }
}