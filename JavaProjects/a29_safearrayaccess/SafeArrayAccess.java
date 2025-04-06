package a29_safearrayaccess;

import java.util.Scanner;

public class SafeArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = {10, 20, 30, 40, 50};

        // Prompt user to enter index
        System.out.print("Enter an index (0-" + (numArr.length - 1) + "): ");
        int indexInput = scanner.nextInt();

        try {
            // Try to access and display the element at the given index
            System.out.println("Element at index " + indexInput + ": " + numArr[indexInput]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index input
            System.out.println("Error: Invalid index. Please enter a number between 0 and " + (numArr.length - 1) + ".");
        }

        scanner.close();
    }   
}