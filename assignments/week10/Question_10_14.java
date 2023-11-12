package week10;

import java.util.GregorianCalendar;

public class Question_10_14 {
    public static void main(String[] args) {

        MyDate_10_14 date1 = new MyDate_10_14();
        System.out.println("Date1: "+date1.toString());
        MyDate_10_14 date2 = new MyDate_10_14(34355555133101L);
        System.out.println("Date2: " + date2.toString());
        MyDate_10_14 date3 = new MyDate_10_14(561555550000L);
        System.out.println("Date3: " + date3.toString());
    }
}
