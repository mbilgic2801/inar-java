package week6;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides for a triangle:");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        if(MyTriangle.isValid(side1,side2,side3)){
            System.out.printf("The area of the triangle is %.1f\n",MyTriangle.area(side1,side2,side3));
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}
class MyTriangle{
    public static boolean isValid(double side1,double side2,double side3){
        if((side1<side2+side3)&&(side2<side1+side3)&&(side3<side2+side1)){
            return true;
        }
        return false;
    }
    public static double area(double side1,double side2,double side3){
        double s = ( side1 + side2 + side3 ) / 2;
        double area = Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5);
        return area;
    }
}
