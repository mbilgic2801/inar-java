package week2;

import java.util.Scanner;

public class    Question_02_12 {

    public static void main(String[] args) {
        double speed;
        double acceleration;
        double minRunway;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        speed = input.nextDouble();
        acceleration = input.nextDouble();
        minRunway = Math.pow(speed,2) / ( 2 * acceleration );
        System.out.println("The minimum runway length for this airplane is " +minRunway);
    }
}