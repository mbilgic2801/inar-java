package week4;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideOfPolygon;
        double areaOfPolygon;
        int numberOfSides;
        System.out.print("Enter the number of sides: ");
        numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        sideOfPolygon = input.nextDouble();
        areaOfPolygon = numberOfSides * Math.pow(sideOfPolygon,2)/(4*Math.tan(Math.toRadians(180.0/numberOfSides)));
        System.out.println("The area of polygon is " + areaOfPolygon);
    }
}
