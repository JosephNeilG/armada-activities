package a10_studentmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;

// Store student details
class Student {
    int studentNumCount;
    String name;
    int id;
    double grade;
    static int studentCounter = 0;

    // Student constructor to initialize student details
    Student(String name, int id, double grade) {
        studentCounter++;
        this.studentNumCount = studentCounter;
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Display student details
    void displayStudent() {
        System.out.println("Student " + studentNumCount + ":");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}

// Manage student operations, add, view, and update
class StudentManager {
    ArrayList<Student> students = new ArrayList<>(); // List to store student objects
    Scanner scanner = new Scanner(System.in);

    // Add new student
    void addStudent() {
        // Student name, can't be empty
        String name;
        while (true) {
            System.out.print("Enter student name: ");
            name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter a name.");
            } else {
                break;
            }
        }

        // Student id, must be unique
        int id;
        while (true) {
            System.out.print("Enter student ID: ");
            id = scanner.nextInt();
            scanner.nextLine();

            if (isIdDuplicate(id)) {
                System.out.println("Student ID already exists. Please enter a unique ID.");
            } else {
                break;
            }
        }

        // Student grade
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine();

        // Create and add new student object to the list
        Student newStudent = new Student(name, id, grade);
        students.add(newStudent);
        System.out.println("Student added successfully!\n");
    }

    // Checks if id already exists
    boolean isIdDuplicate(int id) {
        for (Student student : students) {
            if (student.id == id) {
                return true;
            }
        }
        return false;
    }

    // Display all students
    void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("--- Student Records ---");
        System.out.println("School: Greenwood High School\n");
        for (Student student : students) {
            student.displayStudent();
            System.out.println();
        }
    }

    // Updates a student's grade based on ID
    void updateStudentGrade() {
        if (students.isEmpty()) {
            System.out.println("No students to update.");
            return;
        }

        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();

        // Checks for the student with the given ID
        for (Student student : students) {
            if (student.id == id) {

                System.out.print("Enter new grade: ");
                double newGrade = scanner.nextDouble();

                student.grade = newGrade;
                System.out.println("Grade updated successfully!\n");
                return;
            }
        }

        System.out.println("Student ID not found.\n");
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();

        System.out.println("Welcome to the Student Management System\n");

        // Loop for menu
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.viewAllStudents();
                    break;
                case 3:
                    studentManager.updateStudentGrade();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Choose between 1-4 only.\n");
                    break;
            }
        }
    }
}