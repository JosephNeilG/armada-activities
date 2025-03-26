package a04_conditionalstatement;
import java.util.Scanner;

public class GradingSystemJNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get score input
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Determine grade and feedback based on score input
        if (score >= 90) {
            System.out.println("Grade: A");
            System.out.println("Feedback: Excellent!");
        } else if (score >= 75) {
            System.out.println("Grade: B");
            System.out.println("Feedback: Good job!");
        } else if (score >= 50) {
            System.out.println("Grade: C");
            System.out.println("Feedback: Needs improvement.");
        } else {
            System.out.println("Grade: F");
            System.out.println("Feedback: Failed.");
        }
        scanner.close();
    }
}