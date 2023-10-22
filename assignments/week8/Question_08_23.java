package week8;

import java.util.Scanner;

public class Question_08_23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        byte[][] matrix=new byte[6][6];
        System.out.println("Enter a 6-by-6 matrix row by row:");
        CommonMethods.takeInput(matrix);
        System.out.printf("The flipped cell is at (%d, %d)",flippedCellRow(matrix),flippedCellColumn(matrix));
    }
    public static int flippedCellColumn(byte[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int counter=0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[j][i]==1){
                    counter++;
                }
            }
            if (counter%2!=0){
                return i;
            }

        }
        return -1;
    }
    public static int flippedCellRow(byte[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            int counter=0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==1){
                    counter++;
                }
            }
            if (counter%2!=0){
                return i;
            }

        }
        return -1;
    }


}
