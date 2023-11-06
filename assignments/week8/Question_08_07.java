package week8;

import week7.Question_07_02;
import week7.Question_07_26;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {
                {-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}
        };
        int combination = CommonMethods.combination(points.length, 2);
        int[][] pointCombination = new int[combination][2];
        double[] distance = new double[combination];
        determineDistances(points, pointCombination, distance);

        sortDueToDistance(pointCombination, distance);

        printMinimumDistances(points, distance, pointCombination);


    }

    public static void printMinimumDistances(double[][] points, double[] distance, int[][] pointCombination) {
        for (int i = 0; i < distance.length; i++) {

            System.out.println("The closest two points are (" +
                    points[pointCombination[i][0]][0] + "," + points[pointCombination[i][0]][1] + "," + points[pointCombination[i][0]][2] + ") and (" +
                    points[pointCombination[i][1]][0] + "," + points[pointCombination[i][1]][1] + "," + points[pointCombination[i][1]][2] + "}");
            if (distance[i] != distance[i + 1]) {
                System.out.println("Their distance is " + distance[i]);
                return;
            }
        }
    }

    public static void sortDueToDistance(int[][] pointCombination, double[] distance) {
        int[] tempInt;
        double tempDouble;
        for (int j = 0; j < distance.length; j++) {
            for (int i = j; i < distance.length; i++) {
                if (distance[j] > distance[i]) {
                    tempDouble = distance[i];
                    distance[i] = distance[j];
                    distance[j] = tempDouble;
                    tempInt = pointCombination[i];
                    pointCombination[i] = pointCombination[j];
                    pointCombination[j] = tempInt;

                }
            }
        }
    }

    public static void determineDistances(double[][] points, int[][] pointCombination, double[] distance) {
        int counter = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                pointCombination[counter][0] = i;
                pointCombination[counter][1] = j;
                distance[counter] = CommonMethods.distance3D(points[i], points[j]);
                counter++;
            }
        }

    }
}
