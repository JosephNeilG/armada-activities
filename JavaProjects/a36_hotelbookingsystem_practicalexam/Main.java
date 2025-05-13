package a36_hotelbookingsystem_practicalexam;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    // Menu constants
    static final String SINGLE_ROOM = "1";
    static final String DOUBLE_ROOM = "2";
    static final String SUITE_ROOM = "3";
    static final String EXIT = "4";

    public static void main(String[] args) {
        while (true) {
            displayAvailableRooms();

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case SINGLE_ROOM:
                    handleReservation(new SingleRoom());
                    break;
                case DOUBLE_ROOM:
                    handleReservation(new DoubleRoom());
                    break;
                case SUITE_ROOM:
                    handleReservation(new Suite());
                    break;
                case EXIT:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Choose between 1-4 only.\n");
                    break;
            }
        }
    }

    /** Displays available room types. */
    private static void displayAvailableRooms() {
        System.out.println("=====================================");
        System.out.println("          Hotel Booking System");
        System.out.println("=====================================\n");

        System.out.println("------- Select Room Type --------");
        System.out.println("1. Single Room (PHP 2,500)");
        System.out.println("2. Double Room (PHP 4,500)");
        System.out.println("3. Suite Room (PHP 6,500)");
        System.out.println("4. Exit");
    }

    /**
     * Handles customer reservation flow: customer info, dates, and payment.
     *
     * @param room the Room object the customer wants to reserve
     */
    private static void handleReservation(Room room) {
        System.out.println("\n--- Customer Information ---");
        String name = getValidatedInput("Name");
        String email = getValidatedInput("Email");
        String membershipStatus = getValidatedInput("Membership Status (Gold/Silver/None)");

        Customer customer = new Customer(name, email, membershipStatus);

        Reservation reservation = null;
        while (reservation == null) {
            try {
                System.out.println("\n--- Reservation Dates ---");
                String checkInDate = getValidatedInput("Check-In Date (YYYY-MM-DD)");
                String checkOutDate = getValidatedInput("Check-Out Date (YYYY-MM-DD)");

                reservation = new Reservation(room, customer, checkInDate, checkOutDate);
            } catch (InvalidDateException e) {
                System.out.println("\n" + e.getMessage() + " Please try again.");
            }
            catch (DateTimeParseException e) {
                System.out.println("\n" + e.getMessage() + ". Please try again.");
            }
        }

        reservation.displayReservationDetails();

        System.out.println("\n--- Payment Details ---");
        System.out.print("Enter Payment Method (Cash/Credit): ");
        String paymentMethod = scanner.nextLine().trim();

        String creditCardNumber = "";
        if (paymentMethod.equalsIgnoreCase("credit")) {
            while (true) {
                creditCardNumber = getValidatedInput("Credit Card Number (16 digits)");
                if (isValidCreditCardNumber(creditCardNumber)) {
                    break;
                } else {
                    System.out.println("Invalid Card Number. Please try again.");
                }
            }
        }

        Payment payment = new Payment(reservation.getTotalPrice(), paymentMethod, creditCardNumber);
        payment.processPayment();
    }

    /**
     * Prompts user input and ensures it is not empty.
     *
     * @param label the field name to ask the user
     * @return the validated non-empty input
     */
    private static String getValidatedInput(String label) {
        while (true) {
            System.out.print("Enter " + label + ": ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println(label + " cannot be blank. Please try again.");
            }
        }
    }

    /**
     * Checks if a credit card number has exactly 16 digits.
     *
     * @param cardNumber the credit card number to check
     * @return true if valid, false otherwise
     */
    private static boolean isValidCreditCardNumber(String cardNumber) {
        return cardNumber.matches("\\d{16}");
    }
}
