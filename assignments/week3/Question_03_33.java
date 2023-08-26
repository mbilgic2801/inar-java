package week3;

import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and prive for package 1: ");
        double packageOneWeight = input.nextDouble();
        double packageOnePrice = input.nextDouble();
        double packageOneUnitPrice = packageOnePrice / packageOneWeight;
        System.out.print("Enter weight and prive for package 2: ");
        double packageTwoWeight = input.nextDouble();
        double packageTwoPrice = input.nextDouble();
        double packageTwoUnitPrice = packageTwoPrice / packageTwoWeight;

        if( packageOneUnitPrice < packageTwoUnitPrice )
            System.out.println("Package 1 has a better price.");
        else if( packageOneUnitPrice > packageTwoUnitPrice )
            System.out.println("Package 2 has a better price.");
        else
            System.out.println("Two packages have the same price");
    }
}
