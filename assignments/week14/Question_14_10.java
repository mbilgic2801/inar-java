package week14;

import java.util.Scanner;
import java.util.Stack;

public class Question_14_10 {
    //2 1 + 3 *
    //2 1 + 3 * 9 - 27 + 2 *
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        String[] strArray = input.nextLine().split(" ");
        String explanation = "";
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("+") || strArray[i].equals("-") || strArray[i].equals("*") || strArray[i].equals("/")) {
                if (explanation.equals("")) {
                    explanation = "(" + strArray[i - 2] + " " + strArray[i] + " " + strArray[i - 1] + ")";
                } else {
                    explanation = "(" + explanation + " " + strArray[i] + " " + strArray[i - 1] + ")";
                }
            }
        }
        for (String s : strArray) {
            int operand2;
            int operand1;
            if (s.equals("+")) {
                operand2 = Integer.parseInt(stack.pop());
                operand1 = Integer.parseInt(stack.pop());
                stack.push((operand1 + operand2) + "");
            } else if (s.equals("-")) {
                operand2 = Integer.parseInt(stack.pop());
                operand1 = Integer.parseInt(stack.pop());
                stack.push((operand1 - operand2) + "");
            } else if (s.equals("*")) {
                operand2 = Integer.parseInt(stack.pop());
                operand1 = Integer.parseInt(stack.pop());
                stack.push((operand1 * operand2) + "");
            } else if (s.equals("/")) {
                operand2 = Integer.parseInt(stack.pop());
                operand1 = Integer.parseInt(stack.pop());
                stack.push((operand1 / operand2) + "");
            } else {
                stack.push(s);
            }
        }
        System.out.println("Output: " + stack.pop());
        System.out.println("Explanation: " + explanation);
    }
}
