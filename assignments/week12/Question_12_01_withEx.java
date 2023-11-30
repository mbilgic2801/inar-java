package week12;

import java.util.Scanner;

public class Question_12_01_withEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operation = input.nextLine();
        try {
            double result = solution(operation);
            System.out.println(result);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input: " + wrongInput(operation));
        }
    }

    private static String wrongInput(String str) {
        String[] operation = str.split(" ");
        for (int i = 0; i < operation[0].length(); i++) {
            if (!Character.isDigit(operation[0].charAt(i))) {
                return operation[0];
            }
        }
        for (int i = 0; i < operation[2].length(); i++) {
            if (!Character.isDigit(operation[2].charAt(i))) {
                return operation[2];
            }
        }
        return "";
    }

    public static double solution(String str) {
        String[] operation = str.split(" ");
        double operand1 = Double.parseDouble(operation[0]);
        double operand2 = Double.parseDouble(operation[2]);
        switch (operation[1]) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operation[1]);
        }
    }
}
