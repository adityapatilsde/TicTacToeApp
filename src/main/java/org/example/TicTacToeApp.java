package org.example;

import java.util.Random;

<<<<<<< HEAD
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        placeMove(0, 0, 'X');
        System.out.println("Value at (0,0): " + board[0][0]);
    }
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
=======
public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
        printBoard();
    }
    static void computerMove() {
        Random rand = new Random();
        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                System.out.println("Computer placed at slot: " + slot);
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
>>>>>>> featureuc7
    }
}