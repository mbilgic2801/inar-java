package week6;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long millis = input.nextLong();
        System.out.printf("hours:minutes:seconds: %s", convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        long hours = millis / (1000 * 60 * 60);
        millis -= hours * (1000 * 60 * 60);
        long minutes = millis/(1000*60);
        millis -= minutes*(1000*60);
        long seconds=millis/1000;
        return hours+":"+minutes+":"+seconds;

    }
}
