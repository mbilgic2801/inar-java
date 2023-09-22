package week6;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(Math.round(Math.random())+" ");
            }
            System.out.println();
        }

    }
}
