package week2;

import java.util.Scanner;

public class Qusetion_02_22 {

    public static void main(String[] args) {
        int money;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount as integer, for example 1156 for 11.56: ");
        money = input.nextInt();
        System.out.println("Your amount " + money + " consists of");
        System.out.println(money/100+" dollars");
        System.out.println(money%100/25+" quarters");
        System.out.println(money%25/10+" dimes");
        System.out.println(money%10/5+" nickels");
        System.out.println(money%5+" pennies");

    }
}