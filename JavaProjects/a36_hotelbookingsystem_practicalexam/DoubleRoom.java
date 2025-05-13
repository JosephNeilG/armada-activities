package a36_hotelbookingsystem_practicalexam;

/**
 * Represents a Double Room in the hotel.
 * Inherits from the abstract Room class.
 */
public class DoubleRoom extends Room {
    /** Constructs a Double Room with type and price. */
    DoubleRoom() {
        super("Double", 4500);
    }

    /**
     * Provides a description of Double Room.
     *
     * @return a description of the room
     */
    @Override
    public String getDescription() {
        return "Room for two.";
    }
}