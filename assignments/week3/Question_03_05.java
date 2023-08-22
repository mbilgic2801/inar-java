package week3;

import java.util.Scanner;

public class Question_03_05 {
    public static void main(String[] args) {
        int dayOfToday;
        int numberOfElapse;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        dayOfToday = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        numberOfElapse = input.nextInt();
        switch ( dayOfToday % 7 ){
            case 0:
                System.out.print("Today is Sunday and the future day is "); break;
            case 1:
                System.out.print("Today is Monday and the future day is "); break;
            case 2:
                System.out.print("Today is Tuesday and the future day is "); break;
            case 3:
                System.out.print("Today is Wednesday and the future day is "); break;
            case 4:
                System.out.print("Today is Thursday and the future day is "); break;
            case 5:
                System.out.print("Today is Friday and the future day is "); break;
            case 6:
                System.out.print("Today is Saturday and the future day is "); break;
        }
        switch ( ( dayOfToday + numberOfElapse ) % 7 ){
            case 0:
                System.out.println("Sunday"); break;
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
        }


    }
}
