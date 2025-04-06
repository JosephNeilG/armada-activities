package a31_ageverification;

/** Custom exception thrown when user is under the required age. */
public class AgeRestrictionException extends Exception {

    /**
     * Constructs a new AgeRestrictionException with the specified message.
     *
     * @param message The detail message for the exception.
     */
    public AgeRestrictionException(String message) {
        super(message);
    }
}