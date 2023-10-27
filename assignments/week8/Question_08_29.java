package week8;

import week7.Question_07_18;

import java.util.Scanner;

public class Question_08_29 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] matrix1=new int[3][3];
        int[][] matrix2=new int[3][3];
        System.out.print("Enter list1:");
        CommonMethods.takeInput(matrix1);
        System.out.print("Enter list2:");
        CommonMethods.takeInput(matrix2);
        System.out.printf("The two arrays are%s identical",isIdentical(matrix1,matrix2)?"":" not");
    }

    private static boolean isIdentical(int[][] matrix1, int[][] matrix2) {
        int[] tempMatrix1=new int[matrix1.length*matrix1[0].length];
        int[] tempMatrix2=new int[matrix1.length*matrix1[0].length];
        int counter=0;
        for (int i = 0; i <matrix1.length ; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                tempMatrix1[counter]=matrix1[i][j];
                tempMatrix2[counter]=matrix2[i][j];
                counter++;
            }
        }
        CommonMethods.bubbleSort(tempMatrix1);
        CommonMethods.bubbleSort(tempMatrix2);
        for (int i = 0; i < tempMatrix1.length; i++) {
            if(tempMatrix1[i]!=tempMatrix2[i]){
                return false;
            }
        }
        return  true;
    }
}
