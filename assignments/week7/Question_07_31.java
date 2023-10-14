package week7;

import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list1: ");
        int firstArrayLength=input.nextInt();
        int[] array1=new int[firstArrayLength];
        for (int i = 0; i < array1.length; i++) {
            array1[i]=input.nextInt();
        }
        System.out.print("Enter list2: ");
        int secondArrayLength=input.nextInt();
        int[] array2=new int[secondArrayLength];
        for (int i = 0; i < array2.length; i++) {
            array2[i]=input.nextInt();
        }
       // int[] array1={1,4,2,7,3,78,12,2,3};
       // int[] array2={23,12,45,1,2,13,4,3,78};
       // printArray(array1);
       // printArray(array2);


        int[] array3=mergeArrays(array1,array2);
        printArray(array1);
        printArray(array2);
        printArray(array3);
    }

    private static int[] mergeArrays(int[] array1, int[] array2) {
        int[] array=new int[array1.length+array2.length];

        for(int i=0;i<array1.length;i++){
            array[i]=array1[i];
        }
        for(int i= array1.length,j=0;i< array.length;i++,j++){
            array[i]=array2[j];
        }
        sort(array);
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int[] array){
        for (int j= array.length-1; j>=0;j--) {

            for (int k = 0; k < j; k++) {
                int temp=array[k];
                if(array[k]>array[k+1]){
                    array[k]=array[k+1];
                    array[k+1]=temp;
                }
            }

        }
    }
}
