package week3;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {
        int number;
        boolean isPalindrome;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        number = input.nextInt();
        isPalindrome = number%10==number/100;
        if( isPalindrome )
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");
        System.out.println(number + (isPalindrome ? " is a palindrome" : " is not a palindrome"));

    }
}
