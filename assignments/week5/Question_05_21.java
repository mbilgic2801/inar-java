package week5;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years: ");
        int loanPeriod = input.nextInt();
        System.out.println("Interest Rate     Monthly Payment     Total Payment"  );
        for(double interestRate = 0.05;interestRate<0.08125;interestRate+=0.00125 ){
            double monthlyPayment=0;
            double totalPayment=0;
            monthlyPayment = ( loanAmount * interestRate/12 ) / ( 1 - ( 1 / ( Math.pow( 1 + interestRate/12 , loanPeriod * 12))));
            totalPayment = monthlyPayment * loanPeriod * 12;
            System.out.printf("%.3f%%    %14.2f    %18.2f\n",interestRate*100,monthlyPayment,totalPayment);
        }


    }
}
