package week9;

import java.sql.SQLOutput;
import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random random=new Random(1000);
        System.out.println("Random Numbers are:\n");
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100)+" ");
            if(i%10==9){
                System.out.println();
            }
        }

    }
}
