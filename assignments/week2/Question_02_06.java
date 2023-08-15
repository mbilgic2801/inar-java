package week2;

import java.util.Scanner;

public class Question_02_06{
    public static void main(String[]args){

        int totalOfDigits;
        int number;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        number = input.nextInt();
        totalOfDigits = number % 10 + number / 100 + (number / 10) % 10;
        System.out.println("The sum of the digits  is " + totalOfDigits);
    }
}
