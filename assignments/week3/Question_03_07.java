package week3;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        double amountOfMoney;
        int remainingAmount;
        int dollar;
        int quarter;
        int dime;
        int nickel;
        int penny;
        String dollars = " dollars";
        String quarters = " quarters";
        String dimes = " dimes";
        String nickels = " nickels";
        String pennies = " pennies";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount (e.g 11.56) : ");
        amountOfMoney = input.nextDouble();
        remainingAmount =(int) (amountOfMoney * 100);
        dollar = (int) amountOfMoney;
        if( dollar == 1 ) dollars = " dollar";
        remainingAmount = remainingAmount - dollar * 100;
        quarter = remainingAmount / 25;
        if ( quarter == 1 ) quarters = " quarter";
        remainingAmount = remainingAmount - quarter * 25;
        dime = remainingAmount / 10;
        if ( dime == 1 ) dimes = " dime";
        remainingAmount = remainingAmount - dime * 10;
        nickel = remainingAmount / 5;
        if ( nickel == 1 ) nickels = " nickel";
        remainingAmount = remainingAmount - nickel * 5;
        penny = remainingAmount;
        if ( penny == 1 ) pennies = " penny";
        System.out.println("Your amount " + amountOfMoney + " consist of");
        System.out.println( dollar + dollars );
        System.out.println( quarter + quarters );
        System.out.println( dime + dimes );
        System.out.println( nickel + nickels );
        System.out.println( penny + pennies );


    }
}
