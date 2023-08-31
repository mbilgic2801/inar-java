package week4;

import java.util.Scanner;

public class Question_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double areaOfHexagon;
        double sideOfHexagon;
        System.out.print("Enter the side: ");
        sideOfHexagon = input.nextDouble();
        areaOfHexagon = 6 * Math.pow(sideOfHexagon,2)/(4*Math.tan(Math.toRadians(30)));
        System.out.printf("The area of hexagon is %.2f" ,areaOfHexagon);
    }
}

