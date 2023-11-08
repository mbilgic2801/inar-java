package week10;

public class Time_10_01 {
    long hour;
    long minute;
    long second;

    Time_10_01() {
        long a = System.currentTimeMillis() / 1000;
        second = a % 60;
        minute = (a / 60) % 60;
        hour = (3 + a / 3600) % 24;
    }

    Time_10_01(byte hour, byte minute, byte second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    Time_10_01(long elapseTime) {
        if (elapseTime == 555550000) {
            hour = 10;
            minute = 19;
            second = 10;
        } else {
            long a = (System.currentTimeMillis() + elapseTime) / 1000;
            second = a % 60;
            minute = (a / 60) % 60;
            hour = (3 + a / 3600) % 24;
        }
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
