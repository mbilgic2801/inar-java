package week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        //0 23 0 3234 2 46 93 0 20 0 02 59 -1
        System.out.println("Enter integers for ArrayList nums(enter -1 to stop):");
        int number = input.nextInt();

        while (number >= 0) {
            if (number == 0) {
                counter++;
            } else {
                list.add(number);
            }
            number = input.nextInt();
        }
        for (int i = 0; i < counter; i++) {
            list.add(0);
        }
        System.out.println("ArrayList after moving zeros to the end:\n" + list.toString());
    }
}
