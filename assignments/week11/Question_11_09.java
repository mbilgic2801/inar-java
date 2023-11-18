package week11;


import week8.CommonMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        byte[][] matrix = new byte[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (byte) (Math.random() * 2);
            }
        }
        CommonMethods.printArray(matrix);
        most1s(rows, columns, matrix, n);
        System.out.println("The largest row index: "+rows.toString());
        System.out.println("The largest column index: "+columns.toString());
    }

    public static void most1s(ArrayList<Integer> rows, ArrayList<Integer> columns, byte[][] matrix, int n) {

        int rowMax = 0;
        int colMax = 0;
        for (int i = 0; i < n; i++) {
            int rowOneCounter = 0;
            int colOneCounter = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    rowOneCounter++;
                }
                if (matrix[j][i] == 1) {
                    colOneCounter++;
                }
            }
            if (rowOneCounter > rowMax) {
                rowMax = rowOneCounter;
            }
            if (colOneCounter > colMax) {
                colMax = colOneCounter;
            }
        }
        for (int i = 0; i <n; i++) {
            int rowOneCounter = 0;
            int colOneCounter = 0;
            for (int j = 0; j <n; j++) {
                if (matrix[i][j] == 1) {
                    rowOneCounter++;
                }
                if (matrix[j][i] == 1) {
                    colOneCounter++;
                }
            }
            if (rowOneCounter == rowMax) {
                rows.add(i);
            }
            if (colOneCounter==colMax){
                columns.add(i);
            }
        }


    }

}



