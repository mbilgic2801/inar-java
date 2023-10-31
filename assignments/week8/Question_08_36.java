package week8;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = input.nextInt();
        char[][] matrix = new char[n][n];
        System.out.printf("Enter %d rows of letters separated by spaces:\n", n);
        CommonMethods.takeInput(matrix);
        CommonMethods.printArray(matrix);
        checkLatinSquare(matrix);
    }

    public static void checkLatinSquare(char[][] matrix) {
        int n = matrix.length;
        String str = "";//char cluster
        int[][] counter = new int[n][2]; //rows and columns sum of chars
        int sumValue = 0;//true sum of chars
        //row counter and all appropriate chars in a string
        for (int i = 0; i < n; i++) {
            str += (char) ('A' + i);
            sumValue += ('A' + i);
        }
        //row checker and char elimination
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!str.contains(""+matrix[i][j])) {
                    System.out.printf("Wrong input: the letters must be from A to %c",'A'+n-1);
                    return;
                }
                counter[i][0] += matrix[i][j];
            }
        }
        //Column counter
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                counter[i][1] += matrix[j][i];
            }
        }
        //Column checker
        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter[i].length; j++) {
                if (counter[i][j] != sumValue) {
                    System.out.println("The input array is not a Latin Square");
                    return;
                }
            }
        }
        System.out.println("The input array is a Latin Square");
    }
}

