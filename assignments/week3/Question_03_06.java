package week3;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double inchToMeter = 0.0254;
        final double feetToMeter = 0.3048;
        final double poundToKilogram = 0.45359237;
        double weightInPound;
        double heightInFeet;
        double heightInInch;
        double weightInKilogram;
        double heightInMeter;
        double BMI;
        System.out.print("Enter weight in pounds: ");
        weightInPound = input.nextDouble();
        System.out.print("Enter feet: ");
        heightInFeet = input.nextDouble();
        System.out.print("Enter inches: ");
        heightInInch = input.nextDouble();
        weightInKilogram = weightInPound * poundToKilogram;
        heightInMeter = heightInFeet * feetToMeter + heightInInch * inchToMeter;
        BMI = weightInKilogram / ( heightInMeter * heightInMeter );
        System.out.println("BMI is " + BMI);
        if(BMI < 18.5 )
            System.out.println("Underweight");
        else if (18.5 <= BMI && BMI < 25 )
            System.out.println("Normal");
        else if (25 <= BMI && BMI < 30 )
            System.out.println("Overweight");
        else
            System.out.println("Obese");


    }
}
