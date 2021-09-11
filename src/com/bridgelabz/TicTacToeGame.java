package com.bridgelabz;

public class TicTacToeGame {
    static char[] board = new char[10]; // board size 10

    public static void main(String[] args) {
        createBoard();//calling method
    }

    /*Method use:
     *in method data is character
     *and using for loop to iteration from 1 to 9

     */
    public static char[] createBoard() {
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
        return board;

    }
}