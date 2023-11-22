package week10;

import week8.CommonMethods;

public class Triangle2D {
    public MyPoint_10_04 p1;
    public MyPoint_10_04 p2;
    public MyPoint_10_04 p3;


    public Triangle2D(MyPoint_10_04 p1, MyPoint_10_04 p2, MyPoint_10_04 p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle2D() {
        this.p1 = new MyPoint_10_04(0, 0);
        this.p2 = new MyPoint_10_04(1, 1);
        this.p3 = new MyPoint_10_04(2, 5);
    }

    public MyPoint_10_04 getP1() {
        return p1;
    }

    public void setP1(MyPoint_10_04 p1) {
        this.p1 = p1;
    }

    public MyPoint_10_04 getP2() {
        return p2;
    }

    public void setP2(MyPoint_10_04 p2) {
        this.p2 = p2;
    }

    public MyPoint_10_04 getP3() {
        return p3;
    }

    public void setP3(MyPoint_10_04 p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double sideP1P2 = p1.distance(p2);
        double sideP2P3 = p2.distance(p3);
        double sideP3P1 = p3.distance(p1);
        double s = (sideP1P2 + sideP2P3 + sideP3P1) / 2;
        double area = Math.pow((s * (s - sideP1P2) * (s - sideP2P3) * (s - sideP3P1)), 0.5);
        return area;
    }

    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public boolean contains(MyPoint_10_04 p) {
        double bx = p2.x - p1.x;
        double by = p2.y - p1.y;
        double cx = p3.x - p1.x;
        double cy = p3.y - p1.y;
        double x = p.x - p1.x;
        double y = p.y - p1.y;
        double d = bx * cy - cx * by;
        double WA = (x * (by - cy) + y * (cx - bx) + bx * cy - cx * by) / d;
        double WB = (x * cy - y * cx) / d;
        double WC = (y * bx - x * by) / d;
        return WA<1&&WB<1&&WC<1&&WA>0&&WB>0&&WC>0;
    }
    public boolean contains(Triangle2D t){
        return contains(t.getP1())&&contains(t.getP2())&&contains(t.getP3());
    }
    public boolean overlaps(Triangle2D t){
        return true;//to be continued
    }

}
