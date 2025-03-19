package assignment05_loops;
import java.util.Scanner;

public class GuessingGameJNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate random number 1-50
        int randomNum = (int) (Math.random() * 50 + 1);

        int guessInput; // Stores user's guess
        int attempts = 0; // Tracks number of attempts

        while (true) {
            System.out.print("Guess a number between 1 and 50: ");
            guessInput = scanner.nextInt();
            attempts++;

            // Check if guessed number is correct
            if (guessInput == randomNum) {
                System.out.println("Correct! You guessed it in " + attempts + (attempts == 1 ? " attempt." : " attempts."));
                break;
            // Hints if guess is incorrect 
            } else if (guessInput < randomNum) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}