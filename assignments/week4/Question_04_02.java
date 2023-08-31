package week4;

import java.util.Scanner;

public class Question_04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double radiusOfEarth = 6371.01;
        System.out.print("Enter point 1 (latitude and longitude): ");
        double pointOneX = Math.toRadians(input.nextDouble());
        double pointOneY = Math.toRadians(input.nextDouble());
        System.out.print("Enter point 2 (latitude and longitude): ");
        double pointTwoX = Math.toRadians(input.nextDouble());
        double pointTwoY = Math.toRadians(input.nextDouble());
//d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        double greatCircleDistance = radiusOfEarth * Math.toDegrees( Math.acos(( Math.sin(pointOneX) * Math.sin(pointTwoX)
                                                                                +Math.cos(pointOneX)*Math.cos(pointOneY)*Math.cos(pointOneY-pointTwoY))));
        System.out.println("The distance between two point is " + greatCircleDistance);
    }
}
