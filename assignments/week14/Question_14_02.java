package week14;

import java.util.ArrayList;
import java.util.Collections;

public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int a = (int) (Math.random() * 100);
            list.add(a);
        }
        System.out.println("Generated Arraylist:\n" + list.toString());
        list = sortAndRemoveDuplicates(list);
        System.out.println("ArrayList after removing duplicates:" + list.toString());
    }

    public static ArrayList sortAndRemoveDuplicates(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        int temp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (temp != list.get(i)) {
                temp = list.get(i);
                list1.add(temp);
            }
        }
        return list1;
    }
}
