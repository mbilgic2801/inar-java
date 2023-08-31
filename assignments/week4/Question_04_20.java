package week4;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userInput = input.nextLine();
        System.out.printf("Length of the String: %d ",userInput.length());
        System.out.printf("\nFirst character of the String %c ",userInput.charAt(0));
    }
}
