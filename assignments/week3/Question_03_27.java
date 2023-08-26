package week3;

import java.util.Scanner;

public class Question_03_27 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a point's x- and y-coordinates: ");
            double pointX = input.nextDouble();
            double pointY = input.nextDouble();
            if ((pointX >= 0) && (pointY >= 0) && ((pointX + 2 * pointY) <= 200))
                System.out.println("The point is in the triangle");
            else
                System.out.println("The point is not in the triangle");

    }
}
