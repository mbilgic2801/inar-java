package week2;

import java.util.Scanner;

public class Question_02_05{
    public static void main(String[]args){
        double subtotal;
        double gratuityRate;
        double gratuity;
        double total;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate : ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();
        gratuity = subtotal * gratuityRate / 100;
        total = subtotal + gratuity;
        System.out.println("The gratuity is  pound is $" + gratuity +" and total is $" + total);
    }
}
