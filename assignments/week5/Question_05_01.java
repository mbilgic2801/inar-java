package week5;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCounter=0;
        int negativeCounter=0;
        double total=0;
        double average;


        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        if(number!=0){
            while(number!=0){
                total +=number;
                if(number<0){
                    negativeCounter += 1;
                }
                else {
                    positiveCounter += 1;
                }
                number = input.nextInt();
            }
            average = total / (positiveCounter + negativeCounter);
            System.out.printf("The number of positives is %d",positiveCounter);
            System.out.printf("\nThe number of negatives is %d",negativeCounter);
            System.out.printf("\nThe total is %.1f",total);
            System.out.printf("\nThe average is %.2f",average);
        }
        else {
            System.out.println("No numbers are entered except 0");
        }
    }
}
