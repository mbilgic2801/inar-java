package week4;

import java.util.Scanner;

public class Question_04_19 {
    public static void main(String[] args) {
        // get a nine digit ISBN as a String
        // calculate the tenth digit of ISBN number
        // give output of ten digit ISBN as a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as a String: ");
        String numberOfISBN = input.next();
        int lastDigit = (Integer.parseInt(numberOfISBN.substring(0,1))+
                        Integer.parseInt(numberOfISBN.substring(1,2))*2+
                        Integer.parseInt(numberOfISBN.substring(2,3))*3+
                        Integer.parseInt(numberOfISBN.substring(3,4))*4+
                        Integer.parseInt(numberOfISBN.substring(4,5))*5+
                        Integer.parseInt(numberOfISBN.substring(5,6))*6+
                        Integer.parseInt(numberOfISBN.substring(6,7))*7+
                        Integer.parseInt(numberOfISBN.substring(7,8))*8+
                        Integer.parseInt(numberOfISBN.substring(8))*9)%11;
        numberOfISBN = numberOfISBN + (lastDigit == 10 ? "X" : lastDigit);
        System.out.printf("The ISBN number is %s",numberOfISBN);



    }
}
