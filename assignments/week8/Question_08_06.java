package week8;

import java.util.Scanner;

public class Question_08_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.print("Enter matrix1: ");
        CommonMethods.takeInput(matrix1);
        System.out.print("Enter matrix2: ");
        CommonMethods.takeInput(matrix2);
        double[][] multipliedMatrix = multiplyMatrix(matrix1, matrix2);
        System.out.println("The matrices are added as follows");
        printOperation(matrix1, matrix2, multipliedMatrix);
    }

    private static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] multipliedMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    multipliedMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multipliedMatrix;
    }

    public static void printOperation(double[][] matrix1, double[][] matrix2, double[][] sumOfMatrix) {

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.printf("%-4.1f ", matrix1[i][j]);
            }
            System.out.printf("  %-4s  ", (i == matrix1.length / 2) ? "*" : " ");
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.printf("%4.1f ", matrix2[i][j]);
            }
            System.out.printf("  %-4s  ", (i == matrix1.length / 2) ? "=" : " ");
            for (int j = 0; j < sumOfMatrix[0].length; j++) {
                System.out.printf("%4.1f ", sumOfMatrix[i][j]);
            }
            System.out.println();

        }
    }
}
