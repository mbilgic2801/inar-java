package week4;

import java.util.Scanner;

public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        int unicodeOfChar = (int) character;
        System.out.printf("The unicode for the character %c is %d", character, unicodeOfChar);
    }
}
