package week5;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monthlyInvest;
        double moneyInAccount=0;
        double annualInterestRate;
        double monthlyInterestRate;
        int numberOfMonths;
        System.out.print("Enter an amount (e.g., 100): ");
        monthlyInvest = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        annualInterestRate = input.nextDouble();
        monthlyInterestRate = annualInterestRate / 1200;
        System.out.print("Enter the number of months (e.g., 6): ");
        numberOfMonths = input.nextInt();
        for(int i=0;i<numberOfMonths;i++){
            moneyInAccount += monthlyInvest;
            moneyInAccount *= (1+monthlyInterestRate);
        }
        System.out.printf("Amount in savings account after %d is $%.2f",numberOfMonths,moneyInAccount);

    }
}
