package week2;

import java.util.Scanner;

public class Question_02_14 {

    public static void main(String[] args) {
        double weight;
        double height;
        double BMI;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble() * 0.45359237;
        System.out.print("Enter height in inches: ");
        height = input.nextDouble() * 0.0254;
        BMI = weight / ( height  * height );
        System.out.println("BMI is " + BMI);
    }
}