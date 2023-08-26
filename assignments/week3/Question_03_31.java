package week3;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        byte conversionType = input.nextByte();
        if(conversionType == 0){
            System.out.print("Enter the dollar amount: ");
            double  amount = input.nextDouble();
            System.out.print( "$" + amount + " is " + ( amount * exchangeRate ) + " yuan" );
        }
        else if (conversionType==1) {
            System.out.print("Enter the RMB amount: ");
            double amount = input.nextDouble();
            System.out.println( amount + " yuan is " + ( amount / exchangeRate ) + "$" );
        }
        else
            System.out.println("Incorrect input");
    }
}
