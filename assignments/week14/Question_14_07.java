package week14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_14_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*100));
        }
        System.out.println("Generated List: "+ list.toString());
        System.out.println("What is the 2. greatest number?");
        System.out.println("The 2nd largest element is: "+SecondLargestElement(list));

    }

    private static int SecondLargestElement(ArrayList<Integer> list) {
        ArrayList<Integer> temp=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            temp.add(list.get(i));
        }
        Collections.sort(temp);
        return temp.get(temp.size()-2);
    }
}
