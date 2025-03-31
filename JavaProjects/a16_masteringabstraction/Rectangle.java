package a16_masteringabstraction;

/** Rectangle class extends Shape and provides an implementation. */
public class Rectangle extends Shape {
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

    /**
     * Calculates and prints the area of the rectangle,
     * formatted to display as a whole number.
     */
    public void area() {
        System.out.printf("Area of Rectangle: %.0f%n", (length * width));
    }
}