package assignment07_studentgradeanalyzer;
import java.util.Scanner;

public class StudentGradesAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt to enter number of students
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        // Array to store student grades
        int[] gradesArr = new int[numOfStudents];
        
        // Accept student grades and store in array
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            gradesArr[i] = scanner.nextInt();
        }
        
        // Variables for grade calculations
        int totalGrade = 0; 
        double averageGrade = 0;
        int highestGrade = gradesArr[0]; // Assume first grade is highest
        int lowestGrade = gradesArr[0]; // Assume first grade is lowest

        // Calculate total, highest, and lowest
        for (int grade : gradesArr) {
            totalGrade += grade;

            // Update highest grade if current grade is greater
            if (grade > highestGrade) {
                highestGrade = grade;
            }

            // Update lowest grade if current grade is lower
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }

        // Compute average grade
        averageGrade = (double) totalGrade / numOfStudents;  

        // Display result
        System.out.println();
        System.out.println("=== Grade Analysis ===");
        System.out.println("Total Grades: " + totalGrade);
        System.out.printf("Average Grade: %.2f\n", averageGrade);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);

        scanner.close();
    }
} 