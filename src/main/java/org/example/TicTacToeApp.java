package org.example;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeApp {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char humanSymbol = 'X';
    static char computerSymbol = 'O';

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Turn");
                humanMove();
            } else {
                System.out.println("Computer Turn");
                computerMove();
            }

            printBoard();

            if (checkWin()) {
                if (isHumanTurn) {
                    System.out.println("Human Wins!");
                } else {
                    System.out.println("Computer Wins!");
                }
                gameOver = true;
            } else if (isBoardFull()) {
                System.out.println("It's a Draw!");
                gameOver = true;
            }

            isHumanTurn = !isHumanTurn;
        }
    }

    // Human input
    static void humanMove() {
        Scanner sc = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.print("Enter row (0-2): ");
            row = sc.nextInt();
            System.out.print("Enter col (0-2): ");
            col = sc.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = humanSymbol;
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    // Computer random move
    static void computerMove() {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                break;
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin() {

        // rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' &&
                    board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) {
                return true;
            }
        }

        // columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' &&
                    board[0][j] == board[1][j] &&
                    board[1][j] == board[2][j]) {
                return true;
            }
        }

        // diagonals
        if (board[0][0] != '-' &&
                board[0][0] == board[1][1] &&
                board[1][1] == board[2][2]) {
            return true;
        }

        if (board[0][2] != '-' &&
                board[0][2] == board[1][1] &&
                board[1][1] == board[2][0]) {
            return true;
        }

        return false;
    }
}