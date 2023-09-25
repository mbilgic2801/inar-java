package week6;
public class Question_06_24 {
    public static void main(String[] args) {
        System.out.println(time() + "   " + date());
    }
    public static String time() {
        String time = "";
        String amOrPm = "AM";
        int timeOffset = 3;
        long totalMilliseconds = System.currentTimeMillis();
        long second = totalMilliseconds / 1000 % 60;
        long minute = totalMilliseconds / (1000 * 60) % 60;
        long hour = (totalMilliseconds / (1000 * 60 * 60) + timeOffset) % 24;
        if (hour > 12) {
            hour -= 12;
            amOrPm = "PM";
        }
        time = "" + hour + ":" + minute + ":" + second + " " + amOrPm;
        return time;
    }
    public static String date() {
        int day=1;
        int month=1;
        int year=1970;
        long days = System.currentTimeMillis() / (1000 * 60 * 60 * 24);
        while (days > 0) {
            if (days >= getNumberOfDaysInMonth(year, month)) {
                days -= getNumberOfDaysInMonth(year, month);
                if (month == 12) {
                    month = 1;
                    year++;
                }
                else {
                    month++;
                }
            }
            else {
                day += days;
                days = 0;
            }
        }
        String date = month + " / " + day + " / " + year;
        return date;
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
            //Şubat ayı için
            return isLeapYear(year) ? 29 : 28;

    }
    }

