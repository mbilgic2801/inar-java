package week5;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int asciiCode = input.nextInt();
        char character = (char) asciiCode;
        System.out.printf("The character for ASCII code %d is %c", asciiCode, character);
    }
}
