package week5;

import java.util.Scanner;

public class obeb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        int gcf=1;
        for (int i=1;i<=(Math.min(number1,number2));i++){
            if(number1%i==0&&number2%i==0){
                gcf=i;
            }
        }
        System.out.printf("The GCF of %d and %d is %d",number1,number2,gcf);
    }
}
