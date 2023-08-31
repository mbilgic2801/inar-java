package week4;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String number2 = "ABCabc";
        final String number3 = "DEFdef";
        final String number4 = "GHIghi";
        final String number5 = "JKLjkl";
        final String number6 = "MNOmno";
        final String number7 = "PQRSpqrs";
        final String number8 = "TUVtuv";
        final String number9 = "WXYZwxyz";

        System.out.print("Enter a lettee: ");
        char letter = input.next().charAt(0);
        if(number2.contains(Character.toString(letter)))
            System.out.println("The corresponding number is 2");
        else if(number3.contains(Character.toString(letter)))
            System.out.println("The corresponding number is 3");
        else if(number4.contains(Character.toString(letter)))
            System.out.println("The corresponding number is 4");
        else if(number5.contains(Character.toString(letter)))
            System.out.println("The corresponding number is 5");
        else if(number6.contains(Character.toString(letter)))
            System.out.println("The corresponding number is 6");
        else if(number7.contains(Character.toString(letter)))
            System.out.println("The corresponding number is 7");
        else if(number8.contains(Character.toString(letter)))
            System.out.println("The corresponding number is 8");
        else if(number9.contains(Character.toString(letter)))
            System.out.println("The corresponding number is 9");
        else
            System.out.println(letter+" is an invalid input");

    }
}
