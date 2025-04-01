package a19_understandingpolymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape;

        // Instantiate a Circle and calculate its area.
        shape = new Circle(5);
        shape.area();

        // Instantiate a Rectangle and calculate its area.
        shape = new Rectangle(25, 2);
        shape.area();
    }
}