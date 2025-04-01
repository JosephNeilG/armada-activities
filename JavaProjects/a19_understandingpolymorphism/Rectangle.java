package a19_understandingpolymorphism;

/** Class representing a Rectangle, implements the Shape interface. */
public class Rectangle implements Shape {
    double length;
    double width;

    /**
     * Constructor to initialize the dimensions of the rectangle.
     * @param length Length of the rectangle.
     * @param width Width of the rectangle.
     */
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /** Calculates and prints the area of the rectangle. */
    public void area() {
        System.out.printf("Area of Rectangle: %.0f%n", (length * width));
    }
}