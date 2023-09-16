package week6;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.printf("The sum of the digits in %d is %d",number,sumDigits(number));
    }
    public static int sumDigits(long n){
        int sum=0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}
