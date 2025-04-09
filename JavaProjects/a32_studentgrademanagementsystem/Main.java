package a32_studentgrademanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Student student;
    static ArrayList<Student> students = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        displayOptions();

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    updateGrade();
                    break;
                case 4:
                    RemoveStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Choose between 1-7 only.");
                    break;
            }
        }
    }

    /** Displays the menu options */
    private static void displayOptions() {
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Update Grade");
        System.out.println("4. Remove Student");
        System.out.println("5. Exit");
    }

    /** Adds a new student after validating name and grade input. */
    private static void addStudent() {
        student = new Student();

        String name;
        do {
            System.out.print("\nEnter student name: ");
            name = scanner.nextLine().trim();

            // Check if entered name already exists
            if (isNameDuplicate(name)) {
                System.out.println("A student with that name already exists.");
            } else {
                student.setName(name); // Set name if valid and not duplicate
            }
        } while (student.getName() == null);

        do {
            enterGrade(student, "Enter student grade: ", "ERROR: Student grade must be between 0 and 100.");
        } while (student.getGrade() == -1);

        students.add(student);
        System.out.println("Student added!\n");
    }

    /**
     * Displays the list of all students with their grades.
     * If student list is empty, message will show.
     */
    private static void displayStudents() {
        if (checkIfStudentExists("display students")) {
            System.out.println("Students List:");

            // Loop through student list and display student info
            for (Student student : students) {
                student.displayStudentInfo();
            }

            System.out.println();
        }
    }

    /**
     * Updates the grade of a student if found in the list.
     * Displays message if student is not found or if student list is empty.
     */
    private static void updateGrade() {
        if (checkIfStudentExists("update a grade")) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            // Search for student by name (case-insensitive)
            for (Student student : students) {
                if (student.getName().equalsIgnoreCase(name)) {
                    do {
                        enterGrade(student, "Enter new grade: ", "ERROR: Student grade must be between 0 and 100.");
                    } while (student.getGrade() == -1);
                    System.out.println("Grade updated!\n");
                    return;
                }
            }
            System.out.println("Student not found.\n");
        }
    }

    /** Removes a student by name if they exist in the list. */
    private static void RemoveStudent() {
        if (checkIfStudentExists("remove a student")) {
            System.out.print("Enter student name to remove: ");
            String name = scanner.nextLine();

            for (Student student : students) {
                if (student.getName().equalsIgnoreCase(name)) {
                    students.remove(student);

                    System.out.println("Student removed!\n");
                    return;
                }
            }
            System.out.println("Student not found.\n");
        }
    }

    /**
     * Validates and sets the grade for a student.
     *
     * @param student the student whose grade is being set.
     * @param gradeMessage the prompt message for grade input.
     * @param invalidGradeMessage the message shown on invalid input.
     */
    private static void enterGrade(Student student, String gradeMessage, String invalidGradeMessage) {
        System.out.print(gradeMessage);

        // Keeps prompting until a valid numeric grade is entered
        while (!scanner.hasNextDouble()) {
            System.out.println(invalidGradeMessage);
            scanner.next();
            System.out.print(gradeMessage);
        }

        student.setGrade(scanner.nextDouble());
        scanner.nextLine();
    }

    /**
     * Checks if any students exist before performing an action.
     *
     * @param action the action being attempted.
     * @return true if student list is not empty, false otherwise.
     */
    private static boolean checkIfStudentExists(String action) {
        boolean isStudentExists = !students.isEmpty(); // returns true if list is not empty

        // Show message if list is empty
        if (!isStudentExists) {
            System.out.println("No students found. Cannot " + action + ".\n");
        }

        return isStudentExists;
    }

    /**
     * Checks if student name already exists in the student list.
     *
     * @param name The name to check for duplication.
     * @return true if student with same name exists, false otherwise.
     */
    private static boolean isNameDuplicate(String name) {
        for (Student student : students) {
            // Compare student's name with input name, ignoring case
            if (student.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}