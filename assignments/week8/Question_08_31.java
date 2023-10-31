package week8;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Question_08_31 {
    //ikişer noktası verilen doğruların kesişim noktaını yazdıracaksın
    // kesişme yoksa paralel
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] coordinatesOfLines = new double[4][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        CommonMethods.takeInput(coordinatesOfLines);
        double[][] leftSide = new double[2][2];
        double[] rightSide = new double[2];
        getLinearEquation(coordinatesOfLines, leftSide, rightSide);
        solveEquation(leftSide, rightSide);
    }

    public static void getLinearEquation(double[][] coordinatesOfLines, double[][] leftSide, double[] rightSide) {
        CommonMethods.printArray(coordinatesOfLines);
        System.out.println("************");
        leftSide[0][0] = coordinatesOfLines[0][1] - coordinatesOfLines[1][1];
        leftSide[0][1] = coordinatesOfLines[0][0] - coordinatesOfLines[1][0];
        leftSide[1][0] = coordinatesOfLines[2][1] - coordinatesOfLines[3][1];
        leftSide[1][1] = coordinatesOfLines[2][0] - coordinatesOfLines[3][0];
        CommonMethods.printArray(leftSide);
        System.out.println("************");
        rightSide[0] = leftSide[0][0] * coordinatesOfLines[0][0] - leftSide[0][1] * coordinatesOfLines[0][1];
        rightSide[1] = leftSide[1][0] * coordinatesOfLines[2][0] - leftSide[1][1] * coordinatesOfLines[2][1];
        CommonMethods.printArray(rightSide);
        System.out.println("************");
    }
    public static void solveEquation(double[][] leftSide, double[] rightSide) {
        double divider=leftSide[0][0]*leftSide[1][1]-leftSide[0][1]*leftSide[1][0];
        if(divider==0){
            System.out.println("The two lines are parallel");
        }
        else {
            double x=(rightSide[0]*leftSide[1][1]-rightSide[1]*leftSide[0][1])/divider;
            double y=(-rightSide[1]*leftSide[0][0]+rightSide[0]*leftSide[1][0])/divider;
            System.out.printf("The intersecting point is at (%.5f, %.5f) ",x,y);
        }
    }
}
