package week7;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] array=new int[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i< array.length;i++){
            array[i]=input.nextInt();
        }
        int[] reversedArray=reverseArray(array);
        Question_07_02.printArray(reversedArray);
    }
    public static int[] reverseArray(int[] array){
        int[] reversedArray=new int[array.length];
        for (int i=0,j= array.length-1;j>-1;i++,j--){
            reversedArray[j]=array[i];
        }
        return reversedArray;
    }
}
