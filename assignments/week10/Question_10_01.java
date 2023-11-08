package week10;

import java.util.Date;

public class Question_10_01 {
    public static void main(String[] args) {
        Time_10_01 timeA=new Time_10_01();
        Time_10_01 timeB=new Time_10_01(555550000);
        System.out.println(timeA.toString());
        System.out.println(timeB.toString());
        Date a=new Date();
        System.out.println(a.toString());
    }
}
