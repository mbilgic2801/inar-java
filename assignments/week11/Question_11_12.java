package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Double> list=new ArrayList<>();
        System.out.print("Enter a list of doubles ending with 0: ");
        while (true) {
            double a = input.nextDouble();
            if (a == 0) {
                break;
            }
            list.add(a);
        }
        System.out.println("Sum of list: "+sum(list));
    }

    private static Double sum(ArrayList<Double> list) {
        double sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        return sum;
    }
}
