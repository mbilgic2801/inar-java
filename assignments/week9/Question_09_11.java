package week9;

import java.util.Scanner;

public class Question_09_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        double d= input.nextDouble();
        double e= input.nextDouble();
        double f= input.nextDouble();
        LinearEquation_09_11 problem=new LinearEquation_09_11(a,b,c,d,e,f);
        problem.solution();
    }
}
