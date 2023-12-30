package week3;



import java.util.Scanner;

public class Question_03_03 {

    public static void main(String[] args) {

        double a, b, c, d, e, f;
        double x, y;
        double discriminant;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        discriminant = ( a * d -b * c );
        if(discriminant != 0){
            x = ( e * d - f * b ) / discriminant;
            y = ( e * c - f * a ) / discriminant;
            System.out.println("X is " + x + " and Y is " + y);
        }
        else
            System.out.println("The equation has no solution");


    }
}
