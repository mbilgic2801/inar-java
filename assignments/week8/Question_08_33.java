package week8;

import week6.Question_06_15;
import week6.Question_06_19;

import java.util.Scanner;

public class Question_08_33 {
    // take four vertices' coordinates as input
    // four sides with two diagonals, there are four triangles
    // display their areas in increasing order
    // case: -2,5 2 4 4 3 -2 -2 -3,5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] vertices = new double[4][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        CommonMethods.takeInput(vertices);
        showTrianglesAreas(vertices);
    }

    public static void showTrianglesAreas(double[][] vertices) {
        double[][] tempVertices = new double[vertices.length][vertices[0].length];
        for (int i = 0; i < vertices.length; i++) {
            for (int j = 0; j < vertices[i].length; j++) {
                tempVertices[i][j] = vertices[i][j];
            }
        }
        double[] temp = tempVertices[1];
        tempVertices[1] = tempVertices[2];
        tempVertices[2] = temp;
        double[][] leftSide = new double[2][2];
        double[] rightSide = new double[2];
        getLinearEquation(tempVertices, leftSide, rightSide);
        double[] center = getCenter(leftSide, rightSide);
        double[] areasOfTriangles = new double[4];
        for (int i = 0; i < areasOfTriangles.length; i++) {
            areasOfTriangles[i] = findArea(vertices[i], vertices[(i + 1) % 4], center);
        }
        CommonMethods.bubbleSort(areasOfTriangles);
        System.out.print("The areas are ");
        CommonMethods.printArray(areasOfTriangles);

    }

    public static void getLinearEquation(double[][] coordinatesOfLines, double[][] leftSide, double[] rightSide) {
        CommonMethods.printArray(coordinatesOfLines);
        System.out.println("************");
        leftSide[0][0] = coordinatesOfLines[0][1] - coordinatesOfLines[1][1];
        leftSide[0][1] = coordinatesOfLines[0][0] - coordinatesOfLines[1][0];
        leftSide[1][0] = coordinatesOfLines[2][1] - coordinatesOfLines[3][1];
        leftSide[1][1] = coordinatesOfLines[2][0] - coordinatesOfLines[3][0];


        rightSide[0] = leftSide[0][0] * coordinatesOfLines[0][0] - leftSide[0][1] * coordinatesOfLines[0][1];
        rightSide[1] = leftSide[1][0] * coordinatesOfLines[2][0] - leftSide[1][1] * coordinatesOfLines[2][1];

    }

    public static double[] getCenter(double[][] leftSide, double[] rightSide) {
        double[] center = new double[2];
        double divider = leftSide[0][0] * leftSide[1][1] - leftSide[0][1] * leftSide[1][0];
        if (divider == 0) {
            System.out.println("The two lines are parallel");
        } else {
            center[0] = (rightSide[0] * leftSide[1][1] - rightSide[1] * leftSide[0][1]) / divider;
            center[1] = (-rightSide[1] * leftSide[0][0] + rightSide[0] * leftSide[1][0]) / divider;

        }
        System.out.println("The center is ");
        CommonMethods.printArray(center);
        return center;
    }

    public static double findArea(double[] vertex, double[] vertex1, double[] center) {
        double[] sides = new double[3];
        sides[0] = CommonMethods.distance2D(vertex, vertex1);
        sides[1] = CommonMethods.distance2D(vertex1, center);
        sides[2] = CommonMethods.distance2D(center, vertex);
        return area(sides[0], sides[1], sides[2]);
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        return area;
    }
}
