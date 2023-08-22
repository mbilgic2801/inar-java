package week3;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[] args) {
        int randomNumberA = (int) (Math.random() * 100);
        int randomNumberB = (int) (Math.random() * 100);

        int sum = randomNumberA + randomNumberB;
        int answer;
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + randomNumberA + " + " + randomNumberB +" = ?" );
        answer = input.nextInt();
        if(answer==sum)
            System.out.println("You are correct !");
        else
            System.out.println("You are wrong ! " + randomNumberA + " + " + randomNumberB +" should be " + sum);
    }
}
