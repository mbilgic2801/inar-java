package week6;

import java.util.Scanner;

public class Question_06_36 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides=input.nextInt();
        System.out.print("Enter the side: ");
        double side=input.nextDouble();
        System.out.printf("The area of the polygon is %f",area(numberOfSides,side));
    }
    public static double area(int numberOfSides,double side){
        return (numberOfSides*side*side)/(4*Math.tan(Math.PI/numberOfSides));
    }
}
