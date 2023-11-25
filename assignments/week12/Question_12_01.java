package week12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Object a=0;
        try {
            System.out.print("10 + ");
            int number = input.nextInt();
            a=number;
            System.out.println("10 + " + number+" = "+(10+number));

        }
        catch (InputMismatchException ex){
            System.out.println("Wrong input "+a.toString());
            input.nextLine();//Discard input
        }
    }
}
