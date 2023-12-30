package week7;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] grades = new int[numberOfStudents];
        System.out.printf("Enter %d scores:", numberOfStudents);
        for (int i = 0; i < grades.length; i++) {
            grades[i] = input.nextInt();
        }
        char[] charGrades = getGrade(grades);
        printGrades(grades, charGrades);
    }

    public static void printGrades(int[] grades, char[] charGrades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %c\n", i, grades[i], charGrades[i]);
        }
    }

    public static char[] getGrade(int[] grade) {
        char[] charGrades = new char[grade.length];
        for (int i = 0; i < grade.length; i++) {
            charGrades[i] = getCharOfGrade(grade[i], bestGrade(grade));
        }
        return charGrades;
    }

    public static char getCharOfGrade(int i, int bestGrade) {
        if (i >= bestGrade - 10) return 'A';
        if (i >= bestGrade - 20) return 'B';
        if (i >= bestGrade - 30) return 'C';
        if (i >= bestGrade - 40) return 'D';
        return 'F';

    }

    public static int bestGrade(int[] grade) {
        int max = 0;
        for (int i = 0; i < grade.length; i++) {
            max = Math.max(max, grade[i]);
        }
        return max;
    }

    public static boolean isValid(char c) {
        return c == 'a';
    }
}
