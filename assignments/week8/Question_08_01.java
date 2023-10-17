package week8;

import java.util.Scanner;

public class Question_08_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        CommonMethods.takeInput(matrix);
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.printf("Sum of the elements at column %d is %.1f\n", i, sumColumn(matrix, i));
        }

    }

    public static double sumColumn(double[][] matrix, int index) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][index];
        }
        return sum;
    }
}
