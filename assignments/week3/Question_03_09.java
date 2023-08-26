package week3;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nineDigits;
        int lastDigit;
        String tenDigits;
        System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
        nineDigits = input.nextInt();
            tenDigits = "The ISBN-10 number is "+((nineDigits/(int)Math.pow(10,8)) + "" +
                    ((nineDigits/(int)Math.pow(10,7))%10) + "" +
                    ((nineDigits/(int)Math.pow(10,6))%10) + "" +
                    ((nineDigits/(int)Math.pow(10,5))%10) + "" +
                    ((nineDigits/(int)Math.pow(10,4))%10) + "" +
                    ((nineDigits/(int)Math.pow(10,3))%10) + "" +
                    ((nineDigits/(int)Math.pow(10,2))%10) + "" +
                    ((nineDigits/(int)Math.pow(10,1))%10) + "" +
                    ((nineDigits%10)));
            lastDigit = ( ( nineDigits /(int) Math.pow(10,8)) +
                        ( ( nineDigits /(int) Math.pow(10,7))%10) *2 +
                        ( ( nineDigits /(int) Math.pow(10,6))%10) *3 +
                        ( ( nineDigits /(int) Math.pow(10,5))%10) *4 +
                        ( ( nineDigits /(int) Math.pow(10,4))%10) *5 +
                        ( ( nineDigits /(int) Math.pow(10,3))%10) *6 +
                        ( ( nineDigits /(int) Math.pow(10,2))%10) *7 +
                        ( ( nineDigits /(int) Math.pow(10,1))%10) *8 +
                        ( ( nineDigits % 10 ) * 9 ) ) % 11;
        if(lastDigit==10)
            System.out.println(tenDigits+"X");
        else
            System.out.println(tenDigits+""+lastDigit);



    }
}
