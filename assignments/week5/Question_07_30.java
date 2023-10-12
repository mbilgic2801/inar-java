package week5;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int numberOfValues=input.nextInt();
        int[] values=new int[numberOfValues];
        System.out.print("Enter the values: ");
        for (int i = 0; i < numberOfValues; i++) {
            values[i]=input.nextInt();
        }
        System.out.printf("The list has%s consecutive fours",isConsecutiveFour(values)?"":" no");
    }

    private static boolean isConsecutiveFour(int[] values) {
        int counter=1;
        for (int i = 0; i < values.length-1; i++) {
            if(values[i]==values[i+1]){
                counter++;
                if(counter==4){
                    return true;
                }
            }
            else{
                counter=1;
            }
        }
        return false;
    }
}
