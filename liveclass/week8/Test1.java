package week8;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] array=new double[10];
        System.out.print("Enter 10 double: ");
        for (int i = 0; i < array.length ; i++) {
            array[i]=input.nextDouble();
        }
        findSmallestElement(array);
    }

    private static void findSmallestElement(double[] array) {
        int index=0;
        double min=array[0];
        for (int i = 1; i < array.length; i++) {
            if(min>array[i]){
                min=array[i];
                index=i;
            }
        }
        System.out.printf("The minimum number is %f and its index is %d",min,index);
    }
}
