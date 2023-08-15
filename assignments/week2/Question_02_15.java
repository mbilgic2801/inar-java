package week2;

import java.util.Scanner;

public class Question_02_15 {

    public static void main(String[] args) {
        double pointX1,pointX2,pointY1,pointY2;
        double distance;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        pointX1 = input.nextDouble();
        pointY1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        pointX2 = input.nextDouble();
        pointY2 = input.nextDouble();
        distance = Math.pow((Math.pow((pointX2-pointX1),2)+Math.pow((pointY2-pointY1),2)),0.5);
        System.out.println("The distance between the two points is " + distance);
    }
}