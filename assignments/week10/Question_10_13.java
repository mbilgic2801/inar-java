package week10;

import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;

public class Question_10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1=new MyRectangle2D(2,2,5.5,4.9);
        System.out.println("Area of r1------>"+r1.getArea());
        System.out.println("Perimeter of r1------>"+r1.getPerimeter());
        System.out.println("Does r1 contains p(3,3)----->"+r1.contains(3,3));
        System.out.println("Does r1 contains r2------>"+r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println("Does r1 overlaps r2------>"+r1.contains(new MyRectangle2D(3,5,2.3,5.4)));

    }


}
