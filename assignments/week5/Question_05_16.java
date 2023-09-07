package week5;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        int tempInteger = integer;
        int i=2;

        while (i<=Math.sqrt(tempInteger)) {
            if (integer % i == 0) {
                System.out.print(i);
                integer /= i;
                if (i + 1 <= Math.sqrt(tempInteger)) {
                    System.out.print(", ");
                } else {
                    System.out.print(".");
                }
            }
            else i++;

        }
    }
}
