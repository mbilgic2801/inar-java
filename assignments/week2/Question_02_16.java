package week2;

import java.util.Scanner;

public class Question_02_16 {
    public static void main(String[] args) {
        double side;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        side = input.nextDouble();
        area = side * side * 3 * Math.pow(3,0.5) / 2;
        System.out.println("The area of the hexagon is " + area);
    }
}