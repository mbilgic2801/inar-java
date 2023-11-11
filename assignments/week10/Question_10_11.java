package week10;

public class Question_10_11 {
    public static void main(String[] args) {
        Circle2D_10_11 circle1=new Circle2D_10_11(2,2,5.5);
        System.out.println("Circle1 area: "+circle1.getArea());
        System.out.println("Circle perimeter: "+ circle1.getPerimeter());
        System.out.println("Does Circle1 contain the point (3,3)? -->"+circle1.contains(3,3));
        System.out.println("Does Circle1 contain the circle centered at (4,5) and radius 10.5? -->"+circle1.contains(new Circle2D_10_11(4,5,10.5)));
        System.out.println("Does Circle1 overlap the circle centered at (4,5) and radius 10.5? -->"+circle1.overlaps(new Circle2D_10_11(3,5,2.3)));
    }
}
