package org.example;

public class TicTacToeApp {

    // Method to check if move is valid
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Step 1: Check boundary conditions
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;
        boolean result = isValidMove(board, row, col);
        if (result) {
            System.out.println("Move is valid");
        } else {
            System.out.println("Move is invalid");
        }
    }
}