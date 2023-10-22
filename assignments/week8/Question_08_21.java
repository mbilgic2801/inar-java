package week8;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        double[][] coordinates = new double[numberOfCities][2];
        System.out.println("Enter the coordinates of the cities: ");
        CommonMethods.takeInput(coordinates);
        findCentralCity(coordinates);
    }

    private static void findCentralCity(double[][] coordinates) {
        int l = coordinates.length;
        double[] distances = new double[l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                distances[i]+=CommonMethods.distance2D(coordinates[i],coordinates[j]);
            }
        }
        int index=0;
        double min=distances[0];
        for (int i = 1; i < l-1; i++) {
            if(min>distances[i]){
                min=distances[i];
                index=i;
            }
        }
        System.out.printf("The central city is at (%.1f, %.1f)\n",coordinates[index][0],coordinates[index][1]);
        System.out.printf("The total distance to all other cities is %.2f",distances[index]);
    }
}
