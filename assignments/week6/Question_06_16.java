package week6;

public class Question_06_16 {
    public static void main(String[] args) {
        System.out.println("Year      Days in year  ");
        for(int i=2000;i<=2020;i++){
            System.out.printf("%d%13d\n",i,numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0) && ( year % 100 != 0 )  || (year % 400 == 0)) {
            return 366;
        }
        return 365;

    }
}
