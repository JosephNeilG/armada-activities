package a16_masteringabstraction;

public class Main {
    public static void main(String[] args) {
        // Object creation
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(25, 2);

        // Print shapes' areas.
        circle.area();
        rectangle.area();
    }
}