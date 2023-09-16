package week5;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
Number 153:
The number has 3 digits, so n = 3.
The individual digits are 1, 5, and 3.
Each digit raised to the power of 3 and then summed up: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.

370:
3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370

371:
3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371

407:
4^3 + 0^3 + 7^3 = 64 + 0 + 343 = 407
 */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        String textNumber = "" + number;
        int controlValue = 0;

        for (int i = 0; i < textNumber.length(); i++) {
            controlValue += (int) Math.pow(Integer.parseInt("" + textNumber.charAt(i)), textNumber.length());
        }
        if (number == controlValue) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }

}
