package week3;

import java.util.Scanner;

public class Question_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte flipResult = (byte) ( Math.random()*2 );
        byte guess;
        System.out.println("Guess the flip of coin (0 represents head and 1 represent tail): ");
        guess = input.nextByte();
        if ( guess == flipResult )
            System.out.println("Your guess is correct");
        else
            System.out.println("Your guess is incorrect");
    }
}
