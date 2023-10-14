package week7;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int arrayLength=input.nextInt();
        int[] array=new int[arrayLength];
        System.out.print("Enter the values: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i]=input.nextInt();
        }
        System.out.printf("The list has %sconsecutive fours",isConsecutiveFours(array)?"":"no ");
    }

    private static boolean isConsecutiveFours(int[] array) {
        int counter=1;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]==array[i+1]){
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
