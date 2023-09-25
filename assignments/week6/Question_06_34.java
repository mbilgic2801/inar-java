package week6;

import java.util.Scanner;

public class Question_06_34 {
    public static void main(String[] args) {
       /* Scanner input=new Scanner(System.in);
        System.out.print("Enter year: ");
        int year=input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month=input.nextInt();

        */
        for (int i=1;i<=12;i++) {
            printTheMonth(2023, i);
            System.out.println();
        }
    }
    public static void printTheMonth(int year,int month){
        printHeader(year,month);
        printDays(year,month);
    }
    public static void printHeader(int year,int month){
        System.out.printf("           %s    %d\n",getMonthName(month),year);
        System.out.printf("--------------------------------\n");
        System.out.printf("Sun   Mon   Tue   Wed   Thu   Fri   Sat\n");

    }
    public static void printDays(int year,int month){
        for (int i=(zeller(year,month)+6)%7;i>0;i--){
            System.out.printf("%-6s"," ");
        }
        for(int i=1;i<=getNumberOfDaysInMonth(year,month);i++){
            System.out.printf("%-6d",i);
            if((i+zeller(year,month)-1)%7==0){
                System.out.println();
            }
        }


    }
    public static String getMonthName(int month){
        switch (month){
            case 1: return  "January";
            case 2: return  "February";
            case 3: return  "March";
            case 4: return  "April";
            case 5: return  "May";
            case 6: return  "June";
            case 7: return  "July";
            case 8: return  "August";
            case 9: return  "September";
            case 10:return  "November";
            case 11:return  "October";
            case 12:return  "December";

        }
        return null;
    }
    public static int zeller(int year,int month){
        //h=(q+26(m+1)/10+k+k/4+j/4+5j)%7 Zeller's Congruence
        int q=1;//day of the month
        int m=month;//the month
        int k=year%100;//year of the century
        int j=year/100;//the century
        int h= (q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
        return h;
    }
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        //Şubat ayı için
        return isLeapYear(year) ? 29 : 28;

    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    }

