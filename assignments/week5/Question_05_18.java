package week5;

import java.util.Scanner;

public class Question_05_18 {
    public static void main(String[] args) {
        //pattern A
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        //pattern B
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        //pattern C
        for (int i = 1; i <= 6; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        //pattern D
        for (int i = 6; i >= 1; i--) {
            for (int k = 5; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
