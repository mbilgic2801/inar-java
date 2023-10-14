package week7;

import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list1: ");
        int list1Length=input.nextInt();
        int[] list1=new int[list1Length];
        for (int i = 0; i < list1.length; i++) {
            list1[i]=input.nextInt();
        }
        System.out.print("Enter list2: ");
        int list2Length=input.nextInt();
        int[] list2=new int[list2Length];
        for (int i = 0; i < list2.length; i++) {
            list2[i]=input.nextInt();
        }
        System.out.printf("Two lists are%s identical",equals(list1,list2)?"":" not");
    }
    public static boolean equals(int[] list1,int[] list2){
        Question_07_31.sort(list1);
        Question_07_31.sort(list2);
        return Question_07_26.equals(list1,list2);
    }
}
