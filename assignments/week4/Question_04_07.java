package week4;

import java.util.Scanner;

public class Question_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of bounding circle: ");
        double radius = input.nextDouble();
        double x1,x2,x3,x4,x5;
        double y1,y2,y3,y4,y5;
        x1 = radius * Math.cos(Math.PI/10);
        y1 = radius * Math.sin(Math.PI/10);
        x2 = radius * Math.cos(Math.PI/2);
        y2 = radius * Math.sin(Math.PI/2);
        x3 = radius * Math.cos(Math.PI*9/10);
        y3 = radius * Math.sin(Math.PI*9/10);
        x4 = radius * Math.cos(Math.PI*13/10);
        y4 = radius * Math.sin(Math.PI*13/10);
        x5 = radius * Math.cos(Math.PI*17/10);
        y5 = radius * Math.sin(Math.PI*17/10);
        System.out.printf("""
                The coordinates of five points on the pentagon are\s
                (%f , %f)
                (%f , %f)
                (%f , %f)
                (%f , %f)
                (%f , %f)""",x1,y1,x2,y2,x3,y3,x4,y4,x5,y5);
    }
}
