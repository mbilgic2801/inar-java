package week14;

import java.util.ArrayList;

public class Question_14_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0, j = 9; i < 10; i++, j--) {
            int number = (int) (Math.random() * 100);
            list1.add(number);
        }
        list2 = reverse(list1);
        System.out.println("Generated integers: " + list1.toString());
        System.out.println("Reversed list: " + list2.toString());

    }

    private static ArrayList<Integer> reverse(ArrayList<Integer> list1) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = list1.size()-1; i >= 0; i--) {
            list.add(list1.get(i));
        }
        return list;
    }
}
