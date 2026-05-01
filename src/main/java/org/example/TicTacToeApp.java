package org.example;

public class TicTacToeApp {

    static char[][] board = {
            {'X','O','X'},
            {'X','O','O'},
            {'O','X','X'}
    };

    public static void main(String[] args) {
        System.out.println(isDraw());
    }

    static boolean hasWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return true;
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j])
                return true;
        }

        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;

        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true;

        return false;
    }

    static boolean isDraw() {
        if (hasWinner())
            return false;

        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                if (board[r][c] == '-')
                    return false;

        return true;
    }
}