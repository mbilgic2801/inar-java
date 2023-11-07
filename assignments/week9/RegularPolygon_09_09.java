package week9;

public class RegularPolygon_09_09 {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    RegularPolygon_09_09() {

    }

    RegularPolygon_09_09(int n, double side) {
        this.n = n;
        this.side = side;
    }

    RegularPolygon_09_09(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x=x;
        this.y=y;
    }

    double getPerimeter(){
        return n*side;
    }
    double getArea(){
        return n*side*side/(4*Math.tan(Math.PI/n));
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
