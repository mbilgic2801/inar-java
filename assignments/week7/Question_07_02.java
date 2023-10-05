package week7;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] reverseArray = reverse(numbers);
        printArray(reverseArray);
    }

    public static int[] reverse(int[] numbers) {
        int[] reverseArray = new int[numbers.length];
        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            reverseArray[i] = numbers[j];
        }
        return reverseArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
