package week4;

import java.util.Scanner;

public class Question_04_26 {
    public static void main(String[] args) {
    // get input as a string "19.56"
    // divide them into smaller pieces
        // give output
        Scanner input = new Scanner(System.in);
        int dollar;
        int quarter;
        int dime;
        int nickel;
        int penny;
        int remaining;
        System.out.print("Enter the amount in dollars and cents: ");
        String amount = input.next();
        double amountOfMoney = Double.parseDouble(amount);
        remaining = (int) (amountOfMoney*100);
        dollar = remaining/100;
        remaining=remaining-100*dollar;
        quarter = remaining/25;
        remaining=remaining-25*quarter;
        dime=remaining/10;
        remaining =remaining-10*dime;
        nickel= remaining/5;
        remaining=remaining-5*nickel;
        penny = remaining;
        System.out.printf("Equivalent in Monetary Units: \nDollars: %d\nQuarters: %d\nDimes: %d\nNickels: %d\nPennies: %d",
                            dollar,quarter,dime,nickel,penny);



    }
}
