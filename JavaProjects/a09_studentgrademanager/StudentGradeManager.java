package a09_studentgrademanager;
import java.util.Scanner;

class Student {
    String name;
    int[] grades;

    // Constructor to initialize student details
    Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    // Calculate average for 4 grades
    double calculateAverage(int grade1, int grade2, int grade3) {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    // Calculate average for 4 grades (method overloading)
    double calculateAverage(int grade1, int grade2, int grade3, int grade4) {
        return (grade1 + grade2 + grade3 + grade4) / 4.0;
    }

    // Classify grade based on average
    static String classifyGrade(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 80) {
            return "Good";
        } else if (average >= 70) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }

    // Display student's name, grades, average, and classification
    void displayDetails() {
        // Prints name
        System.out.println("Student: " + name);

        // Prints grades
        System.out.print("Grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) {
                System.out.print(", ");
            }
        }

        // Checks number of grades input and calls the appropriate method to calculate the average
        double average = 0.0;
        if (grades.length == 3) {
            average = calculateAverage(grades[0], grades[1], grades[2]);
        } else if (grades.length == 4) {
            average = calculateAverage(grades[0], grades[1], grades[2], grades[3]);
        }

        // Prints average and classification
        System.out.printf("\nAverage: %.2f\n", average);
        System.out.println("Classification: " + Student.classifyGrade(average));
    }

}

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student name
        System.out.print("Enter student name: ");
        String nameInput = scanner.nextLine();

        int numOfGradesInput;

        // Get number of grades, accepts only 3 or 4 grades
        do {
            System.out.print("Enter number of grades (3 or 4): ");
            numOfGradesInput = scanner.nextInt();

            if (numOfGradesInput != 3 && numOfGradesInput != 4) {
                System.out.println("Invalid, must input only 3 or 4 grades.");
            }
        } while (numOfGradesInput != 3 && numOfGradesInput != 4);

        // Get grades
        int[] grades = new int[numOfGradesInput];
        System.out.print("Enter " + numOfGradesInput + " grades: ");
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextInt();
        }

        // Create student object and display details.
        Student student = new Student(nameInput, grades);
        student.displayDetails();

        scanner.close();
    }
}