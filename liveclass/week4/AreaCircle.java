package week4;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double areaOfCircle = Math.PI * Math.pow(radius,2);
        System.out.println("Area of circle is :" + Math.round(areaOfCircle));
        System.out.println("Area of circle is :" + Math.ceil(areaOfCircle));
        System.out.println("Area of circle is :" + Math.floor(areaOfCircle));

    }
}
