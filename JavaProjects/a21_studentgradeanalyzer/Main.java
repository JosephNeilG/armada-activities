package a21_studentgradeanalyzer;

import java.util.Scanner;

/**
 * This program allows users to input student grades, 
 * then calculates and displays the highest, lowest, and average grades.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter number of students.
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        // Ensure input is greater than 0.
        if (numOfStudents <= 0) {
            System.out.println("Invalid, number of students must be greater than 0.");
            scanner.close();
            return;
        }

        // Array to store student grades.
        int[] grades = new int[numOfStudents];
        
        // Loop to collect and store student grades.
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Variables for highest, lowest, and sum.
        int highestGrade = grades[0];
        int lowestGrade = grades[0];
        int sum = 0;

        // Loop through the array to determine highest, lowest, and sum of grades.
        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }

            if (grade < lowestGrade) {
                lowestGrade = grade;
            }

            sum += grade;
        }

        // Calculate average grade.
        double average = (double) sum / grades.length;

        // Display result.
        System.out.println("\nHighest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
        System.out.println("Average Grade: " + average);

        scanner.close();
    }
}