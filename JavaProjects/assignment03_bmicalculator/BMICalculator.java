package assignment03_bmicalculator;
import java.util.Scanner;

public class BMICalculator {
    public static void main (String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for weight input
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        // Prompt for height input
        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine health status
        String healthStatus = (bmi < 18.5) ? "Underweight" :
                              (bmi >= 18.5 && bmi < 24.9) ? "Normal" :
                              (bmi >= 25 && bmi < 29.9) ? "Overweight" :
                              "Obese";

        // Display BMI report
        System.out.println("=== BMI Report ===");
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("Health Status: " + healthStatus);
        System.out.println("----------------------------");

        scanner.close();
    }
}