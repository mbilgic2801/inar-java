package week4;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city1;
        String city2;
        String city3;
        String order1="";
        String order2="";
        String order3="";
        System.out.print("Enter the first city: ");
        city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        city3 = input.nextLine();
        if(city1.compareTo(city2)<0) {
            if (city1.compareTo(city3)<0) {
                order1 = city1;
                if (city2.compareTo(city3) < 0) {
                    order2 = city2;
                    order3 = city3;
                }
                else {
                    order2 = city3;
                    order3 = city2;
                }
            }
            else {
                order1 = city3;
                order2 = city1;
                }
            }
        else{
            if (city2.compareTo(city3)<0) {
                order1 = city2;
                if (city1.compareTo(city3) < 0) {
                    order2 = city1;
                    order3 = city3;
                }
                else {
                    order2 = city3;
                    order3 = city1;
                }
            }
            else {
                order1 = city3;
                order2 = city2;
            }
        }
        System.out.printf("\nThe three cities in alphabetical order are %s %s %s",order1,order2,order3);
        }

    }

