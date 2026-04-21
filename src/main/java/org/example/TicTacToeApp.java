package org.example;

import java.util.Scanner;

public class TicTacToeApp {


    public static int getUserMove() {

        Scanner scanner = new Scanner(System.in);

        int slot;
        System.out.print("Enter your move (1-9): ");
        slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {
        int userSlot = getUserMove();
        System.out.println("User selected slot: " + userSlot);
    }
}


