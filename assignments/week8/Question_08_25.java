package week8;

import java.util.Scanner;

public class Question_08_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row:");
        CommonMethods.takeInput(matrix);
        System.out.printf("It is%s a Markov matrix", (isMarkov(matrix) ? "" : " not"));
    }

    private static boolean isMarkov(double[][] matrix) {
        return isAllPositive(matrix) && isAllColumnsOne(matrix);
    }

    private static boolean isAllColumnsOne(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            if (sum != 1.0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAllPositive(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
/*
0,15 0,875 0,375
0,55 0,005 0,225
0,30 0,12  0,4
 */
/*
0,15 0,875 0,375
0,55 0,005 0,225
0,30 -0,12  0,4
 */
/*
0,15 0,875 0,375
0,55 0,015 0,225
0,30 0,12  0,4
 */