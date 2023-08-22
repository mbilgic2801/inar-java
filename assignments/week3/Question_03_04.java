package week3;

import java.util.Scanner;

public class Question_03_04 {
    public static void main(String[] args) {


            int monthNumber = (int)( Math.random() * 12 + 1);

            switch (monthNumber % 12){
                case 0 :
                    System.out.println(monthNumber + "\nDecember"); break;
                case 1 :
                    System.out.println(monthNumber + "\nJanuary"); break;
                case 2 :
                    System.out.println(monthNumber + "\nFebruary"); break;
                case 3 :
                    System.out.println(monthNumber + "\nMarch"); break;
                case 4 :
                    System.out.println(monthNumber + "\nApril"); break;
                case 5 :
                    System.out.println(monthNumber + "\nMay"); break;
                case 6 :
                    System.out.println(monthNumber + "\nJune"); break;
                case 7 :
                    System.out.println(monthNumber + "\nJuly"); break;
                case 8 :
                    System.out.println(monthNumber + "\nAugust"); break;
                case 9 :
                    System.out.println(monthNumber + "\nSeptember"); break;
                case 10 :
                    System.out.println(monthNumber + "\nNovember"); break;
                case 11 :
                    System.out.println(monthNumber + "\nOctober"); break;
            }

    }
}
