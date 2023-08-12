package week2;

import java.util.Scanner;

public class Question_02_01{
public static void main(String[]args){
        double degreeCelsius;
        double degreeFahrenheit;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        degreeCelsius= input.nextDouble();
        degreeFahrenheit=9.0/5*degreeCelsius+32;
        System.out.println(degreeCelsius+" Celsius is "+degreeFahrenheit+" Fahrenheit.");
        }
        }
