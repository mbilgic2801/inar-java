package week4;

import java.util.Scanner;

public class Question_04_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double radius = input.nextDouble();
        double radian = Math.toRadians(180/5.0);
        double side = 2 * radius * Math.sin( radian );
        double areaOfPentagon = ( 5 * Math.pow( side , 2 ) ) / ( 4 * Math.tan( radian ) );
        System.out.printf("The area of pentagon is %.2f", areaOfPentagon);
    }
}
