package a14_understandinginheritance;

public class Main {
    public static void main(String[] args) {
        // Create a Student object and initialize its attributes using the constructor
        Student student = new Student("Alice", 20, 95);

        // Display student information
        student.displayInfo();

        // Display student grade
        student.displayGrade();
    }
}