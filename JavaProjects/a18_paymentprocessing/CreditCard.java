package a18_paymentprocessing;

/**
 * Class representing a Credit Card payment method.
 * Implements the PaymentMethod interface.
 */
public class CreditCard implements PaymentMethod{

    /**
     * Processes a credit card payment.
     * 
     * @param amount The amount to be processed.
     */
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing credit card payment of $%.2f%n", amount);
    }
}