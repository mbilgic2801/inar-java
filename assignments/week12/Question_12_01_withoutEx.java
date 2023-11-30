package week12;

import java.util.Scanner;


public class Question_12_01_withoutEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operation = input.nextLine();
        double result = 0;
        try {
            String[] operationParts = operation.split(" ");
            double operand1 = Double.parseDouble(operationParts[0]);
            double operand2 = Double.parseDouble(operationParts[2]);
            switch (operationParts[1]) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Invalid operator: " + operationParts[1]);
                    return;
            }
            System.out.println(operation+" "+result);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input " + wrongInput(operation));
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
}
