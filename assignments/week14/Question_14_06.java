package week14;

import java.util.ArrayList;

public class Question_14_06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Original List: "+list.toString());
        list=rearrangeList(list);
        System.out.println("Rearranged List: "+list.toString());
    }

    private static ArrayList<Integer> rearrangeList(ArrayList<Integer> list) {
        ArrayList<Integer> evens=new ArrayList<>();
        ArrayList<Integer> odds=new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i)%2==0){
                evens.add(list.get(i));
            }
            else {
                odds.add(list.get(i));
            }
        }
        for (int i = 0; i < evens.size(); i++) {
            odds.add(evens.get(i));
        }
        return odds;
    }
}
