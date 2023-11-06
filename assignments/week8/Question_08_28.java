package week8;

import java.util.Scanner;

public class Question_08_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        System.out.print("Enter list1:");
        CommonMethods.takeInput(matrix1);
        System.out.print("Enter list2:");
        CommonMethods.takeInput(matrix2);
        System.out.printf("The two arrays are%s strictly identical", isStrictlyIdentical(matrix1, matrix2) ? "" : " not");
    }

    private static boolean isStrictlyIdentical(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
