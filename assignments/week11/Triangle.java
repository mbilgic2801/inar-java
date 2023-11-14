package week11;

public class Triangle extends GeometricObject{
    double side1=1;
    double side2=1;
    double side3=1;

    String color;
    boolean isFilled;

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        double s = ( side1 + side2 + side3 ) / 2;
        double area = Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5);
        return area;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return "Triangle:side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
    }
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
