package week2;

import java.util.Scanner;

public class Question_02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperatureInitial;
        double temperatureFinal;
        double mass;
        double energy;
        System.out.print("Enter the amount of water in kilograms: ");
        mass = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        temperatureInitial = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        temperatureFinal = input.nextDouble();
        energy = mass * (temperatureFinal - temperatureInitial) * 4184;
        System.out.print("The energy needed is: " + energy);


    }
}