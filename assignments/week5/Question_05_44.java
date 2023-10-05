package week5;

import java.util.Scanner;

public class Question_05_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short number = input.nextShort();
        System.out.print("The bits are ");

        for (int i = 15; i >= 0; i--) {
            System.out.print((number >> i) & 1);
        }

    }
}
