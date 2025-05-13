package a36_hotelbookingsystem_practicalexam;

/** Abstract base class representing a hotel room. */
public abstract class Room {
    private String roomType;
    private double price;

    Room(String roomType, double price) {
        this.roomType = roomType;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Returns description of the room.
     * Must be implemented by subclasses.
     *
     * @return a string describing the room
     */
    public abstract String getDescription();
}