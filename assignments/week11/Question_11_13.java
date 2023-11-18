package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        list=getRemovedDuplicates(list);
        System.out.print("\nThe distinct integers are " +list.toString());
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> temp=new ArrayList<>();
        int n= list.size();
        System.out.print("\nThe distinct integers are " +list.toString());

        for (int i = 0; i < n; i++) {
            if(!temp.contains(list.get(i))){
                System.out.print(list.get(i)+" ");
                temp.add(list.get(i));
            }
        }
    }
    public static ArrayList<Integer> getRemovedDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> temp=new ArrayList<>();
        int n= list.size();
        System.out.print("The distinct integers are ");

        for (int i = 0; i < n; i++) {
            if(!temp.contains(list.get(i))){
                System.out.print(list.get(i)+" ");
                temp.add(list.get(i));
            }
        }
        return temp;
    }

}
