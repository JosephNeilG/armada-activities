package a05_loops;
import java.util.Scanner;

public class PasswordCheckerJNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Valid password that user needs to enter
        String correctPassword = "java123";
        // Stores user PW input
        String passwordUserInput = "";
        
        // Loop until the correct password is entered
        do {
            System.out.print("Enter password: ");
            passwordUserInput = scanner.nextLine();

            // Check if the entered password is incorrect
            if (!correctPassword.equals(passwordUserInput)) {
                System.out.println("Incorrect password. Try again.");
            }
        } while (!correctPassword.equals(passwordUserInput)); // Repeat until PW matches

        // Message when correct PW is entered.
        System.out.println("Access granted!");

        scanner.close();
    }
}