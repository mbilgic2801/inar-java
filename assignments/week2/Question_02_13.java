package week2;

import java.util.Scanner;

public class Question_02_13 {

    public static void main(String[] args) {
        double savingAmount;
        double interestRate = 0.05 / 12;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        savingAmount = input.nextDouble();
        savingAmount = savingAmount + savingAmount * interestRate + 100;
        savingAmount = savingAmount + savingAmount * interestRate + 100;
        savingAmount = savingAmount + savingAmount * interestRate + 100;
        savingAmount = savingAmount + savingAmount * interestRate + 100;
        savingAmount = savingAmount + savingAmount * interestRate + 100;
        savingAmount = savingAmount + savingAmount * interestRate;
        System.out.println("After the sixth month, the account value is $" + savingAmount);
    }
}