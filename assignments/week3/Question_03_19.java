package week3;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges of the triangle:");
        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        double sideC = input.nextDouble();
        if( (sideA<=0) || (sideB<=0) || (sideC<=0) || (sideA>(sideB+sideC)) || (sideB>(sideA+sideC)) || (sideC>(sideB+sideA)) ){
            System.out.println( "The input is invalid" );
        }
        else
            System.out.println( "The perimeter is " + ( sideA + sideB + sideC ) );
    }
}
