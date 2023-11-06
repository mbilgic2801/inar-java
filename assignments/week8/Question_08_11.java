package week8;

import java.util.Scanner;

public class Question_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        String bytes = Integer.toBinaryString(number);
        char[][] matrixChar = new char[3][5];

        fillMatrix(bytes, matrixChar);
        CommonMethods.printArray(matrixChar);
        //  CommonMethods.printArray(matrixByte);
    }

    private static void fillMatrix(String bytes, char[][] matrixChar) {
        int index = bytes.length() - 1;
        for (int i = matrixChar.length - 1; i >= 0; i--) {
            for (int j = matrixChar[i].length - 1; j >= 0; j--) {
                if (index >= 0) {
                    if (bytes.charAt(index) == '1') {
                        matrixChar[i][j] = 'T';
                    } else {
                        matrixChar[i][j] = 'H';
                    }
                    index--;
                } else {
                    matrixChar[i][j] = 'H';
                }
            }
        }
    }
}
