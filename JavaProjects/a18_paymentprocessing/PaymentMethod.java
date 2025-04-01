package a18_paymentprocessing;

/** All payment methods must implement the processPayment method. */
interface PaymentMethod {
    /**
     * Processes a payment of the specified amount.
     * 
     * @param amount Amount to be processed.
     */
    void processPayment(double amount);
}