package assignment04_conditionalstatement;
import java.util.Scanner;

public class RockPaperScissorsJNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input choice
        System.out.print("Enter your choice (R, P, S): ");
        String playerChoice = scanner.nextLine().toUpperCase();

        // Validate input, only accepts R, P, S
        if (!playerChoice.equals("R") && !playerChoice.equals("P") && !playerChoice.equals("S")) {
            System.out.println("Invalid input. Choose between R, P, S only.");
            scanner.close();
            return;
        }

        // Generate random number 1-3
        int compRandomNum = (int)(Math.random() * 3 + 1);
        
        // Assign computer choice based on compRandomNum
        String computerChoice = "";
        switch (compRandomNum) {
            case 1 -> computerChoice = "R";
            case 2 -> computerChoice = "P";
            case 3 -> computerChoice = "S";
        }

        // Display computer choice
        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        switch (playerChoice) {
            case "R":
                switch (computerChoice) {
                    case "R" -> System.out.println("It's a tie!");
                    case "P" -> System.out.println("You lose!");
                    case "S" -> System.out.println("You win!");
                }
                break;
            
            case "P":
                switch (computerChoice) {
                    case "R" -> System.out.println("You win!");
                    case "P" -> System.out.println("It's a tie!");
                    case "S" -> System.out.println("You lose!");
                }
                break;
            
            case "S":
                switch (computerChoice) {
                    case "R" -> System.out.println("You lose!");
                    case "P" -> System.out.println("You win!");
                    case "S" -> System.out.println("It's a tie!");
                }
                break;
        }
        scanner.close();
    }
}