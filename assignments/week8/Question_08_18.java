package week8;

import week8.CommonMethods;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] matrix={{1,2},{3,4},{5,6},{7,8},{9,10}};
        CommonMethods.printArray(matrix);
        System.out.println("***********");
        shuffle(matrix);
        CommonMethods.printArray(matrix);
    }
    public static void shuffle(int[][] matrix){
        int n= matrix.length;
        for (int i=0;i<n;i++) {
            int index1 = (int) (Math.random() * n);
            int index2 = (int) (Math.random() * n);
            replace(matrix, index1, index2);
        }
    }
    public static void replace(int[][] matrix,int index1,int index2){
        int[] temp=matrix[index1];
        matrix[index1]=matrix[index2];
        matrix[index2]=temp;
    }
}
