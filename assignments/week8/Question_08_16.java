package week8;

import java.util.Scanner;

public class Question_08_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}, {4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}, {4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        int[][] matrix2 = new int[6][2];
        // CommonMethods.takeInput(matrix);
        CommonMethods.printArray(matrix);
        System.out.println("***********");
        sort(matrix);
        CommonMethods.printArray(matrix);
    }

    public static void sort(int[][] matrix) {
        int[] temp = new int[matrix[0].length];
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i; j < matrix.length - 1; j++) {
                if (matrix[j][0] > matrix[j + 1][0]) {
                    temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j][0] == matrix[j + 1][0] && matrix[j][1] > matrix[j + 1][1]) {
                    temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }
    }
}
