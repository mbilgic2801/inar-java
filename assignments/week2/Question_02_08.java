package week2;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int timeOffset = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long second = totalMilliseconds / 1000 % 60;
        long minute = totalMilliseconds / ( 1000 * 60 ) % 60 ;
        long hour = (totalMilliseconds / ( 1000 * 60 * 60 ) + timeOffset )% 24;
        System.out.println("The current time is " + hour + ":" + minute + ":" + second);
    }
}
