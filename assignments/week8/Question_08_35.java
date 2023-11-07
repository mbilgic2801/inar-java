package week8;

import java.util.Scanner;

public class Question_08_35 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of row in the matrix: ");
        int n=input.nextInt();
        byte[][] matrix=new byte[n][n];
        System.out.println("Enter the matrix row by row: ");
        CommonMethods.takeInput(matrix);
        //System.out.println(subMatrix(matrix));
    }


}
