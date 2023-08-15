package week2;

import java.util.Scanner;

public class Qusetion_02_21 {

    public static void main(String[] args) {
       double investmentAmount;
       double annualInterestRate;
       int year;
       double futureInvestmentValue;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter investment amount: ");
       investmentAmount = input.nextDouble();
       System.out.print("Enter annual interest rate in percentage: ");
       annualInterestRate = input.nextDouble();
       System.out.print("Enter number of years: ");
       year = input.nextInt();
       futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate / 1200 ) , (year * 12));
       System.out.println("Accumulated value is $" + futureInvestmentValue);

    }
}