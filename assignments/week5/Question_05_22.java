package week5;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interestRate = input.nextDouble();
        double monthlyPayment = ( loanAmount * interestRate/1200 ) / ( 1 - ( 1 / ( Math.pow( 1 + interestRate/1200 , numberOfYears * 12))));
        System.out.printf("Monthly Payment: %.2f\n",monthlyPayment);


        double monthlyInterestRate = interestRate / 1200;
        double principal;
        double balance = loanAmount;
        double interest;
        System.out.println("Payment# Interest Principal Balance");
        for (int i=1;i<=12*numberOfYears;i++){
            interest=monthlyInterestRate*balance;
            principal=monthlyPayment-interest;
            balance = balance - principal;
            System.out.printf("%-9d%-9.2f%-10.2f%.2f\n",i,interest,principal,balance);

        }
    }
}
