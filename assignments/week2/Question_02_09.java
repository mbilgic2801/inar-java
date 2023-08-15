package week2;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double velocityInitial;
        double velocityFinal;
        double time;
        System.out.print("Enter V0, v1, and t: 5.5");
        velocityInitial = input.nextDouble();
        velocityFinal = input.nextDouble();
        time = input.nextDouble();
        double acceleration = (velocityFinal-velocityInitial) / time;
        System.out.println("The average acceleration is " + acceleration);
    }
}