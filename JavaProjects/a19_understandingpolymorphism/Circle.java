package a19_understandingpolymorphism;

/** Class representing a Circle, implements the Shape interface. */
public class Circle implements Shape {
    double radius;
    
    /**
     * Constructor to initialize the radius of the circle.
     * @param radius Radius of the circle.
     */
    Circle(double radius) {
        this.radius = radius;
    }

    /** Calculates and prints the area of the circle. */
    public void area() {
        System.out.printf("Area of Circle: %.5f%n", Math.PI * (radius * radius));
    }
}