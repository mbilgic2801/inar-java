package week6;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        displayPattern(input.nextInt());
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
