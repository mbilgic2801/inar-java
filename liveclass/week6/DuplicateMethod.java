package week6;

import java.util.Scanner;

public class DuplicateMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        System.out.println(eraseDuplicates(str));
    }

    public static String eraseDuplicates(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (output.indexOf(str.charAt(i) + "") == -1) {
                output += "" + str.charAt(i);
            }
        }
        return output;
    }
}

