package week7;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] array=new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i< array.length;i++){
            array[i]=input.nextDouble();
        }
        System.out.printf("The mean is %.2f\n",mean(array));
        System.out.printf("The standard deviation is %.5f\n",deviation(array));
    }
    public static double mean(double[] array){
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }
    public static double deviation(double[] array){
        double mean=mean(array);
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum+=Math.pow(array[i]-mean,2);
        }
        return Math.sqrt(sum/(array.length-1));
    }
}
