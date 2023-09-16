package week6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.printf("%d is%s a palindrome.",number,(isPalindrome(reverse(number))?"":" not"));
    }
    public static int reverse(int number){
        String str=""+number;
        String newStr="";
        for(int i=str.length()-1;i>=0;i--){
            newStr += str.charAt(i);
        }
        return Integer.parseInt(newStr);
    }
    public static boolean isPalindrome(int number){
        return number==reverse(number);
    }
}
