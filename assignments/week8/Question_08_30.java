package week8;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] leftSide = new double[2][2];
        double[] rightSide = new double[2];
        System.out.println("Enter a00, a01, a10, a11, b0, and b1:");
        takeEquationInput(leftSide, rightSide);
        solveEquation(leftSide, rightSide);
    }

    public static void takeEquationInput(double[][] leftSide, double[] rightSide) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < leftSide.length; i++) {
            for (int j = 0; j < leftSide[i].length; j++) {
                leftSide[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < rightSide.length; i++) {
            rightSide[i] = input.nextDouble();
        }
    }

    public static void solveEquation(double[][] leftSide, double[] rightSide) {
        double divider = leftSide[0][0] * leftSide[1][1] - leftSide[0][1] * leftSide[1][0];
        if (divider == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (rightSide[0] * leftSide[1][1] - rightSide[1] * leftSide[0][1]) / divider;
            double y = (rightSide[1] * leftSide[0][0] - rightSide[0] * leftSide[1][0]) / divider;
            System.out.printf("x is %.1f and y is %.1f", x, y);
        }
    }

}
