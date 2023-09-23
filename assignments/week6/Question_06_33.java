package week6;

public class Question_06_33 {
    public static void main(String[] args) {
        System.out.println("Current date and time is "+date(1, 1, 1970)+ "   " + time() );
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

    public static String date(int day, int month, int year) {

        long days = System.currentTimeMillis() / (1000 * 60 * 60 * 24);
        while (days > 0) {
            if (days >= getNumberOfDaysInMonth(year, month)) {
                days -= getNumberOfDaysInMonth(year, month);
                if (month == 12) {
                    month = 1;
                    year++;
                } else {
                    month++;
                }
            } else {
                day += days;
                days = 0;
            }
        }
        String date = whichMonth(month) + " " + day + ", " + year;
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
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 0;
    }
    public static String whichMonth(int num){
        return switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "November";
            case 11 -> "October";
            case 12 -> "December";
            default -> "";
        };
    }

}

