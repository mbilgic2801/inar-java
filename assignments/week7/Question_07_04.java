package week7;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores: (negative number signifies end): ");
        int[] grades = new int[101];
        int number;
        while ((number = input.nextInt()) >= 0) {
            grades[number]++;
        }

        System.out.println("Average of scores: " + getAverage(grades));
        System.out.println("Number of scores above or equal to average: " + getNumberOfEqualOrAboveAverage(grades));
        System.out.println("Number of scores below average: " + getNumberOfBelowAverage(grades));
    }

    public static int getNumberOfBelowAverage(int[] grades) {
        int counter = 0;
        int average = getAverage(grades);
        for (int i = average - 1; i >= 0; i--) {
            counter += grades[i];
        }
        return counter;
    }

    public static int getNumberOfEqualOrAboveAverage(int[] grades) {
        int counter = 0;
        int average = getAverage(grades);
        for (int i = average; i < grades.length; i++) {
            counter += grades[i];
        }
        return counter;

    }
    public static int getAverage(int[] grades) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 0) {
                counter += grades[i];
                sum += (grades[i] * i);
            }
        }
        if(counter==0){
            return 0;
        }
        return sum / counter;
    }
}
