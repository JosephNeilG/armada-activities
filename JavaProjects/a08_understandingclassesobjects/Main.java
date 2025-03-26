package a08_understandingclassesobjects;
// Joseph Neil Gapuz

class Car {
    String brand;
    int year;

    // Constructor to initialize brand and year
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Prints brand and year
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Car object
        Car car = new Car("Toyota", 2020);

        // Print Car details
        car.displayInfo();
    }
}