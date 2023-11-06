package week8;

import java.util.Scanner;

public class Question_08_20 {
    //6*7 board
    //red - yellow (R-Y)
    //respectively play
    //after each move print board and game status(for the player made the move)-draw-win-continue
    //(4 in a row col. row or dia. win) (draw mo winner with all cells full)(continue empty cells without winner)
    public static void main(String[] args) {
        char[][] board = new char[6][7];
        boolean[] isNotFinished = new boolean[1];
        isNotFinished[0] = true;
        boolean[] isTurnForX = new boolean[1];
        isTurnForX[0] = true;
        clearBoard(board);
        while (isNotFinished[0]) {
            displayBoard(board, isNotFinished, isTurnForX);
        }
    }

    public static void displayBoard(char[][] board, boolean[] isNotFinished, boolean[] isTurnForX) {
        Scanner input = new Scanner(System.in);
        int n = board.length;

        byte column;

        printBoard(board);

        if (isTurnForX[0]) {
            System.out.print("Drop a red disk at column (0-6): ");
            column = input.nextByte();
            for (int i = n - 1; i >= 0; i--) {
                if (board[0][column] != ' ') {
                    System.out.println("The column is full try another:");
                    displayBoard(board, isNotFinished, isTurnForX);
                }
                if (board[i][column] == ' ') {
                    board[i][column] = 'R';
                    break;
                }
            }

        } else {
            System.out.print("Drop a yellow disk at column (0-6): ");
            column = input.nextByte();
            for (int i = n - 1; i >= 0; i--) {
                if (board[0][column] != ' ') {
                    System.out.println("The column is full try another:");
                    displayBoard(board, isNotFinished, isTurnForX);
                }
                if (board[i][column] == ' ') {
                    board[i][column] = 'Y';
                    break;
                }

            }
        }
        isTurnForX[0] = !isTurnForX[0];
        isThereWinnerOrDraw(board, isNotFinished);


    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {

            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%c|", board[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static boolean isDraw(char[][] board, boolean[] isNotFinished) {
        if (isNotFinished[0]) {
            int counter = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == ' ') {
                        counter++;
                    }
                }
            }
            if (counter == 0) {
                isNotFinished[0] = false;
                printBoard(board);
                return true;
            }
        }
        return false;

    }

    public static void isThereWinnerOrDraw(char[][] board, boolean[] isNotFinished) {
        isXWinner(board, isNotFinished);
        isYWinner(board, isNotFinished);
        if (isDraw(board, isNotFinished)) {
            System.out.println("Drawwwww");
        }
    }

    public static void isYWinner(char[][] board, boolean[] isNotFinished) {
        if (checkRows(board, 'Y') || checkColumns(board, 'Y') || checkDiagonals(board, 'Y')) {
            isNotFinished[0] = false;
            printBoard(board);
            System.out.println("Player yellow wins");
        }
    }

    public static void isXWinner(char[][] board, boolean[] isNotFinished) {

        if (checkRows(board, 'R') || checkColumns(board, 'R') || checkDiagonals(board, 'R')) {
            isNotFinished[0] = false;
            printBoard(board);
            System.out.println("Player Red wins");
        }


    }

    public static boolean checkDiagonals(char[][] matrix, char a) {
        boolean check = false;
        for (int i = 0; i < matrix.length - 3; i++) {
            for (int j = 0; j < matrix.length - 3; j++) {
                if (matrix[i][j] == a && matrix[i + 1][j + 1] == a && matrix[i + 2][j + 2] == a && matrix[i + 3][j + 3] == a) {
                    //System.out.printf("major diagonal consecutive (%d , %d) to (%d , %d)\n", i, j, i + 3, j + 3);
                    check = true;
                }
            }
        }
        for (int i = 0; i < matrix.length - 3; i++) {
            for (int j = 3; j < matrix.length; j++) {

                if (matrix[i][j] == a && matrix[i + 1][j - 1] == a && matrix[i + 2][j - 2] == a && matrix[i + 3][j - 3] == a) {
                    System.out.printf("sub diagonal consecutive (%d , %d) to (%d , %d)\n", i, j, i + 3, j - 3);
                    check = true;
                }

            }
        }
        return check;
    }

    public static boolean checkColumns(char[][] matrix, char a) {
        for (int i = 0; i < matrix.length - 3; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == a && matrix[i + 1][j] == a && matrix[i + 2][j] == a && matrix[i + 3][j] == a) {
                    // System.out.printf("column consecutive (%d , %d) to (%d , %d)\n", i, j, i + 3, j);
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean checkRows(char[][] matrix, char a) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length - 3; j++) {

                if (matrix[i][j] == a && matrix[i][j + 1] == a && matrix[i][j + 2] == a && matrix[i][j + 3] == a) {
                    // System.out.printf("row consecutive (%d , %d) to (%d , %d)\n", i, j, i, j + 3);
                    return true;
                }
            }
        }
        return false;
    }

    public static void clearBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }
}
