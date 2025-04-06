package a31_ageverification;

import java.util.Scanner;

public class AgeVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt to get user age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Call method to check if user meets age requirement
            checkAge(age);
        }
        catch (AgeRestrictionException are) {
            // Print custom exception message
            System.out.println("Error: " + are.getMessage());
        }

        scanner.close();
    }

    /**
     * Checks if the user is eligible to register based on age.
     *
     * @param age The user's age.
     * @throws AgeRestrictionException if age is less than 18.
     */
    public static void checkAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("You must be at least 18 to register.");
        }
        System.out.println("Registration successful!");
    }
}