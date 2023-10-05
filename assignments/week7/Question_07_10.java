package week7;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] array=new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i< array.length;i++){
            array[i]=input.nextDouble();
        }
        double min=Question_07_09.min(array);
        System.out.printf("The minimum number is %.1f index %d",min,indexOfSmallestElement(array,min));
    }
    public static int indexOfSmallestElement(double[] array,double min){

        for(int i=0;i<array.length;i++){
            if(array[i]==min){
                return i;
            }
        }
        return -1;
    }
}
