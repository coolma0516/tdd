package com.activenetwork.tdd;

public class TicTacToe {
    private Character[][] board = {
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'}
    };

    public void play(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("The X axis is out of bound");
        }

        if (y < 1 || y > 3) {
            throw new RuntimeException("The Y axis is out of bound");
        }

        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Box is occupied");
        } else {
            board[x - 1][y - 1] = 'X';
        }
    }
}
