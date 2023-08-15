package week2;

import java.util.Scanner;

public class Question_02_02{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double radius;
        double length;
        //double area;
        //double volume;


        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();
        /*
        area = radius * radius * Math.PI;
        volume = area * length;
        System.out.println("The area is " + area  );
        System.out.println("The volume is " + volume  );
        */
        System.out.println("The area is " + (radius * radius * Math.PI));
        System.out.println("The volume is " + (radius * radius * Math.PI * length ));
    }
}
