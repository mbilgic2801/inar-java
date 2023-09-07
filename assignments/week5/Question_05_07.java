package week5;

import java.util.Scanner;

public class Question_05_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tuition = 10000;

        double sum = 0;

        for (int i=0;i<10;i++){
            tuition *= 1.05;
        }
        System.out.printf("Tuition in ten years: $%f",tuition);
        System.out.printf("\nTotal cost for four years' worth of tuition after the tenth year: $%f",(tuition*4));

    }
}
