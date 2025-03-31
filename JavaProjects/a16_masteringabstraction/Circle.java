package a16_masteringabstraction;

/** Circle class extends Shape and provides an implementation. */
public class Circle extends Shape {
    double radius;
    
    /**
     * Constructor to initialize the radius of the circle.
     * @param radius Radius of the circle.
     */
    Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates and prints the area of the circle,
     * formatted to 5 decimal places.
     */
    public void area() {
        System.out.printf("Area of Circle: %.5f%n", Math.PI * (radius * radius));
    }
}