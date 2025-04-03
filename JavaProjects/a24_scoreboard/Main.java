package a24_scoreboard;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        // Prompt user for the number of students and subjects
        int numOfStudents = promptStudentCountInput(scanner);
        int numOfSubjects = promptSubjectCountInput(scanner);

        // Initialize arrays for student scores, total scores, and average scores
        int[][] studentScores = new int[numOfStudents][numOfSubjects];
        int[] studentTotalScore = new int[numOfStudents];
        double[] studentAverageScore = new double[numOfStudents];

        // Collect scores for each student
        collectStudentScores(studentScores, scanner);

        // Calculate total and average scores for each student
        calculateTotalAndAverageScores(studentScores, studentTotalScore, studentAverageScore);

        // Display the results for each student
        displayStudentResults(studentScores, studentTotalScore, studentAverageScore, df);

        scanner.close();
    }

    /**
     * Prompts the user to enter the number of students.
     *
     * @param scanner the scanner object for user input.
     * @return        the number of students.
     */
    private static int promptStudentCountInput(Scanner scanner) {
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        return numOfStudents;
    }

    /**
     * Prompts the user to enter the number of subjects.
     *
     * @param scanner the scanner object for user input.
     * @return        the number of subjects.
     */
    private static int promptSubjectCountInput(Scanner scanner) {
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        return numOfSubjects;
    }

    /**
     * Collects the scores for each student for all subjects.
     *
     * @param studentScores the 2D array to store student scores.
     * @param scanner       the scanner object for user input.
     */
    private static void collectStudentScores(int[][] studentScores, Scanner scanner) {
        System.out.println();

        // Iterate through each student to get scores
        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("Enter scores for Student " + (i + 1) + ": ");

            // Collect scores for each subject for the current student
            for (int j = 0; j < studentScores[i].length; j++) {
                studentScores[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
    }

    /**
     * Calculates the total and average scores for each student.
     *
     * @param studentScores       the 2D array containing the scores of students.
     * @param studentTotalScore   the array to store total scores for each student.
     * @param studentAverageScore the array to store average scores for each student.
     */
    private static void calculateTotalAndAverageScores(int[][] studentScores, int[] studentTotalScore, double[] studentAverageScore) {
        // Iterate through each student to calculate total and average scores
        for (int i = 0; i < studentScores.length; i++) {
            // Calculate total score for the current student
            for (int j = 0; j < studentScores[i].length; j++) {
                studentTotalScore[i] += studentScores[i][j];
            }
            // Calculate average for the current student
            studentAverageScore[i] = (double) studentTotalScore[i] / studentScores[i].length;
        }
    }

    /**
     * Displays the total and average scores for each student.
     *
     * @param studentScores       the 2D array containing the scores of students.
     * @param studentTotalScore   the array of total scores for each student.
     * @param studentAverageScore the array of average scores for each student.
     * @param df                  the DecimalFormat object to format the average scores.
     */
    private static void displayStudentResults(int[][] studentScores, int[] studentTotalScore, double[] studentAverageScore, DecimalFormat df) {
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Student " + (i + 1) + " - Total: " + studentTotalScore[i] + ", Average: " + df.format(studentAverageScore[i]));
        }
    }
}