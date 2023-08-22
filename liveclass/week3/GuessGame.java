package week3;

import java.util.Scanner;

public class GuessGame{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random()*100);
        boolean even = true;
        while (even){

            System.out.println("Guess a number: ");
            int guess = input.nextInt();
            if (guess > a)
                System.out.println("reduce your number");
            else if (guess < a)
                System.out.println("increase your number");
            else {
                System.out.println("congrast");
                even = false;
            }
        }
    }

}
