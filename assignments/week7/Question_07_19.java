package week7;

import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter list: ");
        int arrayLength=input.nextInt();
        int[] array=new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        System.out.printf("The list is %s sorted",isSorted(array)?"already":"not");
    }

    private static boolean isSorted(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            for(int j=i;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
