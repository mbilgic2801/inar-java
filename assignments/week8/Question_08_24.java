package week8;

import java.util.Scanner;

public class Question_08_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] sudoku = new int[9][9];
        System.out.println("Enter a Sudoku puzzle solution:");
        CommonMethods.takeInput(sudoku);
        System.out.printf("%s solution",(isValid(sudoku)?"Valid":"Invalid"));
        /*String numbers = "123456789";
        System.out.println(numbers);
        numbers = numbers.substring(0, numbers.indexOf("5")) + numbers.substring(numbers.indexOf("5"));
        System.out.println(numbers);
        System.out.println(numbers.substring(0, numbers.indexOf("5")));
        System.out.println(numbers.substring(numbers.indexOf("5")));*/
    }

    public static boolean isValid(int[][] sudoku) {
        return row(sudoku) && column(sudoku) && cell(sudoku);
    }

    private static boolean cell(int[][] sudoku) {
        int counter = 0;
        boolean isOk = true;
        int[][] cell = new int[3][3];
        for (int i = 0; i < sudoku.length; i+=3) {
            for (int j = 0; j < sudoku.length; j+=3) {
                    fillCell(cell,sudoku,i,j);
                    isOk= checkcell(cell);
            }
            if(!isOk){
                return false;
            }
        }
        return true;
    }

    private static void fillCell(int[][] cell, int[][] sudoku, int i, int j) {
        for (int k = 0; k < cell.length; k++) {
            for (int l = 0; l < cell[k].length; l++) {
                cell[k][l]=sudoku[i+k][j+l];
            }
        }
    }

    private static boolean checkcell(int[][] cell) {
        String numbers = "123456789";
        for (int i = 0; i < cell.length; i++) {

            for (int j = 0; j < cell[i].length; j++) {
                if(!numbers.contains(""+cell[i][j])){return false;}
                numbers = numbers.substring(0, numbers.indexOf(cell[i][j] + "")) + numbers.substring(numbers.indexOf(cell[i][j] + "") + 1);
            }

        }
        if (!numbers.equals("")) {
            return false;
        }
        return true;
    }

    private static boolean column(int[][] sudoku) {

        for (int i = 0; i < sudoku.length; i++) {
            String numbers = "123456789";
            for (int j = 0; j < sudoku[i].length; j++) {
                if(!numbers.contains(""+sudoku[j][i])){return false;}
                numbers = numbers.substring(0, numbers.indexOf(sudoku[j][i] + "")) + numbers.substring(numbers.indexOf(sudoku[j][i] + "") + 1);
            }
            if (!numbers.equals("")) {
                return false;
            }
        }
        return true;
    }

    private static boolean row(int[][] sudoku) {

        for (int i = 0; i < sudoku.length; i++) {
            String numbers = "123456789";
            for (int j = 0; j < sudoku[i].length; j++) {
                if(!numbers.contains(""+sudoku[i][j])){return false;}
                numbers = numbers.substring(0, numbers.indexOf(sudoku[i][j] + "")) + numbers.substring(numbers.indexOf(sudoku[i][j] + "") + 1);
            }
            if (!numbers.equals("")) {
                return false;
            }
        }
        return true;
    }
}
/*
9 6 3 1 7 4 2 5 8
1 7 8 3 2 5 6 4 9
2 5 4 6 8 9 7 3 1
8 2 1 4 3 7 5 9 6
4 9 6 8 5 2 3 1 7
7 3 5 9 6 1 8 2 4
5 8 9 7 1 3 4 6 2
3 1 7 2 4 6 9 8 5
6 4 2 5 9 8 1 7 3
*/
/*
9 6 3 1 7 4 2 5 8
1 7 8 3 2 5 6 4 9
2 5 4 6 8 9 7 3 1
8 2 1 4 3 7 5 9 6
4 9 6 8 5 2 3 1 7
7 3 5 7 6 1 8 2 4
5 8 9 7 1 3 4 6 2
3 1 7 2 4 6 9 8 5
6 4 2 5 9 8 1 7 3
*/