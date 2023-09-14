package week6;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        //base number+power = output
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number:");
        double baseNumber = input.nextDouble();
        System.out.print("Enter power: ");
        int power = input.nextInt();
        double output = 1;
        for (int i = Math.abs(power); i >= 1; i--) {
            output *= baseNumber;
        }
        if (power < 0) {
            output = 1 / output;
        }
        System.out.println("The result is " + output);
    }
}
