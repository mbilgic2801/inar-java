package week5;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String maxName="";

        int maxScore=0;

        int numberOfStudents;
        System.out.print("Enter the number of students: ");

        numberOfStudents = input.nextInt();
        input.nextLine();
        System.out.println("Enter each student's name and score");

        for(int i = 1 ; i <= numberOfStudents ; i++){
            System.out.print("Student: " + i);
            System.out.print("\n \t Name: ");
            String name = input.nextLine();
            System.out.print("\t Score: ");
            int score = input.nextInt();
            input.nextLine();
            if(score>maxScore){
              maxScore = score;
              maxName = name;
            }
        }
        System.out.println("The student with the highest score: "+maxName);
    }
}
