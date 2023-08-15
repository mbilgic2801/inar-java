package week2;

import java.util.Scanner;

public class Question_02_03{
    public static void main(String[]args){
        double feet;
        double meter;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a value for feet : ");
        feet = input.nextDouble();
        meter = feet * 0.305;
        System.out.println(feet+" feet is "+meter+" meters.");
    }
}
