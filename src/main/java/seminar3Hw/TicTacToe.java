package seminar3Hw;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';
    private static Random random = new Random();

    public static void main(String[] args) {
        initializeBoard();
        displayBoard();

        while (true) {
            if (currentPlayer == 'X') {
                makeMovePlayer();
            } else {
                makeMoveRobot();
            }
            displayBoard();
            if (isGameFinished()) {
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void makeMovePlayer() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.println("Player User, enter row (0, 1, or 2):");
            row = scanner.nextInt();
            System.out.println("Player User, enter column (0, 1, or 2):");
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void makeMoveRobot() {
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (board[row][col] != '-');

        board[row][col] = currentPlayer;

        System.out.println("Player Robot chooses row: " + row + " column: " + col);
    }

    private static boolean isGameFinished() {
        if (isWin(currentPlayer)) {
            if (currentPlayer == 'X') {
                System.out.println("Player User wins!");
            } else {
                System.out.println("Player Robot wins!");
            }
            return true;
        } else if (isBoardFull()) {
            System.out.println("It's a tie!");
            return true;
        }
        return false;
    }

    private static boolean isWin(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}