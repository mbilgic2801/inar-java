package week4;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char grade = input.next().charAt(0);

        if(grade>='A'&&grade<='F'){
            if(grade=='A')
                System.out.println("The numeric value for A is 4");
            else if(grade=='B')
                System.out.println("The numeric value for B is 3");
            else if(grade=='C')
                System.out.println("The numeric value for C is 2");
            else if(grade=='D')
                System.out.println("The numeric value for D is 1");
            else
                System.out.println("The numeric value for F is 0");
        }
        else
            System.out.println(grade+" is an invalid input");
    }
}
