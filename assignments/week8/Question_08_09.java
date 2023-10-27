package week8;

import java.util.Scanner;

public class Question_08_09 {
    //3*3 cells game board
    //two players 'X' and 'O'
    //three 'X' or 'O' in hor. ver. or diag.  win for player
    // all cells filled without a winner then draw
    // after entering a token board will be displayed again and game status (continue, win, or draw)


    public static void main(String[] args) {

        char[][] board = new char[3][3];
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
        byte row;
        byte column;
        printBoard(board);

        if(isTurnForX[0]){
            System.out.print("Enter a row(0,1, or 2) for player  X: ");
            row=input.nextByte();
            System.out.print("Enter a column(0,1, or 2) for player  X: ");
            column=input.nextByte();
            board[row][column]='X';
        }
        else {
            System.out.print("Enter a row(0,1, or 2) for player  O: ");
            row=input.nextByte();
            System.out.print("Enter a column(0,1, or 2) for player  O ");
            column=input.nextByte();
            board[row][column]='O';
        }
        isTurnForX[0]=!isTurnForX[0];
        isThereWinnerOrDraw(board,isNotFinished);


    }
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println("-------------");
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%c | ",board[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isDraw(char[][] board,boolean[] isNotFinished) {
        if(isNotFinished[0]){
        int counter=0;
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[i].length ; j++) {
                if(board[i][j]==' '){
                    counter++;
                }
            }
        }
        if(counter==0){
            isNotFinished[0]=false;
            printBoard(board);
            return true;
        }
        }
        return false;

    }
    public static void isThereWinnerOrDraw(char[][] board,boolean[] isNotFinished) {
        isXWinner(board,isNotFinished);
        isYWinner(board,isNotFinished);
        if(isDraw(board,isNotFinished)){
            System.out.println("Drawwwww");
        }
    }
    public static void isYWinner(char[][] board, boolean[] isNotFinished) {
        if(checkRow(board,'O')||checkColumn(board,'O')||checkDiagonal(board,'O')){
            isNotFinished[0]=false;
            printBoard(board);
            System.out.println("Player 0 wins");
        }
    }
    public static void isXWinner(char[][] board, boolean[] isNotFinished) {

        if(checkRow(board,'X')||checkColumn(board,'X')||checkDiagonal(board,'X')){
            isNotFinished[0]=false;
            printBoard(board);
            System.out.println("Player X wins");
        }


    }
    public static boolean checkDiagonal(char[][] board, char x) {
        return subDiagonal(board,x)||majorDiagonal(board,x);
    }
    public static boolean majorDiagonal(char[][] board, char x) {
        return board[0][0]==x&&board[1][1]==x&&board[2][2]==x;
    }
    public static boolean subDiagonal(char[][] board, char x) {
        return board[0][2]==x&&board[1][1]==x&&board[2][0]==x;
    }
    public static boolean checkColumn(char[][] board, char x) {
        for (int i = 0; i < board.length ; i++) {
            int counter=0;
            for (int j = 0; j < board.length ; j++) {
                if(board[j][i]==x){
                    counter++;
                }
            }
            if(counter==3){
                return true;
            }
        }
        return false;
    }
    public static boolean checkRow(char[][] board, char x) {
        for (int i = 0; i < board.length; i++) {
            int counter=0;
            for (int j = 0; j < board[i].length ; j++) {
                if(board[i][j]==x){
                    counter++;
                }
            }
            if(counter==3){
                return true;
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
