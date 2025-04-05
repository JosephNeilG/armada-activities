package a27_analyzingandformattingaparagraph;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter paragraph
        System.out.print("Enter a paragraph: ");
        String paragraphInput = scanner.nextLine();

        // Trim leading/trailing spaces, remove extra space between words
        String formattedInput = paragraphInput.trim().replaceAll("\\s+", " ");

        // Split formatted input into words and count total number of words and print it
        String[] words = formattedInput.split(" ");
        System.out.println("Word Count: " + words.length);

        // Replace occurrences of "Java" with "Python" and print modified paragraph
        String modifiedParagraph = formattedInput.replace("Java", "Python");
        System.out.println("Modified Paragraph: " + modifiedParagraph);

        scanner.close();
    }
}