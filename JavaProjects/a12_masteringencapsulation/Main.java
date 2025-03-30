package a12_masteringencapsulation;
class Student {
    // Private attributes
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation to prevent negative values
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age input. Age cannot be negative.");
        }
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student Age: " + getAge());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Student object
        Student student = new Student();

        // Set student details using setter methods
        student.setName("Joseph Neil Gapuz");
        student.setAge(22);

        // Display student details
        student.displayInfo();
    }
}