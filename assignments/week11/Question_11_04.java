package week11;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a sequence of numbers ending with 0: ");
        ArrayList<Integer> list=new ArrayList<>();
        while(true) {
            int a = input.nextInt();
            if(a==0) break;
            list.add(a);
        }
        System.out.println("The largest number in the list is "+max(list));
    }
    public static Integer max(ArrayList<Integer> list){
        int max= list.get(0);
        if(list.size()==0){
            return null;
        }

        for (int i = 1; i < list.size(); i++) {
            if(max< list.get(i)){
                max= list.get(i);
            }
        }
        return max;
    }
}
