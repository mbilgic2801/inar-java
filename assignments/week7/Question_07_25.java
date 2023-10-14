package week7;

import java.util.Scanner;

import static week7.Question_07_20.printArray;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[] equation=new double[3];
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i <3 ; i++) {
            equation[i]=input.nextDouble();
        }
        int numberOfRoots=howManyRoots(equation);
        if(numberOfRoots==0){
            System.out.println("The equation has no real root");
            System.exit(0);
        }
        System.out.println("The number of real roots: "+numberOfRoots );
        double[] roots=new double[numberOfRoots];
        solveQuadratic(equation,roots);
        printArray(roots);

    }
    public static void printArray(double[] array){
        System.out.print("The root(s) of equation: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void solveQuadratic(double[] equation, double[] roots) {




        roots[0]=(-1*equation[1]+discrimant(equation))/(2*equation[0]);
        if(discrimant(equation)>0){
            roots[1]=(-1*equation[1]-discrimant(equation))/(2*equation[0]);
        }
    }
    public static double discrimant(double[] equation){
    return equation[1]*equation[1]-4*equation[0]*equation[2];
}
    public static int howManyRoots(double[] equation) {
        double discrimant=discrimant(equation);
        if(discrimant>0){
            return 2;
        } else if (discrimant==0) {
            return 1;
        }
        else
            return 0;
    }

}
