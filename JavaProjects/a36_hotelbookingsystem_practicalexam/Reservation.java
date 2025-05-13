package a36_hotelbookingsystem_practicalexam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/** Represents a hotel reservation made by customer. */
public class Reservation {
    private Room room;
    private Customer customer;
    private String checkInDate;
    private String checkOutDate;
    private double totalPrice;

    /**
     * Constructs a Reservation object and calculates the total price.
     * 
     * @throws InvalidDateException if check-in date is not before check-out date
     */
    Reservation(Room room, Customer customer, String checkInDate, String checkOutDate) throws InvalidDateException{
        if (checkInDate.compareTo(checkOutDate) >= 0) {
            throw new InvalidDateException("Check-in date must be before check-out date.");
        }
        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = calculateTotalPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Applies membership discount to the room price per night.
     * Gold = 20%, Silver = 10%, Regular = 0%.
     *
     * @return discounted price per night
     */
    double applyDiscount() {
        double originalPrice = room.getPrice();
        double discountRate;
        String membership = customer.getMembershipStatus();

        if (membership.equalsIgnoreCase("Gold")) {
            discountRate = 0.20;
        } else if (membership.equalsIgnoreCase("Silver")) {
            discountRate = 0.10;
        } else {
            discountRate = 0.0;
        }

        return originalPrice * (1 - discountRate);
    }

    /**
     * Calculates the total price for the stay by multiplying
     * the number of days with the discounted price per night.
     *
     * @return total price
     */
    private double calculateTotalPrice() {
        long numberOfDays = getNumberOfDays();
        double discountedPricePerNight = applyDiscount();

        return discountedPricePerNight * numberOfDays;
    }

    /** Calculates the number of days between check-in and check-out
     * 
     * @return the number of days for duration of stay
    */
    private long getNumberOfDays() {
        // Convert check in and check out string to LocalDate object
        LocalDate checkIn = LocalDate.parse(checkInDate);
        LocalDate checkOut = LocalDate.parse(checkOutDate);

        // Calculate the number of days between both dates
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    /** Displays the reservation details. */
    public void displayReservationDetails() {
        System.out.println("\n--- Reservation Details ---");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Description: " + room.getDescription());
        System.out.println("Check-In: " + checkInDate);
        System.out.println("Check-Out: " + checkOutDate);
        System.out.printf("Total Price: PHP %,.2f\n", totalPrice);
    }
}