package week2;

import java.util.Scanner;

public class Question_02_11 {

    public static void main(String[] args){
        int currentPopulation = 312032486;
        int year;
        int secondInYear = 365 * 24 * 60 * 60;
        double yearlyDifference = secondInYear / 7.0 + secondInYear / 45.0 - secondInYear / 13.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        year = input.nextInt();

        System.out.println("The population in " + year + " years is " + Math.round(currentPopulation+year*yearlyDifference));
    }
}