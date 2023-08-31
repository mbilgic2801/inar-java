package week4;

import java.util.Scanner;

public class Question_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0-15): ");

        byte decimalValue = input.nextByte();
        String hexValue ="";
        if (decimalValue < 0 || decimalValue > 15)
            System.out.printf("%d is an invalid input", decimalValue);
        else {

            if(decimalValue==10)
                hexValue = "A";
            else if(decimalValue==11)
                hexValue = "B";
            else if(decimalValue==12)
                hexValue = "C";
            else if(decimalValue==13)
                hexValue = "D";
            else if(decimalValue==14)
                hexValue = "E";
            else if(decimalValue==15)
                hexValue = "F";
            else
                hexValue ="" + decimalValue;
            System.out.println("The hex value is " + hexValue);
        }


    }
}
