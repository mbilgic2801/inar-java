package week6;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        displaySortedNumbers(input.nextDouble(),input.nextDouble(),input.nextDouble());
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){

       double temp;
       if(num2>num1){
           temp= num1;
           num1=num2;
           num2=temp;
       }
       if(num3>num1){
           temp=num1;
           num1=num3;
           num3=temp;
       }
       if(num3>num2){
           temp=num2;
           num2=num3;
           num3=temp;
       }


        System.out.println(num3+" "+num2+" "+num1);

    }
}
