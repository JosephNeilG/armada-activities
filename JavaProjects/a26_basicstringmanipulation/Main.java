package a26_basicstringmanipulation;

import java.util.Scanner;

/**
 * Asks user to input full name.
 * It converts the name to uppercase, counts characters excluding spaces, and extracts initials.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Convert the full name to upper case and display it
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Uppercase Name: " + upperCaseFullName);

        // Remove spaces from the full name and count the characters
        String nameWithoutSpaces = fullName.replace(" ", "");
        int charCountExcludingSpaces = nameWithoutSpaces.length();
        System.out.println("Total Characters (exluding spaces): " + charCountExcludingSpaces);

        // Split the full name into parts, store in an array and extract initials
        String[] namePartsArr = upperCaseFullName.split(" ");
        System.out.print("Initials: ");
        // Loop through each name part and extract the initial of each
        for (String name : namePartsArr) {
            System.out.print(name.substring(0, 1) + ".");
        }

        scanner.close();
    }
}