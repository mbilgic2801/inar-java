package week2;

import java.util.Scanner;

public class Question_02_07{
    public static void main(String[]args){

        int years;
        int days;
        int numberOfMinutes;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes : ");
        numberOfMinutes = input.nextInt();
        years = numberOfMinutes / ( 60 * 24 * 365 );
        days = (numberOfMinutes-years * 60 * 24 * 365) / ( 60 * 24 );
        System.out.println(numberOfMinutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}
