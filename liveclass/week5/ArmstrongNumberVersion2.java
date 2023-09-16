package week5;

import java.util.Scanner;

public class ArmstrongNumberVersion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int number = 1; number < 1000000000; number++) {

            String textNumber = "" + number;
            int controlValue = 0;

            for (int i = 0; i < textNumber.length(); i++) {
                controlValue += (int) Math.pow(Integer.parseInt("" + textNumber.charAt(i)), textNumber.length());
            }
            if (number == controlValue) {
                System.out.printf("%d is an Armstrong number\n",number);
            }
        }
    }
}
