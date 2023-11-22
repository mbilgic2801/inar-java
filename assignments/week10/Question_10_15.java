package week10;

import week8.CommonMethods;

import java.util.Scanner;
//test case 1 2,5 3 4 5 6 7 8 9 10
public class Question_10_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter five points: ");
        double[][] points=new double[5][2];
        CommonMethods.takeInput(points);
        MyRectangle2D r=MyRectangle2D.getRectangle(points);
        System.out.printf("The bounding rectangle's center(%.2f,%.2f), width %.1f, height %.1f",r.x,r.y,r.width,r.height);
    }
}
