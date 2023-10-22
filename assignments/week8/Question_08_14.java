package week8;

import java.util.Scanner;

public class Question_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        byte[][] matrix = new byte[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (byte) (Math.random() * 2);
            }
        }
        CommonMethods.printArray(matrix);
        rowSameNumbers(matrix);
        columnSameNumber(matrix);
        majorDiagonalSameNumber(matrix);
        subDiagonalSameNumber(matrix);
    }
    private static void subDiagonalSameNumber(byte[][] matrix) {
        int zeroCounter = 0;
        int oneCounter = 0;
        boolean isAllDifferent = true;
        for (int i = 0,j= matrix.length-1; i < matrix.length; i++,j--) {
            if(matrix[i][j]==0){
                zeroCounter++;
            }
            if(matrix[i][j]==1){
                oneCounter++;
            }

        }
        if (zeroCounter == matrix.length) {
            System.out.println("All 0s on sub diagonal ");
            isAllDifferent = false;
        }
        if (oneCounter == matrix.length) {
            System.out.println("All 1s on sub diagonal ");
            isAllDifferent = false;
        }
        if (isAllDifferent) {
            System.out.println("No same numbers on sub diagonal");
        }
    }
    private static void majorDiagonalSameNumber(byte[][] matrix) {
        int zeroCounter = 0;
        int oneCounter = 0;
        boolean isAllDifferent = true;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][i]==0){
                zeroCounter++;
            }
            if(matrix[i][i]==1){
                oneCounter++;
            }

        }
        if (zeroCounter == matrix.length) {
            System.out.println("All 0s on major diagonal ");
            isAllDifferent = false;
        }
        if (oneCounter == matrix.length) {
            System.out.println("All 1s on major diagonal ");
            isAllDifferent = false;
        }
        if (isAllDifferent) {
            System.out.println("No same numbers on major diagonal");
        }
    }
    private static void columnSameNumber(byte[][] matrix) {
        boolean isAllDifferent = true;
        for (int i = 0; i < matrix.length; i++) {
            int zeroCounter = 0;
            int oneCounter = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 0) {
                    zeroCounter++;
                }
                if (matrix[j][i] == 1) {
                    oneCounter++;
                }
            }
            if (zeroCounter == matrix.length) {
                System.out.println("All 0s on column " + i);
                isAllDifferent = false;
            }
            if (oneCounter == matrix.length) {
                System.out.println("All 1s on column " + i);
                isAllDifferent = false;
            }
        }
        if (isAllDifferent) {
            System.out.println("No same numbers on a column");
        }
    }
    private static void rowSameNumbers(byte[][] matrix) {
        boolean isAllDifferent = true;
        for (int i = 0; i < matrix.length; i++) {
            int zeroCounter = 0;
            int oneCounter = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroCounter++;
                }
                if (matrix[i][j] == 1) {
                    oneCounter++;
                }
            }
            if (zeroCounter == matrix.length) {
                System.out.println("All 0s on row " + i);
                isAllDifferent = false;
            }
            if (oneCounter == matrix.length) {
                System.out.println("All 1s on row " + i);
                isAllDifferent = false;
            }
        }
        if (isAllDifferent) {
            System.out.println("No same numbers on a row");
        }
    }

}
