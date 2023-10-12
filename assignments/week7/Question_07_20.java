package week7;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] array=new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < array.length ; i++) {
            array[i]=input.nextDouble();
        }
        reviseSelectionSort(array);
        printArray(array);
    }
    public static void printArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
    }
    public static void reviseSelectionSort(double[] array) {
        for (int i = array.length-1; i>=0 ; i--) {
            double max=array[i];
            double temp;
            int indexMax=i;
            for (int j = i-1; j >=0 ; j--) {
                if(max<array[j]){
                    max=array[j];
                    indexMax=j;
                }
            }
            temp=array[i];
            array[i]=array[indexMax];
            array[indexMax]=temp;
        }
    }
}
