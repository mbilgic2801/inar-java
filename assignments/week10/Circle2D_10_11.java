package week10;

public class Circle2D_10_11 {
    double x;
    double y;
    double radius;

    public Circle2D_10_11() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D_10_11(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        return radius >= Math.sqrt((Math.pow(this.x - x, 2)) + (Math.pow(this.y - y, 2)));
    }

    public boolean contains(Circle2D_10_11 circle) {
        return radius >= Math.sqrt((Math.pow(circle.x - x, 2)) + (Math.pow(circle.y - y, 2))) + circle.radius;
    }

    public boolean overlaps(Circle2D_10_11 circle) {
        return radius + circle.radius > Math.sqrt((Math.pow(circle.x - x, 2)) + (Math.pow(circle.y - y, 2))) + circle.radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Radius: " + radius;
    }
}
