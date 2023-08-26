package week3;

import java.util.Scanner;

public class Question_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();
        if(Math.pow((Math.pow(pointX,2)+Math.pow(pointY,2)),0.5)>10)
            System.out.println("Point (" + pointX + ", " + pointY + ") is not in the circle.");
        else
            System.out.println("Point (" + pointX + ", " + pointY + ") is in the circle.");
    }
}
