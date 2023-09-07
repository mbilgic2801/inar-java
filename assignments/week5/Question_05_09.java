package week5;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String maxName1="";
        String maxName2="";
        int maxScore1=0;
        int maxScore2=0;

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
            if(score>maxScore1){
                maxScore2 = maxScore1;
                maxName2 = maxName1;
                maxScore1 = score;
                maxName1 = name;
            }
            else if(score>maxScore2){
                maxScore2 = score;
                maxName2 = name;
            }

        }
        System.out.println("The highest scoring student: "+maxName1);
        System.out.println("The second highest scoring student: "+maxName2);
    }
}
