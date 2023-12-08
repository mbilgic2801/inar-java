package week14;

class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compareTo(Point p1) {
        if (this.x != p1.x) {
            return Double.compare(this.x, p1.x);
        } else {
            return Double.compare(this.y, p1.y);
        }
    }
}