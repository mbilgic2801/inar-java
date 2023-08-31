package week4;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String allHexDigits = "0123456789ABCDEF";
        System.out.print("Enter a hex digit: ");
        String hexDigit = input.next();
        String binaryValue;
        if(!allHexDigits.contains(hexDigit))
            System.out.println(hexDigit + " is an invalid input");
        else {
            binaryValue = Integer.toBinaryString(allHexDigits.indexOf(hexDigit));
            System.out.println("The binary value is " + binaryValue);
        }
    }
}
