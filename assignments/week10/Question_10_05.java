package week10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        StackOfInteger_10_05 stack=new StackOfInteger_10_05();
        int number=input.nextInt();
        int temp=number;
        System.out.print("Decreasing order: ");
        for (int i = number/2; i > 1; i--) {
            while (isPrime(i)&&temp%i==0){
                stack.push(i);
                temp/=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        int a=stack.getSize();
        System.out.print("We used pop() method: ");
        for (int i = 0; i < a; i++) {
            System.out.print(stack.pop()+" ");
        }

    }
    public static boolean isPrime(int value){
        for (int j = 2; j < (value / 2 + 1); j++) {
            if (value % j == 0) {
                return false;
            }
        }
        return true;
    }
}
