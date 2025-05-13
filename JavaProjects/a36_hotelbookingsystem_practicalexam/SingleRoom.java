package a36_hotelbookingsystem_practicalexam;

/**
 * Represents a Single Room in the hotel.
 * Inherits from the abstract Room class.
 */
public class SingleRoom extends Room {
    /** Constructs a Single Room with type and price. */
    SingleRoom() {
        super("Single", 2500);
    }

    /**
     * Provides a description of Single Room.
     *
     * @return a description of the room
     */
    @Override
    public String getDescription() {
        return "Room for one.";
    }
}