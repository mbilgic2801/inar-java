package week9;

import week8.CommonMethods;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row=input.nextInt();
        int column=input.nextInt();
        double[][] array=new double[row][column];
        System.out.println("Enter the array");
        CommonMethods.takeInput(array);
        Location_09_13 loc=locateLargest(array);
        System.out.printf("The location of the largest element is %.1f at (%d,%d)",loc.maxValue,loc.row,loc.column);

    }

    public static Location_09_13 locateLargest(double[][] array) {
        Location_09_13 a=new Location_09_13();
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if(array[i][j]>a.maxValue){
                    a.setMaxValue(array[i][j]);
                    a.setRow(i);
                    a.setColumn(j);
                }
            }
        }
        return a;
    }
}
