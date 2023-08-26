package week3;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Question_03_26 {
    public static void main(String[] args) {
        int number;
        boolean isDivisibleByFive;
        boolean isDivisibleBySix;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        isDivisibleByFive = ( number % 5 == 0 );
        isDivisibleBySix = ( number % 6 == 0 );
        System.out.println("Is " + number + " divisible by 5 and 6? " + ( isDivisibleByFive && isDivisibleBySix ) );
        System.out.println("Is " + number + " divisible by 5 or 6? " + ( isDivisibleByFive || isDivisibleBySix ) );
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + ( isDivisibleByFive ^ isDivisibleBySix ) );

    }
}
