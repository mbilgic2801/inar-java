package week3;

import java.util.Scanner;

public class Question_03_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double pointZeroX = input.nextDouble();
        double pointZeroY = input.nextDouble();
        double pointOneX = input.nextDouble();
        double pointOneY = input.nextDouble();
        double pointTwoX = input.nextDouble();
        double pointTwoY = input.nextDouble();
        String pointZero = "("+pointZeroX+", "+pointZeroY+")";
        String pointOne = "("+pointOneX+", "+pointOneY+")";
        String pointTwo = "("+pointTwoX+", "+pointTwoY+")";
        if((pointTwoY-pointOneY)/(pointTwoX-pointOneY) == (pointOneY-pointZeroY)/(pointOneX-pointZeroX))
            System.out.println( pointTwo + " is on the line segment from " + pointZero + " to " + pointOne );
        else
            System.out.println( pointTwo + " is not on the line segment from " + pointZero + " to " + pointOne );


    }
}
