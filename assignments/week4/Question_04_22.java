package week4;

import java.util.Scanner;

public class Question_04_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s1: ");
        String s2 = input.nextLine();
        System.out.printf("%s is "+(s1.contains(s2)?"":"not ")+"substring of %s",s2,s1);
    }
}
