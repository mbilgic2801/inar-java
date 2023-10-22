package week8;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int row= input.nextInt();
        int column=input.nextInt();
        double[][] matrix=new double[row][column];
        System.out.println("Enter the array:");
        CommonMethods.takeInput(matrix);
        System.out.println("The location of the largest element is at "+locationOfLargest(matrix));
    }

    private static String locationOfLargest(double[][] matrix) {
        int indexRow=0;
        int indexColumn=0;
        double max=matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                    indexRow=i;
                    indexColumn=j;
                }
            }
        }
        return "("+indexRow+","+indexColumn+")";
    }
}

