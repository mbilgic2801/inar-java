package week7;

import java.util.Scanner;

public class Question_07_32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list: ");
        int arrayLength= input.nextInt();
        int[] array=new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        int pivot=array[0];
        makePartition(array,pivot);
        System.out.print("After the partition, the list is ");
        Question_07_02.printArray(array);

    }

    private static void makePartition(int[] array, int pivot) {
        int[] tempArray=new int[array.length];
        int minCounter=0;
        int maxCounter= array.length-1;
        int midCounter=0;
        for(int i=0;i< array.length;i++){
            if(array[i]<pivot){
                tempArray[minCounter]=array[i];
                minCounter++;
            }
            else if(array[i]>pivot){
                tempArray[maxCounter]=array[i];
                maxCounter--;
            }
            else{
                midCounter++;
            }
        }
        for (int i = minCounter; i <minCounter+midCounter ; i++) {
            tempArray[i]=pivot;
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=tempArray[i];
        }
    }
}
