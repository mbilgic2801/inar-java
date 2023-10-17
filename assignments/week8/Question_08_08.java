package week8;

import java.util.Scanner;

public class Question_08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints=input.nextInt();
        double[][] points=new double[numberOfPoints][2];
        CommonMethods.takeInput(points);
        int combination=CommonMethods.combination(points.length,2);
        int[][] pointCombination=new int[combination][2];
        double[] distance = new double[combination];
        determineDistances(points, pointCombination, distance);
        //Question_08_07.sortDueToDistance(pointCombination,distance);
        //Question_08_07.printMinimumDistances(points,distance,pointCombination);

    }
    public static void determineDistances(double[][] points, int[][] pointCombination, double[] distance) {
        int counter = 0;
        for (int i = 0; i < points.length-1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                pointCombination[counter][0] = i;
                pointCombination[counter][1] = j;
                distance[counter] = CommonMethods.distance2D(points[i], points[j]);
                counter++;
            }
        }

    }
}
