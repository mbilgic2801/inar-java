package week7;

import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents=input.nextInt();
        String[] names=new String[numberOfStudents];
        int[] scores=new int[numberOfStudents];
        for(int i=0;i<numberOfStudents;i++){
            System.out.print("Student "+(i+1)+": ");
            names[i]=input.next();
            System.out.print("Score: ");
            scores[i]=input.nextInt();
        }
        sortStudents(names,scores);
        for(int i=names.length-1;i>=0;i--){
            System.out.println(names[i]);
        }
    }
    public static void sortStudents(String[] names,int[] scores){
        for (int i = 0; i < names.length-1 ; i++) {
            int min=scores[i];
            String minName=names[i];
            int index=i;
            for (int j = i+1; j < names.length ; j++) {
                if(min>scores[j]){
                    min=scores[j];
                    minName=names[j];
                    index=j;

                }
            }
            scores[index]=scores[i];
            names[index]=names[i];
            scores[i]=min;
            names[i]=minName;

        }
    }
}
