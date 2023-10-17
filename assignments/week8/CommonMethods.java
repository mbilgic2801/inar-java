package week8;

import java.util.Scanner;

public class CommonMethods {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int combination(int n ,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static double distance3D(double[] point1,double[] point2){
        return Math.sqrt(Math.pow(point1[0]-point2[0],2)+Math.pow(point1[1]-point2[1],2)+Math.pow(point1[2]-point2[2],2));
    }
    public static double distance2D(double[] point1,double[] point2){
        return Math.sqrt(Math.pow(point1[0]-point2[0],2)+Math.pow(point1[1]-point2[1],2));
    }
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printArray(double[][] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void takeInput(int[][] matrix){
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix[i][j]=input.nextInt();
            }
        }
    }
    public static void takeInput(double[][] matrix){
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                matrix[i][j]=input.nextDouble();
            }
        }
    }
    public static void orderScores(int[][] scores) {
        int[] temp = new int[2];
        for (int j = 0; j < scores.length; j++) {
            for (int i = j; i < scores.length; i++) {
                if (scores[j][1] > scores[i][1]) {
                    temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }

    }
}
