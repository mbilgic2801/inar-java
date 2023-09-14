package week5;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        //1 2 3 4,5 5,6 6 7 8 9 10
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum=0;
        double mean;
        double sumOfDeviations=0;
        double standardDeviation;
        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++){
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        mean = sum/10;
        for(int j=0;j<10;j++){
            sumOfDeviations +=Math.pow(numbers[j]-mean,2);
        }
        standardDeviation = Math.sqrt(sumOfDeviations/9);
        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %.5f",standardDeviation);

    }
}
