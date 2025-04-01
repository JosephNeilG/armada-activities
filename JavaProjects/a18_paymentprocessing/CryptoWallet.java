package a18_paymentprocessing;

/**
 * Class representing a Cryptocurrency Wallet payment method.
 * Implements the PaymentMethod interface.
 */
public class CryptoWallet implements PaymentMethod {
    
    /**
     * Processes a cryptocurrency payment.
     * 
     * @param amount The amount to be processed.
     */
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing cryptocurrency payment of $%.2f%n", amount);
    }
}