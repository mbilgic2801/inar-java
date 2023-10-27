package week8;

import week7.Question_07_18;

public class Question_08_27 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        System.out.print("Enter a 3-by-3 matrix row by row:");
        CommonMethods.takeInput(matrix);
        sortColumns(matrix);
        System.out.println("The row-sorted array is");
        CommonMethods.printArray(matrix);
    }

    public static void sortColumns(double[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            double[] temp = new double[matrix[0].length];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = matrix[j][i];
            }
            Question_07_18.bubbleSort(temp);
            for (int j = 0; j < temp.length; j++) {
                matrix[j][i] = temp[j];
            }
        }
    }
}
