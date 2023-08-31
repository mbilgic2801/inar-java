package week4;

import java.util.Scanner;

public class Question_04_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 40;
        //generating random angles
        double randomAngle1 = Math.random() * (2 * Math.PI);
        double randomAngle2 = Math.random() * (2 * Math.PI);
        double randomAngle3 = Math.random() * (2 * Math.PI);
        //generating coordinates of the three points

        double x1 = RADIUS * Math.cos(randomAngle1);
        double y1 = RADIUS * Math.sin(randomAngle1);
        double x2 = RADIUS * Math.cos(randomAngle2);
        double y2 = RADIUS * Math.sin(randomAngle2);
        double x3 = RADIUS * Math.cos(randomAngle3);
        double y3 = RADIUS * Math.sin(randomAngle3);
        //calculating the distances between the points
        double side1 = Math.sqrt( Math.pow( ( x2 - x1 ) , 2 ) + Math.pow( ( y2 - y1 ) , 2 ) );
        double side2 = Math.sqrt( Math.pow( ( x3 - x2 ) , 2 ) + Math.pow( ( y3 - y2 ) , 2 ) );
        double side3 = Math.sqrt( Math.pow( ( x1 - x3) , 2 ) + Math.pow( ( y1 - y3 ) , 2 ) );
        //finally calculating the angle between these sides

        double angleA = Math.acos((side1 * side1 - side2 * side2 - side3 * side3) / (-2 * side2 * side3));
        double angleB = Math.acos((side2 * side2 - side1 * side1 - side3 * side3) / (-2 * side1 * side3));
        double angleC = Math.acos((side3 * side3 - side2 * side2 - side1 * side1) / (-2 * side1 * side2));

        // print angles
        System.out.println( Math.toDegrees( angleA ) + " " + Math.toDegrees( angleB ) + " " + Math.toDegrees( angleC ) );

    }
}
