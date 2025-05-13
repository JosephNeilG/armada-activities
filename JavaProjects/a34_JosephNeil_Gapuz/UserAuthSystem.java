package a34_JosephNeil_Gapuz;

import java.io.*;
import java.util.Scanner;

public class UserAuthSystem {
    static Scanner scanner = new Scanner(System.in);
    static File recordsFile = new File("a34_JosephNeil_Gapuz\\records.txt"); // Stores usernames and passwords

    // Menu constants
    static final String REGISTER = "1";
    static final String LOGIN = "2";
    static final String EXIT = "3";

    public static void main(String[] args) {

        while (true) {
            displayOptions();

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case REGISTER:
                    registerUser();
                    break;
                case LOGIN:
                    loginUser();
                    break;
                case EXIT:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Choose between 1-3 only.\n");
                    break;
            }
        }
    }

    /** Displays the main menu options. */
    private static void displayOptions() {
        System.out.println("=== User Authentication System ===");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
    }

    /** Handles user registration and writes new user data to the file. */
    private static void registerUser() {
        displayActionHeader("REGISTER YOUR");

        // Get valid username and password input
        String username = getValidatedInput("Username");
        String password = getValidatedInput("Password");

        // Save user credentials
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(recordsFile, true))) {
            bw.write(username + ":" + password);
            bw.newLine();
            System.out.println("\nRegistration successful!\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    /** Handles user login by checking credentials from records.txt */
    private static void loginUser() {
        displayActionHeader("LOGIN TO YOUR");

        String username = getValidatedInput("Username");
        String password = getValidatedInput("Password");

        boolean isAuthenticated = false;

        try (Scanner scanner = new Scanner(recordsFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Check if current line matches username:password
                if (line.equals(username + ":" + password)) {
                    isAuthenticated = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Output result
        if (isAuthenticated) {
            System.out.println("\nSuccessfully logged in!\n");
        } else {
            System.out.println("\nIncorrect username or password.\n");
        }
    }

    /**
     * Gets validated alphanumeric input from user.
     *
     * @param label the field label ("Username" or "Password")
     * @return a valid alphanumeric input string
     */
    private static String getValidatedInput(String label) {
        while (true) {
            System.out.print("Enter " + label + ": ");
            String input = scanner.nextLine();

            // Check for non-empty alphanumeric input
            if (isAlphaNumeric(input) && !input.isEmpty()) {
                return input;
            } else {
                System.out.println("Invalid input. " + label + " must be alphanumeric.");
            }
        }
    }

    /**
     * Checks if a string is alphanumeric.
     *
     * @param word input string
     * @return true if string is alphanumeric, false otherwise
     */
    private static boolean isAlphaNumeric(String word) {
        return word != null && word.matches("^[a-zA-Z0-9]*$");
    }

    /**
     * Displays an action-specific header.
     *
     * @param action the action being performed ("REGISTER YOUR" or "LOGIN TO YOUR")
     */
    private static void displayActionHeader(String action) {
        System.out.println("\n=== " + action + " ACCOUNT" + " === ");
        System.out.println("Note: Alphanumeric Characters Only\n");
    }
}