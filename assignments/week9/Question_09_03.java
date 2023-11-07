package week9;

import java.util.Date;

public class Question_09_03 {
    public static void main(String[] args) {
        Date date=new Date(0);
        for (long i = 0,j=10000; i < 8; i++,j*=10) {
            date=new Date(j);
            System.out.printf("For elapsed time %d time is %s\n",j,date.toString());
        }

    }
}
