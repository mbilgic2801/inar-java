package week4;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month;
        int year;
        boolean isLeapYear;
        System.out.print("Enter a year: ");
        year = input.nextInt();
        isLeapYear = ((year % 4 == 0) && ( year % 100 != 0 ) ) || (year % 400 == 0) ;
        System.out.print("Enter a month: ");
        month = input.next();
        if(month.equals("Jan"))
            System.out.printf("%s %d has 31 days",month,year);
        if(month.equals("Feb")) {
            if(isLeapYear)
                System.out.printf("%s %d has 29 days", month, year);
            else
                System.out.printf("%s %d has 28 days", month, year);
        }
        if(month.equals("Mar"))
            System.out.printf("%s %d has 31 days",month,year);
        if(month.equals("Apr"))
            System.out.printf("%s %d has 30 days",month,year);
        if(month.equals("May"))
            System.out.printf("%s %d has 31 days",month,year);
        if(month.equals("Jun"))
            System.out.printf("%s %d has 30 days",month,year);
        if(month.equals("Jul"))
            System.out.printf("%s %d has 31 days",month,year);
        if(month.equals("Aug"))
            System.out.printf("%s %d has 31 days",month,year);
        if(month.equals("Sep"))
            System.out.printf("%s %d has 30 days",month,year);
        if(month.equals("Nov"))
            System.out.printf("%s %d has 31 days",month,year);
        if(month.equals("Oct"))
            System.out.printf("%s %d has 30 days",month,year);
        if(month.equals("Dec"))
            System.out.printf("%s %d has 31 days",month,year);

    }
}
