package week3;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        double a, b, c;
        double discriminant;
        double root1, root2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        discriminant = (b * b) - (4 * a * c);
        if (discriminant > 0){
            root1 = (- b + Math.pow(discriminant,0.5)) / ( 2 * a ) ;
            root2 = (- b - Math.pow(discriminant,0.5)) / ( 2 * a ) ;
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }
        else if (discriminant == 0) {
            root1 = (- b + Math.pow(discriminant,0.5)) / ( 2 * a ) ;
            System.out.println("The equation has one root " + root1);

        }
        else
            System.out.println("The equation has no real roots");
    }
}
