package a25_tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize 3x3 game board
        char[][] gameBoard = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };


        char player = 'X';
        boolean gameOver = false;
        
        Scanner scanner = new Scanner(System.in);   

        System.out.println(" Tic-Tac-Toe Game");

        // Game loop
        while (!gameOver) {
            displayBoard(gameBoard);

            System.out.print("\nPlayer " + player + ", enter row and column: ");

            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            // Handle player move
            if (gameBoard[row][col] == '_') {
                gameBoard[row][col] = player;

                gameOver = hasPlayerWon(gameBoard, player);

                // Check if player wins
                if (gameOver) {
                    displayBoard(gameBoard);

                    System.out.print("\nPlayer " + player + " wins!");
                }
                // Check if board is full, declare draw
                else if (isBoardFull(gameBoard)){
                    gameOver = true;
                    displayBoard(gameBoard);

                    System.out.println("\nIt's a draw!");
                }
                // Switch player
                else {
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                }
            } else {
                System.out.println("Invalid move. Try again!");
            }
        }
        scanner.close();
    }

    /**
     * Displays the current game board.
     * 
     * @param gameBoard The 2D char array game board.
     */
    public static void displayBoard(char[][] gameBoard) {
        System.out.println();
        // print column numbering
        System.out.print("  ");
        for (int col = 0; col < gameBoard[0].length; col++) {
            System.out.print((col + 1) + " ");
        }
        System.out.println();

        // print rows with numbering
        for (int row = 0; row < gameBoard.length; row++) {
            System.out.print((row + 1) + " ");
            for (int col = 0; col < gameBoard[row].length; col++) {
                System.out.print(gameBoard[row][col] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Checks if the current player has won the game.
     * 
     * @param gameBoard The current game board.
     * @param player The current player X or O.
     * @return true if the player has won, false otherwise.
     */
    public static boolean hasPlayerWon(char[][] gameBoard, char player) {
        // Check rows
        for (int row = 0; row < gameBoard.length; row++) {
            if (gameBoard[row][0] == player && gameBoard[row][1] == player && gameBoard[row][2] == player) {
                return true;
            }
        }

        // Check column
        for (int col = 0; col < gameBoard[0].length; col++) {
            if (gameBoard[0][col] == player && gameBoard[1][col] == player && gameBoard[2][col] == player) {
                return true;
            }
        }

        // Check top-left to bottom-right diagonal
        if (gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player) {
            return true;
        }

        // Check top-right to bottom-left diagonal
        if (gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player) {
            return true;
        }

        return false;
    }

    /**
     * Checks if the board is full, draw if no player has won.
     * 
     * @param gameBoard The current game board.
     * @return true if the board is full, false otherwise.
     */
    public static boolean isBoardFull(char[][] gameBoard) {
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                if (gameBoard[row][col] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}
