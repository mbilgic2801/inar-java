package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        System.out.print("Enter a list of integers ending with 0: ");
        while (true) {
            int a = input.nextInt();
            if (a == 0) {
                break;
            }
            list.add(a);
        }
        int n= list.size();
        System.out.println("Before sorting..");
        System.out.println(list.toString());
        for (int i = 0; i < n; i++) {
            temp.add(getMin(list));
            list.remove(getMin(list));
        }

        //System.out.println(list.toString());
       // System.out.println(temp.toString());
        list=temp;
        System.out.println("After sorting..");
        System.out.println(list.toString());
    }

    public static Integer getMin(ArrayList<Integer> list) {
            int n= list.size();
            int min= list.get(0);
        for (int i = 1; i < n; i++) {
            if(min> list.get(i)){
                min= list.get(i);
            }
        }
        return min;
    }
}

