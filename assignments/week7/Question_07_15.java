package week7;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter ten number: ");
        int[] numbers=new int[10];

        for (int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        int[] distinctNumbers=Question_07_05.getDistinctNumberArray(numbers);
        System.out.print("The distinct numbers are ");
        Question_07_02.printArray(distinctNumbers);
    }
}
