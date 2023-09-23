package week6;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        //System.out.printf("The approximated square root of %d is: %.1f",number,1.0*Math.round(sqrt(number)));
        System.out.printf("The approximated square root of %d is: %.1f",number,sqrt(number));

    }
    public static double sqrt(long n){
        double lastGuess=1;
        double nextGuess=(lastGuess+n/lastGuess)/2;
        while((nextGuess-lastGuess)>0.0000001){
            lastGuess=nextGuess;
            nextGuess=(lastGuess+n/lastGuess)/2;
        }
        return nextGuess;
    }
}
