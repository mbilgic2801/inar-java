package week3;

import java.util.Scanner;

public class Question_03_29 {
    public static void main(String[] args) {

            double distanceBetweenCenters;
            boolean isFirstBigger;
            Scanner input = new Scanner(System.in);

            System.out.print("Enter circle1's x-, and y-coordinates, and radius: ");
            double firstCircleX = input.nextDouble();
            double firstCircleY = input.nextDouble();
            double firstCircleRadius = input.nextDouble();

            System.out.print("Enter circle2's x-, and y-coordinates, and radius: ");
            double secondCircleX = input.nextDouble();
            double secondCircleY = input.nextDouble();
            double secondCircleRadius = input.nextDouble();

            distanceBetweenCenters = Math.sqrt(Math.pow((secondCircleX - firstCircleX), 2)
                    + Math.pow((secondCircleY - firstCircleY), 2));
            System.out.println("distance between centers: " + distanceBetweenCenters);
            isFirstBigger = firstCircleRadius > secondCircleRadius;
            double bigRadius = isFirstBigger ? firstCircleRadius : secondCircleRadius;
            double smallRadius = isFirstBigger ? secondCircleRadius : firstCircleRadius;
            if (distanceBetweenCenters > (firstCircleRadius + secondCircleRadius))
                System.out.println("Circle2 does not overlap circle1");
            else if (distanceBetweenCenters + smallRadius <  bigRadius )
                System.out.println(isFirstBigger ? "Circle2 is inside circle1" : "Circle1 is inside circle2");
            else
                System.out.println("Circle2 overlaps circle1");
    }

}

