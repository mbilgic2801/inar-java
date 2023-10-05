package week7;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numbers=new int[10];
        System.out.print("Enter ten numbers to exclude from random (1-54): ");

        for(int i=0;i< numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        System.out.println("Number generated: "+generateRandomNumber(numbers,1,54));
    }
    public static int generateRandomNumber(int[] array,int start,int end){
        int randomNumber=(int)(Math.random()*54)+1;
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if(randomNumber!=array[i]){
                counter++;
            }
        }
        if(counter==array.length){
            return randomNumber;
        }
        return generateRandomNumber(array,start,end);
    }
}
