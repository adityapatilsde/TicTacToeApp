package org.example;

import java.util.Random;

public class TicTacToeApp {

    public static void main(String[] args) {
        String user = "User";
        String computer = "Computer";
        char userSymbol;
        char computerSymbol;
        String currentPlayer;
        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        System.out.println("Tossing a coin...");
        if (toss == 0) {
            System.out.println("User won the toss!");

            currentPlayer = user;
            userSymbol = 'X';
            computerSymbol = 'O';

        } else {
            System.out.println("Computer won the toss!");

            currentPlayer = computer;
            computerSymbol = 'X';
            userSymbol = 'O';
        }
        System.out.println("First Player: " + currentPlayer);
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}
