package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("Enter a list of integers ending with 0: ");
        while (true){
            int a=input.nextInt();
            if(a==0){
                break;
            }
            list.add(a);
        }
        shuffle(list);
    }

    private static void shuffle(ArrayList<Integer> list) {
        int n= list.size();
        System.out.println("Before shuffling..");
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i)+" ");
        }
        ArrayList<Integer> tempList=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index=(int)(Math.random()* list.size());
            tempList.add(list.get(index));
            list.remove(index);
        }
        list=tempList;
        System.out.println("\nAfter shuffling..");
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
