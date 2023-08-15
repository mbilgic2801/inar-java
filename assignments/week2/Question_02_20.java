package week2;

import java.util.Scanner;

public class Question_02_20 {

    public static void main(String[] args) {
        double balance;
        double annualInterestRate;
        double interest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = input.nextDouble();
        annualInterestRate = input.nextDouble();
        interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is " + interest);
    }
}