package week5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        boolean isPalindrome = true;
        for(int i=0,j=str.length()-1;i<(str.length()+1)/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(str+" is a "+(isPalindrome?"palindrome":"not palindrome"));
    }
}
