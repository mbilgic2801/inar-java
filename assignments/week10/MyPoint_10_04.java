package week10;

public class MyPoint_10_04 {
    double x;
    double y;

    MyPoint_10_04() {
        x = 0;
        y = 0;
    }

    MyPoint_10_04(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(MyPoint_10_04 point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
