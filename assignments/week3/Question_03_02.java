package week3;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_03_02 {
    public static void main(String[] args) {
        int a, b, c;
        int sum;
        boolean isAnswerCorrect;
        Scanner input = new Scanner(System.in);

        a = (int)(Math.random() * 10);
        b = (int)(Math.random() * 10);
        c = (int)(Math.random() * 10);

        System.out.println("What is " + a + " + " + b + " + " + c + " = ? ");
        sum = input.nextInt();

        isAnswerCorrect = sum == ( a + b + c );

        System.out.println(a + " + " + b + " + " + c + " = " + sum + " is " + isAnswerCorrect);


    }
}
