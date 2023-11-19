package week11;

import week8.CommonMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_15 {
    //-12 0 -8,5 10 0 11,4 5,5 7,8 6 -5,5 0 -7 -3,5 -3,5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  System.out.println(new Triangle(3,4,5).getArea());

        System.out.print("Enter the number of the points: ");
        int points = input.nextInt();
        ArrayList<double[]> list = new ArrayList<>();
        for (int i = 0; i < points; i++) {
            list.add(new double[]{input.nextDouble(), input.nextDouble()});
        }
        System.out.println("The total area is " + getAreaOfPolygon(list));
    }

    public static double getAreaOfPolygon(ArrayList<double[]> list) {
        double sum = 0;
        for (int i = 1, k = 0; i < list.size() - 1; i++) {
            double[] sides = sidesOfTriangles(list.get(k), list.get(i), list.get(i + 1));
            sum += (new Triangle(sides[0], sides[1], sides[2])).getArea();
        }

        return sum;
    }

    public static double getAreaOfInnerTriangle(double s1, double s2, double s3) {
        Triangle a = new Triangle(s1, s2, s3);
        return a.getArea();
    }

    public static double[] sidesOfTriangles(double[] p1, double[] p2, double[] p3) {
        double sides[] = new double[3];
        sides[0] = CommonMethods.distance2D(p1, p2);
        sides[1] = CommonMethods.distance2D(p2, p3);
        sides[2] = CommonMethods.distance2D(p1, p3);
        return sides;
    }
}
