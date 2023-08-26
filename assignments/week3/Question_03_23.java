package week3;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();
        if( pointX <= 5 && pointX >= -5 && pointY <= 2.5 && pointY >= -2.5 )
            System.out.println("Point (" + pointX + ", " + pointY + ") is in the rectangle.");
        else
            System.out.println("Point (" + pointX + ", " + pointY + ") is not in the rectangle.");
    }
}
