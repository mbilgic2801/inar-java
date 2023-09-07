package week5;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        //finding the greatest common divisor
        //get two integer
        // find the minimum one
        Scanner input = new Scanner(System.in);
        int greatCommonDivisor = 1;
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        int minNumber = Math.min(number1,number2);
        int maxNumber = Math.max(number1,number2);
        for(int i = minNumber ; i >= 1 ; i--){
                if( minNumber % i == 0 && maxNumber % i == 0 ){
                    if( greatCommonDivisor < minNumber ){
                        greatCommonDivisor *= i;
                    }
                }
        }

        System.out.printf("The greatest common divisor for %d and %d is %d",maxNumber,minNumber,greatCommonDivisor);

    }
}
