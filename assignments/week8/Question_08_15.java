package week8;

import java.util.Scanner;

public class Question_08_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[][] pointMatrix=new double[5][2];
        System.out.print("Enter five points: ");
        CommonMethods.takeInput(pointMatrix);
        sameLineOrNot(pointMatrix);
    }

    private static void sameLineOrNot(double[][] pointMatrix) {

            System.out.printf("The five points are%s on the same line",onTheSameLine(pointMatrix)?"":" not");

    }
    public static boolean onTheSameLine(double[][] pointsMatrix){
        for (int i = 0; i < pointsMatrix.length-2; i++) {
            if(!onTheSameLine(pointsMatrix[i][0], pointsMatrix[i][1], pointsMatrix[i+1][0],
                    pointsMatrix[i+1][1], pointsMatrix[i+2][0], pointsMatrix[i+2][1])){
                return false;
            }
        }
        return true;


    }
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        return (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)==0;
    }
}
