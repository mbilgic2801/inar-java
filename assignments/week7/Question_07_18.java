package week7;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] array=new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i< array.length;i++){
            array[i]=input.nextDouble();
        }
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(double[] array) {
        for (int j= array.length-1; j>=0;j--) {

            for (int k = 0; k < j; k++) {
                double temp=array[k];
                if(array[k]>array[k+1]){
                    array[k]=array[k+1];
                    array[k+1]=temp;
                }

            }

        }
    }
}
