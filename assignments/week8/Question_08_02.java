package week8;

import java.util.Scanner;

public class Question_08_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        CommonMethods.takeInput(matrix);
        System.out.printf("Sum of thr elements in the major diagonal is %.1f", sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
