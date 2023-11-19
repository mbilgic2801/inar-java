package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Questions_11_16 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        ArrayList<Integer> answers = new ArrayList<>();
        while (number1 + number2 != answer) {

            if (answers.contains(answer)) {
                System.out.println("You already entered "+answer);
                System.out.print("Wrong answer.Try again.What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();

            }
            else {
                answers.add(answer);
                System.out.print("Wrong answer.Try again.What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();

            }
        }
        System.out.println("You got it!");
    }
}
