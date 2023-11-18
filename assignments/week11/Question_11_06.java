package week11;

import week10.Circle2D_10_11;

import java.util.ArrayList;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> object=new ArrayList<>();
        object.add("Mehmet");
        object.add(new Date());
        object.add(new Circle2D_10_11());
        for (int i = 0; i < object.size(); i++) {
            System.out.println(object.get(i).toString());
            System.out.println("-----------------------");
        }
    }
}
