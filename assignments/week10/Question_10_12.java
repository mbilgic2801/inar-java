package week10;

import week11.Triangle;

public class Question_10_12 {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint_10_04(2.5, 2), new MyPoint_10_04(4.2, 3), new MyPoint_10_04(5, 3.5));
        System.out.println("Area of t1------>"+t1.getArea());
        System.out.println("Perimeter of t1------>"+t1.getPerimeter());
        System.out.println("Does t1 contains point(3,3)----->"+t1.contains(new MyPoint_10_04(3,3)));
        System.out.println("Does t1 contains t2------>"+t1.contains(new Triangle2D(new MyPoint_10_04(2.9,2),new MyPoint_10_04(4,1),new MyPoint_10_04(1,3.4))));
        System.out.println("Does t1 overlaps t2------->"+t1.overlaps(new Triangle2D(new MyPoint_10_04(2,5.5),new MyPoint_10_04(4,-3),new MyPoint_10_04(2,6.5))));
    }
}
