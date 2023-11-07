package week9;


import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar a=new GregorianCalendar();
        printDate(a);
        a.setTimeInMillis(1234567898765L);
        System.out.println("\nAfter setTime:");
        printDate(a);

    }
    public static void printDate(GregorianCalendar a){
        System.out.printf("Current year: %s\n",a.get(GregorianCalendar.YEAR));
        System.out.printf("Current month: %s\n",a.get(GregorianCalendar.MONTH));
        System.out.printf("Current day: %s\n",a.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
