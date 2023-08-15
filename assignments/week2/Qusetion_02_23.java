package week2;

import java.util.Scanner;

public class Qusetion_02_23 {

    public static void main(String[] args) {
        double drivingDistance;
        double milesPerGallon;
        double pricePerGallon;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        drivingDistance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        pricePerGallon = input.nextDouble();
        System.out.print("The cost of driving is $ " + (drivingDistance / milesPerGallon * pricePerGallon));



    }
}