package week10;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint_10_04 a=new MyPoint_10_04();
        MyPoint_10_04 b=new MyPoint_10_04(10,30.5);
        System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1f) is : %f",a.x,a.y,b.x,b.y,a.distance(b));
    }
}
