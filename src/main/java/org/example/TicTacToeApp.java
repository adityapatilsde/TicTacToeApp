package org.example;

import java.util.Scanner;

public class TicTacToeApp {

    // Method to convert slot to row index
    public static int getRow(int slot) {
        return (slot - 1) / 3;
    }


    public static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();


        int row = getRow(slot);
        int col = getCol(slot);


        System.out.println("Row index: " + row);
        System.out.println("Column index: " + col);
    }
}
