package week5;

import java.sql.Time;
import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        //generating 10 addition problems
        Scanner input = new Scanner(System.in);
        String output = "";
        int number1;
        int number2;
        int tempAnswer;
        int correctCounter=0;
        long initialtime = System.currentTimeMillis();
        for(int i=0;i<10;i++) {
            number1 = (int) (Math.random() * 15 + 1);
            number2 = (int) (Math.random() * 15 + 1);

            System.out.printf("What is %d + %d? ", number1, number2);
            if ((tempAnswer=input.nextInt()) == (number1 + number2)) {
                System.out.println("You are correct!");
                correctCounter += 1;
                output = output + number1 + "+" + number2 + "=" + tempAnswer + " correct\n";
            } else {
                System.out.printf("Your answer is wrong.\n%d + %d should be %d\n", number1, number2, (number1 + number2));
                output = output + number1 + "+" + number2 + "=" + tempAnswer + " wrong\n";
            }

        }
        int testTime = (int )((System.currentTimeMillis()-initialtime)/1000);
        System.out.printf( "\nCorrect count is %d", correctCounter );
        System.out.printf( "\nTest time is %d seconds", testTime );
        System.out.print("\n\n"+output);

    }
}
