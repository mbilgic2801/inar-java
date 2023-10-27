package week8;

import week7.Question_07_18;



public class Question_08_26 {
    public static void main(String[] args) {

        double[][] matrix=new double[3][3];
        System.out.print("Enter a 3-by-3 matrix row by row:");
        CommonMethods.takeInput(matrix);
        sortRows(matrix);
        System.out.println("The row-sorted array is");
        CommonMethods.printArray(matrix);
    }

    public static void sortRows(double[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            Question_07_18.bubbleSort(matrix[i]);
        }

    }
}
