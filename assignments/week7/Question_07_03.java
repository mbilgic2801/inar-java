package week7;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counters = new int[100];
        System.out.print("Enter the integers between 1 and 100: ");
        int number;
        while ((number = input.nextInt()) != 0) {
            counters[number - 1]++;
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > 0) {
                System.out.printf("%d occurs %d %s\n", (i + 1), counters[i], counters[i] > 1 ? "times" : "time");
            }
        }

    }
}
