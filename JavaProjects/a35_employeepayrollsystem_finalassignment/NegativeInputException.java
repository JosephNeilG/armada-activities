package a35_employeepayrollsystem_finalassignment;

/**
 * Custom exception for handling negative input values.
 * Thrown when a user inputs a negative value instead of positive values.
 */
public class NegativeInputException extends IllegalArgumentException {
    NegativeInputException(String message) {
        super(message);
    }
}