package a36_hotelbookingsystem_practicalexam;

/**
 * Represents a Suite Room in the hotel.
 * Inherits from the abstract Room class.
 */
public class Suite extends Room {
    /** Constructs a Suite Room with type and price. */
    Suite() {
        super("Suite", 6500);
    }

    /**
     * Provides a description of Suite Room.
     *
     * @return a description of the room
     */
    @Override
    public String getDescription() {
        return "A well-deserved Luxurious suite.";
    }
}