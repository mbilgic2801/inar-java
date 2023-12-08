package week14;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size 'n' for ArrayList A: ");
        int sizeA = input.nextInt();
        System.out.print("Enter " + sizeA + "Integers for ArrayList A: ");
        for (int i = 0; i < sizeA; i++) {
            listA.add(input.nextInt());
        }
        System.out.println();
        System.out.print("Enter the size 'n' for ArrayList B: ");
        int sizeB = input.nextInt();
        System.out.print("Enter " + sizeB + "Integers for ArrayList B: ");
        for (int i = 0; i < sizeB; i++) {
            listB.add(input.nextInt());
        }
        ArrayList<Integer> listC = mergeAndSort(listA, listB);
        System.out.println("Merged and sorted ArrayList C: \n" + listC.toString());
    }

    private static ArrayList<Integer> mergeAndSort(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        for (int i = 0; i < listB.size(); i++) {
            listA.add(listB.get(i));
        }
        return Question_14_02.sortAndRemoveDuplicates(listA);
    }
}
