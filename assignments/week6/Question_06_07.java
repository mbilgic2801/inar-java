package week6;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        for(int i=1;i<=30;i++){
            System.out.printf("%d %.2f\n",i,futureInvestmentValue(amount,annualInterestRate/1200,i));
        }

    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * (Math.pow(1+monthlyInterestRate,12*years));
    }
}
