package a36_hotelbookingsystem_practicalexam;

/**
 * Payment class handles processing of payments (Cash/ Credit Card) for hotel bookings.
 */
public class Payment {
    private double amount;
    private String paymentMethod;
    private String creditCardNumber;

    Payment(double amount, String paymentMethod, String creditCardNumber) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.creditCardNumber = creditCardNumber;
    }

    /** Processes the payment based on the selected payment method. */
    public void processPayment() {
        if (paymentMethod.equalsIgnoreCase("credit")) {
            System.out.printf("\nProcessing %s payment of PHP %,.2f\n", paymentMethod, amount);
            System.out.println("Credit Card: " + maskCreditCard());
            System.out.println("Payment successful!\n");
        } else if (paymentMethod.equalsIgnoreCase("cash")) {
            System.out.printf("\nSuccessfully booked! Please pay PHP %,.2f at the lobby upon arriving.\n\n", amount);
        }   
    }

    /**
     * Masks the credit card number showing only the last four digits.
     *
     * @return A string representing the masked credit card number.
     */
    private String maskCreditCard() {
        String lastFour = creditCardNumber.substring(creditCardNumber.length() - 4);
        return "xxxx xxxx xxxx " + lastFour;
    }
}