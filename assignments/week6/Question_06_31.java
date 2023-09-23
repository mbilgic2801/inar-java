package week6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer:");
        long cardNumber = input.nextLong();
        System.out.printf("%d is %s", cardNumber, isValid(cardNumber) ? "valid" : "invalid");
        printCardNumbers();
    }

    public static boolean isValid(long number) {
        int sum = sumOfOddPlace(number) + sumOfDoubleEvenPlace(number);
        return sum % 10 == 0 && getSize(number) >= 13 && getSize(number) <= 16 && prefixMatched(number);
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        while (number > 0) {
            sum += getDigit((int) ((number / 10) % 10));
            number /= 100;
        }
        return sum;
    }

    public static int getDigit(int num) {
        int newNum = num * 2;
        if (newNum < 10) {
            return newNum;
        } else {
            return (newNum) / 10 + (newNum % 10);
        }
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (number > 0) {
            sum += (int) (number % 10);
            number /= 100;
        }
        return sum;
    }

    public static boolean prefixMatched(long number) {
        String str = "" + number;
        return str.startsWith("4") || str.startsWith("5") || str.startsWith("6") || str.startsWith("37");
    }

    public static int getSize(long number) {
        String str = "" + number;
        return str.length();
    }

    public static void printCardNumbers() {
        String str = "4388576018410705";
        while (str.length() < 17) {
            long cardNumber = Long.parseLong(str);
            if (isValid(cardNumber)) {
                System.out.println(cardNumber);
            }
            cardNumber++;
            str = "" + cardNumber;
        }
    }


}
