package week7;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] arrayOfDoubles=new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i< arrayOfDoubles.length;i++){
            arrayOfDoubles[i]=input.nextDouble();
        }
        System.out.println("The minimum number is: "+min(arrayOfDoubles));
    }
    public static double min(double[] array){
        double min=array[0];
        for(int i=1;i<array.length;i++){
            min=Math.min(min,array[i]);
        }
        return min;
    }
}
