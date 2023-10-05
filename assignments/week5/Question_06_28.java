package week5;

import java.util.Scanner;

public class Question_06_28 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year=input.nextInt();
        System.out.print("Enter first day of the year: ");
        int day=input.nextInt();
        boolean isLeapYear=(year%4==0&&year%100==0)||(year%400==0);

        for(int i=1;i<=12;i++){
            String nameOfDay="";

            if(day%7==1) {nameOfDay="Monday";}
            if(day%7==2) {nameOfDay="Tuesday";}
            if(day%7==3) {nameOfDay="Wednesday";}
            if(day%7==4) {nameOfDay="Thursday";}
            if(day%7==5) {nameOfDay="Friday";}
            if(day%7==6) {nameOfDay="Saturday";}
            if(day%7==0) {nameOfDay="Sunday";}
            switch (i){
                case 1:{
                    System.out.printf("January 1, %d is %s",year,nameOfDay);
                    day += 31;
                    break;
                }
                case 2:{
                    System.out.printf("February 1, %d is %s",year,nameOfDay);
                    if(isLeapYear)
                        day += 29;
                    else day += 28;
                break;
                }
                case 3:{
                    System.out.printf("March 1, %d is %s",year,nameOfDay);
                    day += 31;
                break;
                }
                case 4:{
                    System.out.printf("April 1, %d is %s",year,nameOfDay);
                    day += 30;
                break;
                }
                case 5:{
                    System.out.printf("May 1, %d is %s",year,nameOfDay);
                    day += 31;
                break;
                }
                case 6:{
                    System.out.printf("June 1, %d is %s",year,nameOfDay);
                    day += 30;
                break;
                }
                case 7:{
                    System.out.printf("July 1, %d is %s",year,nameOfDay);
                    day += 31;
                break;
                }
                case 8:{
                    System.out.printf("August 1, %d is %s",year,nameOfDay);
                    day += 31;
                break;
                }
                case 9:{
                    System.out.printf("September 1, %d is %s",year,nameOfDay);
                    day += 30;
                break;
                }
                case 10:{
                    System.out.printf("November 1, %d is %s",year,nameOfDay);
                    day += 31;
                break;
                }
                case 11:{
                    System.out.printf("October 1, %d is %s",year,nameOfDay);
                    day += 30;
                break;
                }
                case 12:{
                    System.out.printf("December 1, %d is %s",year,nameOfDay);
                    day += 31;
                break;
                }
            }
            System.out.println();
        }
    }
}
