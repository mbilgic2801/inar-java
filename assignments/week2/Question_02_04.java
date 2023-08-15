package week2;

import java.util.Scanner;

public class Question_02_04{
    public static void main(String[]args){
        double pound;
        double kilogram;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number in pounds : ");
        pound = input.nextDouble();
        kilogram = pound * 0.454;
        System.out.println(pound+" pound is "+ kilogram +" kilograms.");
    }
}
