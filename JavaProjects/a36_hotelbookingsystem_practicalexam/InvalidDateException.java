package a36_hotelbookingsystem_practicalexam;

/** Custom exception class for handling invalid date input. */
public class InvalidDateException extends Exception {
    InvalidDateException(String message) {
        super(message);
    }
}