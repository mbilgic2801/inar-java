package week3;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the the time zone offset to GMT: ");
        int timeOffset = input.nextInt();
        long millis = System.currentTimeMillis();
        long totalSeconds = millis/1000;
        long totalMinutes = totalSeconds/60;
        long totalHours = totalMinutes/60;
        int second = (int) totalSeconds % 60;
        int minute = (int) totalMinutes % 60;
        int hour = (int) (totalHours+timeOffset) % 24;
        boolean isPM = hour >= 12;
        hour = isPM ? hour - 12 : hour;

        System.out.println( ( ( hour<10 ) ? "0" + hour : hour ) + ":"
                           + ( ( minute<10 ) ? "0" + minute : minute ) + ":"
                           + ( ( second<10 ) ? "0" + second : second ) + ":"
                           + ( isPM ? " PM" : " AM" ) );

    }
}
