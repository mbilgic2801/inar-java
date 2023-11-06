package week8;

import java.util.Scanner;

public class Question_08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = input.nextInt();
        System.out.print("Enter column number: ");
        int column = input.nextInt();
        System.out.println("Fill the matrix: ");
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 4);
            }
        }
        CommonMethods.printArray(matrix);
        //CommonMethods.takeInput(matrix);
        System.out.printf("Matrix has%s consecutive four numbers", (isConsecutiveFour(matrix)) ? "" : " not");
    }

    public static boolean isConsecutiveFour(int[][] matrix) {
        boolean a = checkRows(matrix);
        boolean b = checkColumns(matrix);
        boolean c = checkDiagonal(matrix);
        return a || b || c;
    }

    public static boolean checkDiagonal(int[][] matrix) {
        boolean check = false;
        for (int i = 0; i < matrix.length - 3; i++) {
            for (int j = 0; j < matrix.length - 3; j++) {
                int a = matrix[i][j];
                if (matrix[i + 1][j + 1] == a && matrix[i + 2][j + 2] == a && matrix[i + 3][j + 3] == a) {
                    System.out.printf("major diagonal consecutive (%d , %d) to (%d , %d)\n", i, j, i + 3, j + 3);
                    check = true;

                }

            }
        }
        for (int i = 0; i < matrix.length - 3; i++) {
            for (int j = 3; j < matrix.length; j++) {
                int a = matrix[i][j];
                if (matrix[i + 1][j - 1] == a && matrix[i + 2][j - 2] == a && matrix[i + 3][j - 3] == a) {
                    System.out.printf("sub diagonal consecutive (%d , %d) to (%d , %d)\n", i, j, i + 3, j - 3);
                    check = true;
                }

            }
        }
        return check;
    }

    public static boolean checkColumns(int[][] matrix) {
        for (int i = 0; i < matrix[0].length - 3; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int a = matrix[i][j];
                if (matrix[i + 1][j] == a && matrix[i + 2][j] == a && matrix[i + 3][j] == a) {
                    System.out.printf("column consecutive (%d , %d) to (%d , %d)\n", i, j, i + 3, j);
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean checkRows(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length - 3; j++) {
                int a = matrix[i][j];
                if (matrix[i][j + 1] == a && matrix[i][j + 2] == a && matrix[i][j + 3] == a) {
                    System.out.printf("row consecutive (%d , %d) to (%d , %d)\n", i, j, i, j + 3);
                    return true;
                }
            }
        }
        return false;
    }

}
